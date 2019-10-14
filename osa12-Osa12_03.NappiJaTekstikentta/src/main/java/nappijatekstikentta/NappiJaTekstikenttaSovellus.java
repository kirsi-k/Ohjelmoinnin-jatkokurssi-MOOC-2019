package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstikenttaSovellus extends Application{

    @Override
    public void start(Stage ikkuna){
        Button nappi = new Button("Nappi");
        TextField teksti = new TextField("Tässä on jotain tekstiä");
        
        FlowPane komponentit = new FlowPane();
        komponentit.getChildren().add(nappi);
        komponentit.getChildren().add(teksti);
        
        Scene nakyma = new Scene(komponentit);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
