package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
 
public class TekstitilastointiaSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna){
        BorderPane asettelu = new BorderPane();
        TextArea tekstikentta = new TextArea();
        HBox tekstit = new HBox();
        
        Label kirjaimiaOsoitin = new Label();
        Label sanojaOsoitin = new Label();
        Label pisinSanaOsoitin = new Label();
        
        tekstit.setSpacing(10);
        tekstit.getChildren().add(kirjaimiaOsoitin);
        tekstit.getChildren().add(sanojaOsoitin);
        tekstit.getChildren().add(pisinSanaOsoitin);
        
        tekstikentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
        int merkkeja = uusiArvo.length();
        String[] palat = uusiArvo.split(" ");
        int sanoja = palat.length;
        String pisin = Arrays.stream(palat)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
        
        kirjaimiaOsoitin.setText("Kirjaimia: " + merkkeja);
        sanojaOsoitin.setText("Sanoja: " + sanoja);
        pisinSanaOsoitin.setText("Pisin sana on: " + pisin);
        });
        
        asettelu.setCenter(tekstikentta);
        asettelu.setBottom(tekstit);
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
 
 
    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }
 
}
 