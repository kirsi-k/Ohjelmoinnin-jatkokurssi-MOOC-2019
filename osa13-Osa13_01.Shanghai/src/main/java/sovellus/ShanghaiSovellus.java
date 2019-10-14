package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna){
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 4);
        NumberAxis yAkseli = new NumberAxis();

        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");
        
        XYChart.Series HYData = new XYChart.Series();
        HYData.getData().add(new XYChart.Data(2007, 73));
        HYData.getData().add(new XYChart.Data(2008, 68));
        HYData.getData().add(new XYChart.Data(2009, 72));
        HYData.getData().add(new XYChart.Data(2010, 72));
        HYData.getData().add(new XYChart.Data(2011, 74));
        HYData.getData().add(new XYChart.Data(2012, 73));
        HYData.getData().add(new XYChart.Data(2013, 76));
        HYData.getData().add(new XYChart.Data(2014, 73));
        HYData.getData().add(new XYChart.Data(2015, 67));
        HYData.getData().add(new XYChart.Data(2016, 56));
        HYData.getData().add(new XYChart.Data(2017, 56));
        
        viivakaavio.getData().add(HYData);
        
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }

}
