/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vikas
 */
public class Dictionary {
    private ArrayList<String> words;
    private HashMap<String,String> dictionary;
    
    public Dictionary() {
        this.words = new ArrayList<>();
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String meaning) {
        this.words.add(word);
        this.dictionary.put(word, meaning);
    }
    
    public String getTranslation(String word) {
        return this.dictionary.get(word);
    }
    
    public String getWord(int index) {
        return words.get(index);
    }
    
    public int size() {
        return words.size();    
    }
}
