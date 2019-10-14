package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;


public class KayttajanOtsikko extends Application {
    
    @Override
    public void start(Stage ikkuna){
        Parameters params = getParameters();
        String kayttajanOtsikko = params.getNamed().get("kayttajanOtsikko");
        
        ikkuna.setTitle(kayttajanOtsikko);
        ikkuna.show();
    }


}
