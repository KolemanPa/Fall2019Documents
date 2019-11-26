
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application{
    public void start(Stage pStage){
        Text text = new Text(40,40,"Programming is fun");
        Pane pane = new Pane(text);
        
        // HBox for 4 butons
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hbox = new HBox(btUp,btDown,btLeft,btRight);
        hbox.setAlignment(Pos.CENTER);
        
        BorderPane bPane = new BorderPane(pane);
        bPane.setBottom(hbox);
        
        //create and register a handler
        btUp.setOnAction((e)->{
               text.setY(text.getY()> 10 ? text.getY() -5 : 10);
        });
        
              
        btDown.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent e){
               text.setY(text.getY()< pane.getHeight() ? text.getY() +5 : pane.getHeight());
           }
        });        
        
        
        
        btLeft.setOnAction(e->{
               text.setX(text.getX()> 0 ? text.getX() -5 : 0);
//               
//               double newX;
//               if (text.getX() > 0)
//               {
//                   newX = text.getX() -5;
//               }
//               else
//                   newX = 0;
//               text.setX(newX);
           
        });
        
        btRight.setOnAction(e->{
               text.setX(text.getX() < pane.getWidth()-100 ? text.getX() +5 : pane.getWidth() -100);
        });
        
        
        Scene scene = new Scene(bPane, 400, 350);
        pStage.setTitle("HELLO");
        pStage.setScene(scene);
        pStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args); 
    }
    
}
