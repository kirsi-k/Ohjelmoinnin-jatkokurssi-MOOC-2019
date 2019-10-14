package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class HymioSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna){
        
        BorderPane asettelu = new BorderPane();

        Canvas piirtoalusta = new Canvas(640,480);
        asettelu.setCenter(piirtoalusta);
        
         GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
         
         piirturi.fillRect(200, 50, 50, 50);
         piirturi.fillRect(350, 50, 50, 50);
         piirturi.fillArc(200, 200, 200, 170, 180, 180, ArcType.OPEN);
         
         Scene nakyma = new Scene(asettelu);
         ikkuna.setScene(nakyma);
         ikkuna.show();
    }


    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

}
