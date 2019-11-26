/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        
        // Create a rectangle
        Rectangle rectangle = new Rectangle(0,0,25,50);
        rectangle.setFill(Color.GREENYELLOW);
        
        //create a circle
        Circle circle = new Circle(125,100,50);
        
        
    } 


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
