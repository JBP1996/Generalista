/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Article;

/**
 *
 * @author JBP1996 Atec
 */
public class Stock {
    ArrayList<Article> articles;
    
    public Stock(ArrayList<Article> articles){
        super();
        this.articles=articles;
    }

    public Stock() {
        articles = new ArrayList();
    }
    
    public void addArticles(Article a){
        this.articles.add(a);
    }
    
    
}
