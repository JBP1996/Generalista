/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Stock;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author JBP1996 Atec
 */
public class FArticle extends Scene{
    Group gp;
    Stock stk;
    
    public FArticle(Stock stk,double width, double height) {
        super(new Group(), width, height);
        
        gp = (Group) this.getRoot();
        this.stk = stk;
        init();    
    }
    
    private void init(){
        GridPane grid= new GridPane();
    
        Label lb1 = new Label("Nome");
        TextField tf1 = new TextField();
        grid.add(lb1,0,0); grid.add(tf1,1,0);
        
        Label lb2 = new Label("Preco");
        TextField tf2 = new TextField();
        grid.add(lb2,0,1); grid.add(tf2,1,1);
        
        Label lb3 = new Label("Descricao");
        TextField tf3 = new TextField();
        grid.add(lb3,0,2); grid.add(tf3,1,2);
        
        Button bt = new Button("Gravar");
        grid.add(bt,1,3);
        
        grid.setHgap(10); grid.setVgap(10);
        
        bt.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                System.out.println(" Nome="+tf1.getText()+
                    "\n Preco="+tf2.getText()+
                    "\n Descricao="+tf3.getText());
                
            }
        });
        gp.getChildren().add(grid);
    }
    
}
