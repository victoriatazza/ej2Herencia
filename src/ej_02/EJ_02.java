/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_02;

import entidades.Lavadora;
import entidades.Televisor;

/**
 *
 * @author rembe
 */
public class EJ_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Lavadora lavadora1 = new Lavadora(20, null, "azul", 'A', 20); //$2500
//        Electrodomestico lavadora2 = new Lavadora(40, 1000.0, "amarillo", "R", 90); //2600
//        System.out.println(lavadora1);
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();

        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
    }

}
