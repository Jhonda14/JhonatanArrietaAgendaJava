/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhonatanarrietaagendajava.Controladores;

import java.awt.KeyEventDispatcher;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import jhonatanarrietaagendajava.Modelo.Persona;
import jhonatanarrietaagendajava.vistas.Personas.VentanaAgregarPersonas;

/**
 *
 * @author jhonda
 */
public class ControlPersona implements ActionListener {

    private JDialog objetoVistaActual;
    private Persona objetoPersona;

    public ControlPersona(JDialog Ventana) {
        this.objetoVistaActual = Ventana;
    }

    public void actionPerformed(ActionEvent evento) {

        String comandoAccion = evento.getActionCommand();
        if (comandoAccion.equals("agregar_persona")) {
            this.accionAgregarPersona(evento);
        } else if (comandoAccion.equals("buscar_persona")) {
            this.accionBuscarPersona(evento);
        } else if (comandoAccion.equals("borrar_persona")) {
            this.accionBorrarPersona(evento);
        } else if (comandoAccion.equals("editar_persona")) {
            this.accionEditarPersona(evento);
        } else if (comandoAccion.equals("listar_persona")) {
            this.accionListarPersona(evento);
        } else if (comandoAccion.equals("Cancelar_Accion")) {
            this.accionBotonCancelar(evento);
        }

    }

    public void accionBuscarPersona(ActionEvent evento) {

    }

    public void accionBorrarPersona(ActionEvent evento) {

    }

    public void accionEditarPersona(ActionEvent evento) {

    }

    public void accionListarPersona(ActionEvent evento) {

    }

    public void accionAgregarPersona(ActionEvent evento) {

        VentanaAgregarPersonas vista = (VentanaAgregarPersonas) objetoVistaActual;
        String id = vista.getCampoId().getText();
        String nombre = vista.getCampoNombre().getText();
        String apellido = vista.getCampoApellido().getText();
        String genero = (String) vista.getComboGenero().getSelectedItem();
        String nacimiento = vista.getCampoFechaDeNacimiento().getText();
        String email = vista.getCampoEmail().getText();
        String telefono = vista.getCampoTelefono().getText();
        String direccion = vista.getCajaDireccion().getText();

        this.objetoPersona = new Persona();
        this.objetoPersona.setId(id);
        this.objetoPersona.setNombre(nombre);
        this.objetoPersona.setApellido(apellido);
        this.objetoPersona.setGenero(genero);

        boolean r = true;
        String Id = vista.getCampoId().getText().toString();
        String nombre2 = vista.getCampoNombre().getText().toString();
        try {
            Integer.parseInt(Id);
        } catch (Exception e) {
            vista.mostrarMensaje("EL ID DEBE SER NUMERI");
            return;
        }
//        do {
//            r = true;
//            for (int i = 0; i < id.length(); i++) {
//                char c = Id.charAt(i);
//                if (!Character.isDigit(c)) {
//                    r = false;
//                    break;
//                } else {
//                    r = true;
//                }
//            }
//            if (!r) {
//                vista.mostrarMensaje("Para poder continuar escriba solo numeros en el Id");
//            }
//            break;
//        } while (!r);
//
//        while (vista.getComboGenero().getSelectedIndex() == 0) {
//            vista.mostrarMensaje("Para poder continuar seleccione un genero");
//            return;
//        }

        while (vista.getComboGenero().getSelectedIndex() == 0) {
            vista.mostrarMensaje("Para poder continuar seleccione un genero");
            return;
        }
        Date fechaDeNacimiento = null;
        SimpleDateFormat formateadorDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {

            fechaDeNacimiento = formateadorDeFecha.parse(nacimiento);
            this.objetoPersona.setFechaNacimiento(fechaDeNacimiento);

        } catch (ParseException error) {
            vista.mostrarMensaje("Para poder continuar por favor digite una fecha valida ");
            return;
        }
        this.objetoPersona.setTelefono(telefono);
        this.objetoPersona.setEmail(email);
        this.objetoPersona.setDireccion(direccion);
        vista.mostrarMensaje("Se	 agrego la siguiente persona en la agenda:\n " + objetoPersona.devolverDatos());

        try {
            objetoPersona.GuardarEnDisco();
        } catch (Exception error) {
            vista.mostrarMensaje("Error al Guardar esta Persona\n"
                    + error.getMessage());
        }
        vista.mostrarMensaje("Se	agrego la persona"
                + objetoPersona.devolverDatos()
                + " en	la	agenda");

    }

    public void accionBotonCancelar(ActionEvent evento) {
        VentanaAgregarPersonas vista = (VentanaAgregarPersonas) objetoVistaActual;
        vista.dispose();
    }

}
