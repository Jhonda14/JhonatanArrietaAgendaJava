/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhonatanarrietaagendajava.Modelo;

/**
 *
 * @author SP
 */
public class Invitacion {

    // propiedades
    private Evento elEvento;
    private Persona elInvitado;
    private boolean estado;
    private Persona quienInvita;

    public Evento getElEvento() {
        return elEvento;
    }

    public void setElEvento(Evento elEvento) {
        this.elEvento = elEvento;
    }

    public Persona getElInvitado() {
        return elInvitado;
    }

    public void setElInvitado(Persona elInvitado) {
        this.elInvitado = elInvitado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Persona getQuienInvita() {
        return quienInvita;
    }

    public void setQuienInvita(Persona quienInvita) {
        this.quienInvita = quienInvita;
    }

}
