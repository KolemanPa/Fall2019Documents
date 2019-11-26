
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theko
 */
public class MovingTextField extends Application{
    @Override
    public void start(Stage pStage){
        TextField txtField = new TextField();
       
        
        HBox hbox1 = new HBox(5);
        hbox1.setAlignment(Pos.CENTER);
        hbox1.getChildren().addAll(new Label("Text Field"), txtField);
        RadioButton rbLeft = new RadioButton("left");
        RadioButton rbCenter = new RadioButton("center");
        RadioButton rbRight = new RadioButton("right");
        
        HBox hbox2 = new HBox(5);
        hbox2.setAlignment(Pos.CENTER);
        hbox2.getChildren().addAll(rbLeft,rbCenter,rbRight);
        
        HBox hbox3 = new HBox(5);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
