package com.example.calculatorfx;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ResourceBundle;

public class Controller {
    private Label pantalla;


    double operador1;
    double operador2;
    double resultado;

    char tipoOperador;

    Modelo md= new Modelo();


    public Controller(Label pantalla){
        this.pantalla=pantalla;
    }


    public void manejarBotonNumerico(ActionEvent e) {
        pantalla.setText(pantalla.getText()+((Button) e.getSource()).getText());

    }

    public void manejarBotonOperacion(ActionEvent e) {
        md.setOperador1(Double.parseDouble(pantalla.getText()));
        md.setTipoOperator(((Button) e.getSource()).getText());
        pantalla.setText("");
    }

    public void manejarBotonResultado(ActionEvent e) {
        md.setOperador2(Double.parseDouble(pantalla.getText()));
        pantalla.setText(""+md.getResultado());

    }

    public void limpiar(ActionEvent e) {
        pantalla.setText("");
    }
}
