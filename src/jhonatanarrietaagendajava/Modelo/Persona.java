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
public class Persona {
  

    // propiedades
    private String nombre;
    private String apellido;
    private String genero = "Masculino";
    private Date fechaNacimiento;
    private String email;
    private String telefono;
    private String direccion;
    private BufferedImage foto;
    private String Password;

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    private String id;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Funcion informativa

    public String devolverDatos() {
        java.util.GregorianCalendar Calendario = new java.util.GregorianCalendar();
        Calendario.setTime(this.getFechaNacimiento());
        int año = Calendario.get(Calendario.YEAR);
        int mes = Calendario.get(Calendario.MONTH);
        int dia = Calendario.get(Calendario.DAY_OF_MONTH);
        String fechaNac = dia + " " + mes + " " + año;

        String datos = "---------------------\n";
        datos = datos + "ID:	" + this.getId() + "\n";
        datos = datos + "Nombre:	" + this.getNombre() + "\n";
        datos = datos + "Apellido:	" + this.getApellido() + "\n";
        datos += "Fecha	de	Nacimiento:	" + fechaNac + "\n";
        datos += "Genero:	" + this.getGenero() + "\n";
        datos += "Email:	" + this.getEmail() + "\n";
        datos += "Telefono:	" + this.getTelefono() + "\n";
        datos += "Direccion:	" + this.getDireccion() + "\n";
        return datos;
    }

    @Override
    public String toString() {
        return this.devolverDatos();
    }
}
