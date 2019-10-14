package nappijatekstielementti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class NappiJaTekstielementtiSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna){
        Button nappi = new Button("Nappi");
        Label teksti = new Label("Tässä on jotain tekstiä");
        
        FlowPane komponentit = new FlowPane();
        komponentit.getChildren().add(nappi);
        komponentit.getChildren().add(teksti);
        
        Scene nakyma = new Scene(komponentit);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
