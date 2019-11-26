
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RaceCarProject extends Application{
    @Override
    public void start(Stage pStage){
        Circle rWheel = new Circle(75);
        rWheel.relocate(750,550);
        Rectangle car = new Rectangle(650,300);
        car.relocate(150,250);
        Rectangle fCar = new Rectangle(325,150);
        fCar.relocate(700,400);        
        
        Pane pane = new Pane(rWheel,car,fCar);
        Button btRight = new Button("Right");
        Button btLeft = new Button("Left");
        HBox hbox = new HBox(btRight);
        
        hbox.setAlignment(Pos.CENTER);
        

        

        

        BorderPane bPane = new BorderPane(pane);
        bPane.setBottom(hbox);
        

        
        Scene scene = new Scene(pane,1000,1000);        
        
        pStage.setTitle("Race Car");
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
