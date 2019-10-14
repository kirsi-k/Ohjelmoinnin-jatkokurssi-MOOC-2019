package ristinolla;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application {
    
    private String vuoro;
    private ArrayList<Button> napit;
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        
        this.vuoro = "X";
        napit = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            napit.add(new Button(" "));
            napit.get(i).setFont(Font.font("Monospaced", 60));
        }
        
        BorderPane asettelu = new BorderPane();
        
        Label pelivuoro = new Label("Vuoro: " + this.vuoro);
        pelivuoro.setFont(Font.font("Monospaced", 40));
        asettelu.setTop(pelivuoro);
        
        GridPane pelilauta = new GridPane();
        
        for (int i = 0; i < 9; i++) {
            if (i < 3) pelilauta.add(napit.get(i), 0, i);
            else if (i > 2 && i < 6) pelilauta.add(napit.get(i), 1, i-3);
            else if (i > 5) pelilauta.add(napit.get(i), 2, i-6);
        }
        
        napit.stream().forEach(n -> n.setOnMouseClicked((event) -> {
            if (!pelivuoro.getText().equals("Loppu!")) {
                if (n.getText().equals(" ")) {
                    n.setText(vuoro);
                    vuoro = vaihdaVuoroa(vuoro);
                    pelivuoro.setText("Vuoro: " + vuoro);
                    if (ratkesiko() == true) pelivuoro.setText("Loppu!");
                }
            }
            
        }));
       
        asettelu.setCenter(pelilauta);
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }
    
    public String vaihdaVuoroa(String edellinen) {
        if (edellinen.equals("X")) {
            return "O";
        } else {
            return "X";
        }
    }
    public boolean ratkesiko() {
        if (napit.get(0).getText().equals(napit.get(1).getText()) && 
                napit.get(0).getText().equals(napit.get(2).getText()) && 
                !napit.get(0).getText().equals(" ")) return true;
        if (napit.get(3).getText().equals(napit.get(4).getText()) && 
                napit.get(3).getText().equals(napit.get(5).getText()) && 
                !napit.get(3).getText().equals(" ")) return true;
        if (napit.get(6).getText().equals(napit.get(7).getText()) && 
                napit.get(6).getText().equals(napit.get(8).getText()) && 
                !napit.get(6).getText().equals(" ")) return true;
        if (napit.get(0).getText().equals(napit.get(3).getText()) && 
                napit.get(0).getText().equals(napit.get(6).getText()) && 
                !napit.get(0).getText().equals(" ")) return true;
        if (napit.get(1).getText().equals(napit.get(4).getText()) && 
                napit.get(1).getText().equals(napit.get(7).getText()) && 
                !napit.get(1).getText().equals(" ")) return true;
        if (napit.get(2).getText().equals(napit.get(5).getText()) && 
                napit.get(2).getText().equals(napit.get(8).getText()) && 
                !napit.get(2).getText().equals(" ")) return true;
        if (napit.get(0).getText().equals(napit.get(4).getText()) && 
                napit.get(0).getText().equals(napit.get(8).getText()) && 
                !napit.get(0).getText().equals(" ")) return true;
        if (napit.get(2).getText().equals(napit.get(4).getText()) && 
                napit.get(2).getText().equals(napit.get(5).getText()) && 
                !napit.get(2).getText().equals(" ")) return true;
        else return false;
    }
}
