/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhonatanarrietaagendajava.Modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

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
        int mes = Calendario.get(Calendario.MONTH) + 1;
        int dia = Calendario.get(Calendario.DAY_OF_MONTH);
        String fechaNac = dia + " " + mes + " " + año;

        String datos = "---------------------\n";
        datos = datos + "ID:	" + this.getId() + "\n";
        datos = datos + "Nombre:	" + this.getNombre() + "\n";
        datos = datos + "Apellido:	" + this.getApellido() + "\n";
        datos += "Fecha de Nacimiento:	" + fechaNac + "\n";
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

    public void GuardarEnDisco() throws Exception {

        String nombreArchivo = "Personas.dat";
        Properties propiedadesSistema = System.getProperties();
        String directorioUsuario = propiedadesSistema.getProperty("user.home");
        directorioUsuario = directorioUsuario + File.pathSeparator + "agendajava_dart";
        System.out.println("RUTA: "+directorioUsuario);
        File carpetaDatos = new File(directorioUsuario);
        if (carpetaDatos.exists() == false) {
            System.out.println("CREANDO RUTA: "+directorioUsuario);
            carpetaDatos.mkdir();
            System.out.println("RUTA CREADA");
        }
        File archivoDatosPersona = new File(carpetaDatos, nombreArchivo);
        System.out.println("CREANDO EL ARCHIVO: "+archivoDatosPersona.getAbsolutePath());
        FileInputStream lectorDeArchivo = null;
        HashMap<String, Persona> lista = null;
        try {
            if (archivoDatosPersona.exists() == true) {
                lectorDeArchivo = new FileInputStream(archivoDatosPersona);
                ObjectInputStream lectorDeObjetos = new ObjectInputStream(lectorDeArchivo);
                lista = (HashMap<String, Persona>) lectorDeObjetos.readObject();
                System.out.println("lista = " + lista);
                lectorDeObjetos.close();
            }

        } catch (ClassNotFoundException error) {
            throw new Exception("Error al guardar la persona\n "
                    + "No se puede ubicar a una de las clases del programa\n"
                    + "Detalles:	"
                    + error.getMessage());
        } catch (IOException error) {
            throw new Exception("Error al guardar la persona\n"
                    + "No se puede leer del archivo la lista "
                    + "de personas existentes"
                    + "Detalles:	" + error.getMessage());
        }
        if (lista == null) {
            lista = new HashMap<String, Persona>();
            lista.put(this.id, this);
        } else if (lista.isEmpty() == true || lista.containsKey(this.id) == false) {
            lista.put(this.id, this);
        } else {
            throw new Exception("La Persona	con Id " + this.id
                    + " ya fue registrada en la agenda");
        }
        try {
            FileOutputStream escritorDeArchivo = new FileOutputStream(archivoDatosPersona);
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(escritorDeArchivo);
            escritorDeObjetos.writeObject(lista);
            escritorDeObjetos.close();
            escritorDeArchivo.close();
        } catch (IOException error) {
            throw new Exception("Error al guardar la persona\n" + "No se puede escribir la informacion en el archivo de datos\n"+ "Detalles: " + error.getMessage());
        }
        }
    }
