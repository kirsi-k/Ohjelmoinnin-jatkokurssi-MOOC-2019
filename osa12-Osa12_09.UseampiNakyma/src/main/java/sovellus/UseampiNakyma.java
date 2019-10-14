package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application{
    
    @Override
    public void start(Stage ikkuna){
        
        BorderPane ekaAsettelu = new BorderPane();
        Button ekaNappi = new Button("Tokaan näkymään!");
        Label ekaTeksti = new Label("Eka näkymä!");
        
        VBox tokaAsettelu = new VBox();
        Button tokaNappi = new Button("Kolmanteen näkymään!");
        Label tokaTeksti = new Label("Toka näkymä!");
        
        GridPane kolmasAsettelu = new GridPane();
        Button kolmasNappi = new Button("Ekaan näkymään!");
        Label kolmasTeksti = new Label("Kolmas näkymä!");
        
        ekaAsettelu.setTop(ekaTeksti);
        ekaAsettelu.setCenter(ekaNappi);
        
        tokaAsettelu.setSpacing(10);
        tokaAsettelu.getChildren().add(tokaNappi);
        tokaAsettelu.getChildren().add(tokaTeksti);
        
        kolmasAsettelu.add(kolmasTeksti,0,0);
        kolmasAsettelu.add(kolmasNappi,1,1);
        
        Scene eka = new Scene(ekaAsettelu);
        Scene toka = new Scene(tokaAsettelu);
        Scene kolmas = new Scene(kolmasAsettelu);
        
        ekaNappi.setOnAction((event) -> {
           ikkuna.setScene(toka); 
        });
        tokaNappi.setOnAction((event) -> {
           ikkuna.setScene(kolmas); 
        });
        kolmasNappi.setOnAction((event) -> {
           ikkuna.setScene(eka); 
        });
        
        ikkuna.setScene(eka);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }

}
