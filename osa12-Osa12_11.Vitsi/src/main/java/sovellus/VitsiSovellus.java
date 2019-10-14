package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) throws Exception {
       
        BorderPane asettelu = new BorderPane();
        
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20,20,20,20));
        valikko.setSpacing(10);
        
        Button ekaNappi = new Button("Vitsi");
        Button tokaNappi = new Button("Vastaus");
        Button kolmasNappi = new Button("Selitys");
        
        valikko.getChildren().addAll(ekaNappi, tokaNappi, kolmasNappi);
        asettelu.setTop(valikko);
        
        StackPane ekaAsettelu = luoNakyma("What do you call a bear with no teeth?");
        StackPane tokaAsettelu = luoNakyma("A gummy bear.");
        StackPane kolmasAsettelu = luoNakyma("Gums are the soft tissue surrounding teeth");
        
        ekaNappi.setOnAction((event) -> {
            asettelu.setCenter(ekaAsettelu);
        });
        tokaNappi.setOnAction((event) -> {
            asettelu.setCenter(tokaAsettelu);
        });
        kolmasNappi.setOnAction((event) -> {
            asettelu.setCenter(kolmasAsettelu);
        });
        
        asettelu.setCenter(ekaAsettelu);
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    private StackPane luoNakyma(String teksti) {

        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);

        return asettelu;
    }


    public static void main(String[] args) {
        launch(VitsiSovellus.class);
    }
}
