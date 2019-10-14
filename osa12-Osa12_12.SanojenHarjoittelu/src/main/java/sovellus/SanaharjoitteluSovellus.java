package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class SanaharjoitteluSovellus extends Application {
    
    private Sanakirja sanakirja;
    
    @Override
    public void init() throws Exception {
        this.sanakirja = new Sanakirja();
    }
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        HarjoitteluNakyma harjoittelunakyma = new HarjoitteluNakyma(sanakirja);
        SyottoNakyma syottonakyma = new SyottoNakyma(sanakirja);
        
        BorderPane asettelu = new BorderPane();
        
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20,20,20,20));
        valikko.setSpacing(10);
        
        Button lisaaNappi = new Button("Lisää sanoja");
        Button harjoitteleNappi = new Button("Harjoittele");
        
        valikko.getChildren().addAll(lisaaNappi, harjoitteleNappi);
        asettelu.setTop(valikko);
        
        lisaaNappi.setOnAction((event) -> {
            asettelu.setCenter(syottonakyma.getNakyma());
        });
        harjoitteleNappi.setOnAction((event) -> {
            asettelu.setCenter(harjoittelunakyma.getNakyma());
        });
        
        asettelu.setCenter(syottonakyma.getNakyma());
        
        Scene nakyma = new Scene(asettelu, 400, 300);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(SanaharjoitteluSovellus.class);
    }
}
