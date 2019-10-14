package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TervehtijaSovellus extends Application{
    
    @Override
    public void start (Stage ikkuna) throws Exception {
        
        Label ohjeteksti = new Label("Kirjoita nimesi ja aloita.");
        TextField nimikentta = new TextField();
        Button aloita = new Button("Aloita");
        
        GridPane asettelu = new GridPane();
        asettelu.add(ohjeteksti, 0, 0);
        asettelu.add(nimikentta, 0, 1);
        asettelu.add(aloita, 0, 2);
        
        asettelu.setPrefSize(300, 180);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(20, 20, 20, 20));
        
        Scene nimiNakyma = new Scene(asettelu);
        
        Label tervetuloaTeksti = new Label();
        
        StackPane tervetuloaAsettelu = new StackPane();
              
        tervetuloaAsettelu.setPrefSize(300, 180);
        tervetuloaAsettelu.getChildren().add(tervetuloaTeksti);
        tervetuloaAsettelu.setAlignment(Pos.CENTER);

        Scene tervetuloaNakyma = new Scene(tervetuloaAsettelu);
        
        aloita.setOnAction((event) -> {
            tervetuloaTeksti.setText("Tervetuloa " + nimikentta.getText() + "!");
            ikkuna.setScene(tervetuloaNakyma);
        });
        
        ikkuna.setScene(nimiNakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }
}
