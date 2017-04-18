/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author c0638820
 */
public class Word {
    private int wordId;
    private String title;
    
    public Word(){
        
    }

    public Word(int wordId, String title) {
        this.wordId = wordId;
        this.title = title;
    }
    
    public Word(JsonObject json){
    wordId = json.getInt("wordId", 0);
    title = json.getString("title", "");
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWordId() {
        return wordId;
    }

    public String getTitle() {
        return title;
    }
    
    public JsonObject toJson(){
    return Json.createObjectBuilder()
            //.add("wordId", wordId)     
            .add("title", title)
            .build();  
    }
}
