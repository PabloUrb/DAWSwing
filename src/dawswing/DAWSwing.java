/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawswing;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class DAWSwing {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {              // Aqui esta el main de todo que contiene el principal que es el que se arracara el primero
        // creamos el jfarame y lo mostramos              // permitira elegir entre las diferentes acciones que tiene la actividad
        //instanciamos un objeto principal
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        //lo havemos visible
        principal.setVisible(true);
    }
    static ArrayList<Prenda> ropa = new ArrayList<>();       //aqui declaramos el arraylist contal de que sea general para todo el package y podamos llamarlo
    static String color;                                     // aqui declaro dos variables que tendre que llamar a la hora de ver ventas
    static String talla;                                     //con tal de poder recogerlas en mostrar producto
    
}
