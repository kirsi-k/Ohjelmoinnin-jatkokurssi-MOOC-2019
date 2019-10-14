package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application {
    
    @Override
    public void start (Stage ikkuna){
        TextField tekstikentta = new TextField();
        Label teksti = new Label();
        Button nappi = new Button("Päivitä");
        
        nappi.setOnAction((event) -> {
            teksti.setText(tekstikentta.getText());
        });
        
        VBox komponentit = new VBox();
        komponentit.setSpacing(10);
        komponentit.getChildren().addAll(tekstikentta, nappi, teksti);
        
        Scene nakyma = new Scene(komponentit);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
