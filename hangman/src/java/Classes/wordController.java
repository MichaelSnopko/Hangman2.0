/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;

/**
 *
 * @author c0661137
 */
@ApplicationScoped
public class wordController {
    private List<Word> words =new ArrayList<>();
    private Word currentWord = new Word();

    public wordController() {
        currentWord = new Word(0, "");
        getDBUtils();
    }
     private void getDBUtils() {

        try {
            words.clear();
            Connection conn = DBUtils.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM words");
            while (rs.next()) {
                Word w = new Word();
                w.setWordId(rs.getInt("wordId"));
                w.setTitle(rs.getString("title"));
                words.add(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(wordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public void persistToDb(Word w) {
        try {
            String sql = "";
            Connection conn = DBUtils.getConnection();
            if (w.getWordId() <= 0) {
                sql = "INSERT INTO words (title) VALUES (?)";
            } else {
                sql = "UPDATE words SET title = ? WHERE wordId = ?";
            }
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, w.getTitle());
            pstmt.executeUpdate();
             if (w.getWordId() > 0) {
                pstmt.setInt(5, w.getWordId());
            }
            if (w.getWordId() <= 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                w.setWordId(id);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(wordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Word> getAll() {
        return words;
    }

    public JsonArray getAllJson() {
        return null;
    }

    public Word getById(int id) {    
        Word result = null;
        for (Word w : words) {
            if (w.getWordId() == id) {
                result = w;
            }
        }
        return result;
    }

    public JsonObject getByIdJson(int id) {
        Word w = getById(id);
        if (w != null) {
            return w.toJson();
        } else {
            return null;
        }
    }

    public JsonArray getBySearchJson() {
        JsonArrayBuilder json = Json.createArrayBuilder();
        for (Word w : words) {
            json.add(w.toJson());
        }
        return json.build();
    }

    public JsonObject addJson(JsonObject json) {
        Word w = new Word(json);
         persistToDb(w);
        words.add(w);
        return w.toJson();
    }

    public JsonObject editJson(int id, JsonObject json) {
        return null;
    }
}
