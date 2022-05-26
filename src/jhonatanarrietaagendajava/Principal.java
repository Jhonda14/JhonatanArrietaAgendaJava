/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jhonatanarrietaagendajava;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JDialog;
import jhonatanarrietaagendajava.vistas.Personas.VentanaAgregarPersonas;
import jhonatanarrietaagendajava.vistas.VentanaPrincipal;

/**
 *
 * @author jhond
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal Ventana = new VentanaPrincipal();
        Ventana.setTitle(": : : Agenda Electronica : : :");
        Ventana.setLocationRelativeTo(null);
        Ventana.setExtendedState(MAXIMIZED_BOTH);
        Ventana.setVisible(true);

    }

}
