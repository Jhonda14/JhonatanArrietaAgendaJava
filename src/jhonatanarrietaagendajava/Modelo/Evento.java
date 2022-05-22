/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhonatanarrietaagendajava.Modelo;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author SP
 */
public class Evento {

    // propiedades
    private String id;
    private String nombre;
    private Date fechaDeRegistro;
    private Date fechaDeInicio;
    private Date fechaDeFin;
    private String tipo;
    private String categoria;
    private String lugar;
    private Persona contacto;
    private BufferedImage imagenes[] = new BufferedImage[12];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public BufferedImage[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(BufferedImage[] imagenes) {
        this.imagenes = imagenes;
    }

    public String devolverDatos() {
        java.util.GregorianCalendar Calendario = new java.util.GregorianCalendar();
        Calendario.setTime(this.getFechaDeRegistro());
        int año = Calendario.get(Calendario.YEAR);
        int mes = Calendario.get(Calendario.MONTH);
        int dia = Calendario.get(Calendario.DAY_OF_MONTH);
        String fechaRegistro = dia + " " + mes + " " + año;

        java.util.GregorianCalendar Calendario2 = new java.util.GregorianCalendar();
        Calendario.setTime(this.getFechaDeInicio());
        int añoIni = Calendario2.get(Calendario.YEAR);
        int mesIni = Calendario2.get(Calendario.MONTH);
        int diaIni = Calendario2.get(Calendario.DAY_OF_MONTH);
        String fechaInicio = dia + " " + mes + " " + año;

        java.util.GregorianCalendar Calendario3 = new java.util.GregorianCalendar();
        Calendario.setTime(this.getFechaDeRegistro());
        int añofin = Calendario3.get(Calendario.YEAR);
        int mesfin = Calendario3.get(Calendario.MONTH);
        int diafin = Calendario3.get(Calendario.DAY_OF_MONTH);
        String fechaFin = dia + " " + mes + " " + año;

        String datos = "---------------------\n";
        datos = datos + "ID:	" + this.getId() + "\n";
        datos = datos + "Nombre:	" + this.getNombre() + "\n";
        datos = datos + "Tipo:	" + this.getTipo()+ "\n";
        datos += "Fecha	de	Registro:	" + fechaRegistro + "\n";
        datos += "Fecha	de	Inicio:	" + fechaInicio + "\n";
        datos += "Fecha	de	Fin:	" + fechaFin + "\n";
        datos += "Categoria:	" + this.getCategoria()+ "\n";
        datos += "Lugar:	" + this.getLugar()+ "\n";
        datos += "Contacto:	" + this.getContacto()+ "\n";
        return datos;
    }

    @Override
    public String toString() {
        return this.devolverDatos();
    }

}
