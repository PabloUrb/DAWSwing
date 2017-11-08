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
    public static void main(String[] args) {
        // creamos el jfarame y lo mostramos
        //instanciamos un objeto principal
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        //lo havemos visible
        principal.setVisible(true);
    }
    static ArrayList<Prenda> ropa = new ArrayList<>();
    
}
