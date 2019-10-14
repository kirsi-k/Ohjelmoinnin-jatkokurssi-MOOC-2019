package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {
    
    @Override
    public void start (Stage ikkuna){
        //Luodaan perusasettelun BorderPane ja sille padding
        BorderPane kayttoliittyma = new BorderPane();
        kayttoliittyma.setPadding(new Insets(10,10,10,10));
        
        //Luodaan yläasettelun liukureille VBox-pohja
        VBox sliderit = new VBox();
        
        //Luodaan ensimmäisen liukuriasettelun palaset
        Label tallennusteksti = new Label("Kuukausittainen tallennus");
        Slider tallennusliukuri = new Slider();
        tallennusliukuri.setMin(25);
        tallennusliukuri.setMax(250);
        tallennusliukuri.setSnapToTicks(true);
        tallennusliukuri.setBlockIncrement(500);
        tallennusliukuri.setShowTickMarks(true);
        tallennusliukuri.setShowTickLabels(true);
        Label liukurinarvo = new Label(Double.toString(tallennusliukuri.getValue()));
        
        //Asetetaan ensimmäisen liukuriasettelun palaset paikalleen BorderPaneen
        BorderPane ylempi = new BorderPane();
        ylempi.setLeft(tallennusteksti);
        ylempi.setCenter(tallennusliukuri);
        ylempi.setRight(liukurinarvo);
        
        //Luodaan toisen liukuriasettelun palaset
        Label korkoteksti = new Label("Vuosittainen korko");
        Slider korkoliukuri = new Slider();
        korkoliukuri.setMin(0);
        korkoliukuri.setMax(10);
        korkoliukuri.setMinorTickCount(10);
        korkoliukuri.setShowTickMarks(true);
        korkoliukuri.setShowTickLabels(true);
        Label tokanliukurinarvo = new Label(Double.toString(korkoliukuri.getValue()));
        
        //Asetetaan toisen liukuriasettelun palaset paikalleen BorderPaneen
        BorderPane alempi = new BorderPane();
        alempi.setLeft(korkoteksti);
        alempi.setCenter(korkoliukuri);
        alempi.setRight(tokanliukurinarvo);
        
        //Lisätään molemmat liukuriasettelut paikoilleen VBoxiin ja asetetaan niille sopiva väli
        sliderit.setSpacing(10);
        sliderit.getChildren().addAll(ylempi,alempi);
        
        //Luodaan x- ja y-akselit ja asetetaan x-akselille minimi, maksimi sekä välit
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();
        
        //Luodaan viivakaavio ja annetaan sille nimeksi Säästölaskuri
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setAnimated(false);
        viivakaavio.setLegendVisible(false);
        viivakaavio.setTitle("Säästölaskuri");
        
        //Asetetaan liukurit perusasettelussa ylös ja viivakaavio keskelle
        kayttoliittyma.setTop(sliderit);
        kayttoliittyma.setCenter(viivakaavio);
        
        //Luodaaan kuvaajat säästöille ja säästöille koroilla
        XYChart.Series saastot = new XYChart.Series();
        XYChart.Series saastotKoroilla = new XYChart.Series();
        
        //Lisätään kuvaajat viivakaavioon
        viivakaavio.getData().add(saastot);
        viivakaavio.getData().add(saastotKoroilla);
        
        //Lisätään toiminnallisuus tallennusliukuriin
        tallennusliukuri.setOnMouseReleased(e -> {
            liukurinarvo.setText("" + tallennusliukuri.getValue());
            paivitaKaavio(tallennusliukuri.getValue(), korkoliukuri.getValue(), saastot, saastotKoroilla);
        });
        
        //Lisätään toiminnallisuus korkoliukuriin
        korkoliukuri.setOnMouseReleased(e -> {
            String korkoString = "" + korkoliukuri.getValue();
            if (korkoString.length() > 4) {
                korkoString = korkoString.substring(0, 4);
            }
            tokanliukurinarvo.setText(korkoString);
            paivitaKaavio(tallennusliukuri.getValue(), korkoliukuri.getValue(), saastot, saastotKoroilla);
        });
        
        //Asetetaan asettelut näkymään ikkunassa
        Scene nakyma = new Scene(kayttoliittyma, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
    
    //Metodi kaavion päivittämistä varten, kun liukureiden arvoja muutetaan
    private void paivitaKaavio(double kuukausiSaasto, double korko, XYChart.Series saastot, XYChart.Series saastotKoroilla) {
        saastot.getData().clear();
        saastotKoroilla.getData().clear();

        saastot.getData().add(new XYChart.Data(0, 0));
        saastotKoroilla.getData().add(new XYChart.Data(0, 0));

        double edellinen = 0;

        for (int i = 1; i <= 30; i++) {
            saastot.getData().add(new XYChart.Data(i, i * kuukausiSaasto * 12));

            edellinen += kuukausiSaasto * 12;
            edellinen *= (1 + korko / 100.0);

            saastotKoroilla.getData().add(new XYChart.Data(i, edellinen));
        }
    }
    //Käynnistetään sovellus
    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

}
