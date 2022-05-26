/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhonatanarrietaagendajava.vistas;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;
import jhonatanarrietaagendajava.vistas.Personas.Eventos.VentanaAgregarEventos;
import jhonatanarrietaagendajava.vistas.Personas.VentanaAgregarPersonas;

/**
 *
 * @author jhornda
 */
public class VentanaPrincipal extends JFrame {

    private JMenuBar barraDeMenu;

    //Todas las variables del Menu sesion
    private JMenu menuSesion;
    private JMenuItem opcionMenuIniciarSesion;
    private JMenuItem opcionMenuCerrarSesion;
    private JMenuItem opcionMenuSalirSesion;

    //Todas las variables del menu Persona
    private JMenu menuPersona;
    private JMenuItem opcionMenuAgregarPersona;
    private JMenuItem opcionMenuBuscarPersona;
    private JMenuItem opcionMenuBorrarPersona;
    private JMenuItem opcionMenuEditarPersona;
    //submenuListarPersonas
    private JMenu subMenuListarPersonas;
    private JMenuItem opcionListarPersonaPorNombre;
    private JMenuItem opcionListarPersonaPorApellido;
    private JMenuItem opcionListarPersonaPorGenero;
    private JMenuItem opcionListarPersonaPorFechaDeNacimiento;
    private JMenuItem opcionListarPersonaPorEvento;
    //submenu Estadisticas Personas
    private JMenu subMenuEstadisticasPersonas;
    private JMenuItem opcionEstadisticasMasInvitadas;
    private JMenuItem opcionEstadisticasMasFaltantes;
    private JMenuItem opcionEstadisticasMayorAsistencia;
    private JMenuItem opcionEstadisticasPromedioEdadPorGenero;

    //Todas las variables de menu eventos
    private JMenu menuEvento;
    private JMenuItem opcionMenuAgregarEvento;
    private JMenuItem opcionMenuBuscarEvento;
    private JMenuItem opcionMenuBorrarEvento;
    private JMenuItem opcionMenuEditarEvento;
    //subMenu de listas de Eventos
    private JMenu subMenuListarEventos;
    private JMenuItem opcionListarEventoPorPersona;
    private JMenuItem opcionListarEventoPorFecha;
    //subMenu de Estadisticas de eventos
    private JMenu subMenuEstadisticasDeEventos;
    private JMenuItem opcionEstadisticasPromedioPorFechas;
    private JMenuItem opcionEstadisticasPromedioDeAsistentesYFaltantes;
    private JMenuItem opcoinEstadisticasPromedioMayoresAsistenciaYAusencia;
    private JMenuItem opcionEstadisticasPromedioMasLargoYMasCorto;
    private JMenu menuInvitacion;
    private JMenu menuAyuda;
    
    //menu Invitacion
    private JMenu menuInvitaciones;
    private JMenuItem opcionMenuAgregarInvitaciones;
    private JMenuItem opcionMenuBuscarInvitaciones;
    private JMenuItem opcionMenuBorrarInvitaciones;
    private JMenuItem opcionMenuEditarInvitaciones;
    private JMenu subMenuListarInvitaciones;
    private JMenuItem opcionListarInvitacionesPorPersona;
    private JMenuItem opcionListarInvitacionesPorEvento;
    private JMenuItem opcionEstaditicas;
    

    public VentanaPrincipal() {

        this.configurar();
    }

    public void configurar() {

        //Barra de Menu
        this.barraDeMenu = new JMenuBar();
        this.setJMenuBar(barraDeMenu);

        //Menu sesion
        this.menuSesion = new JMenu("Sesión");
        this.menuSesion.setMnemonic(KeyEvent.VK_S);
        this.barraDeMenu.add(menuSesion);
        this.opcionMenuIniciarSesion = new JMenuItem("Iniciar...");
        this.opcionMenuCerrarSesion = new JMenuItem("Cerrar...");
        this.opcionMenuSalirSesion = new JMenuItem("Salir...");
        this.menuSesion.add(opcionMenuIniciarSesion);
        this.menuSesion.add(opcionMenuCerrarSesion);
        this.menuSesion.add(opcionMenuSalirSesion);

        //Menu persona
        this.menuPersona = new JMenu("Persona");
        this.barraDeMenu.add(menuPersona);
        this.menuPersona.setMnemonic(KeyEvent.VK_P);
        this.opcionMenuAgregarPersona = new JMenuItem("Agregar...");
        this.opcionMenuBuscarPersona = new JMenuItem("Buscar...");
        this.opcionMenuBorrarPersona = new JMenuItem("Borrar...");
        this.opcionMenuEditarPersona = new JMenuItem("Editar...");
        this.menuPersona.add(opcionMenuAgregarPersona);
        this.menuPersona.add(opcionMenuBuscarPersona);
        this.menuPersona.add(opcionMenuBorrarPersona);
        this.menuPersona.add(opcionMenuEditarPersona);
        //SubMenu de listados contenido en el menu personas
        this.subMenuListarPersonas = new JMenu("Listar...");
        this.menuPersona.add(subMenuListarPersonas);
        this.opcionListarPersonaPorNombre = new JMenuItem("  Por Nombre...");
        this.opcionListarPersonaPorApellido = new JMenuItem("  Por Apellido...");
        this.opcionListarPersonaPorFechaDeNacimiento = new JMenuItem("  Por Fecha De Nacimiento...");
        this.opcionListarPersonaPorGenero = new JMenuItem("  Por Genero...");
        this.opcionListarPersonaPorEvento = new JMenuItem("  Por Evento...");
        this.subMenuListarPersonas.add(opcionListarPersonaPorNombre);
        this.subMenuListarPersonas.add(opcionListarPersonaPorApellido);
        this.subMenuListarPersonas.add(opcionListarPersonaPorFechaDeNacimiento);
        this.subMenuListarPersonas.add(opcionListarPersonaPorGenero);
        this.subMenuListarPersonas.add(opcionListarPersonaPorEvento);
        //SubMenu de estadisticas contenido en el menu personas 
        this.subMenuEstadisticasPersonas = new JMenu("Estadisticas...");
        this.menuPersona.add(subMenuEstadisticasPersonas);
        this.opcionEstadisticasMayorAsistencia = new JMenuItem("  Mayor Asistencia...");
        this.opcionEstadisticasMasFaltantes = new JMenuItem("  Mas Faltantes...");
        this.opcionEstadisticasMasInvitadas = new JMenuItem("  Mas Invitadas...");
        this.opcionEstadisticasPromedioEdadPorGenero = new JMenuItem("  Promedio De Edad Por Genero...");
        this.subMenuEstadisticasPersonas.add(opcionEstadisticasMayorAsistencia);
        this.subMenuEstadisticasPersonas.add(opcionEstadisticasMasFaltantes);
        this.subMenuEstadisticasPersonas.add(opcionEstadisticasMasInvitadas);
        this.subMenuEstadisticasPersonas.add(opcionEstadisticasPromedioEdadPorGenero);

        //Menu Eventos
        this.menuEvento = new JMenu("Eventos");
        this:barraDeMenu.add(menuEvento);
        this.menuEvento.setMnemonic(KeyEvent.VK_E);
        this.opcionMenuAgregarEvento = new JMenuItem("Agregar...");
        this.opcionMenuBuscarEvento = new JMenuItem("Buscar...");
        this.opcionMenuBorrarEvento = new JMenuItem("Borrar...");
        this.opcionMenuEditarEvento = new JMenuItem("Editar...");
        this.menuEvento.add(opcionMenuAgregarEvento);
        this.menuEvento.add(opcionMenuBuscarEvento);
        this.menuEvento.add(opcionMenuBorrarEvento);
        this.menuEvento.add(opcionMenuEditarEvento);
        //subMenu Listar eventos contenido en el menu evento
        this.subMenuListarEventos = new JMenu("Listar...");
        this.menuEvento.add(subMenuListarEventos);
        this.opcionListarEventoPorPersona = new JMenuItem("  Por Persona...");
        this.opcionListarEventoPorFecha = new JMenuItem("  Por Fecha...");
        this.subMenuListarEventos.add(opcionListarEventoPorPersona);
        this.subMenuListarEventos.add(opcionListarEventoPorFecha);
        //subMenu Estadisticas de eventos contenido en el menu evento
        this.subMenuEstadisticasDeEventos = new JMenu("Estadisticas...");
        this.menuEvento.add(subMenuEstadisticasDeEventos);
        this.opcionEstadisticasPromedioPorFechas = new JMenuItem("  Promedio Por Fecha...");
        this.opcionEstadisticasPromedioDeAsistentesYFaltantes = new JMenuItem("  Promedio De Asistentes Y Faltantes...");
        this.opcoinEstadisticasPromedioMayoresAsistenciaYAusencia = new JMenuItem("  Promedio Mayor Asistencia Y Ausencia...");
        this.opcionEstadisticasPromedioMasLargoYMasCorto = new JMenuItem("  Promedio Mas Largo Y Mas Corto...");
        this.subMenuEstadisticasDeEventos.add(opcionEstadisticasPromedioPorFechas);
        this.subMenuEstadisticasDeEventos.add(opcionEstadisticasPromedioDeAsistentesYFaltantes);
        this.subMenuEstadisticasDeEventos.add(opcoinEstadisticasPromedioMayoresAsistenciaYAusencia);
        this.subMenuEstadisticasDeEventos.add(opcionEstadisticasPromedioMasLargoYMasCorto);
        
        this.menuInvitaciones = new JMenu("Invitaciones");
        this.barraDeMenu.add(menuInvitaciones);
        this.menuInvitaciones.setMnemonic(KeyEvent.VK_I);
        this.opcionMenuAgregarInvitaciones = new JMenuItem("Agregar...");
        this.opcionMenuBorrarInvitaciones =  new JMenuItem("Borrar...");
        this.opcionMenuBuscarInvitaciones = new JMenuItem("Buscar...");
        this.opcionMenuEditarInvitaciones = new JMenuItem("Editar...");
        this.subMenuListarInvitaciones = new JMenu("Listar...");
        this.opcionListarInvitacionesPorPersona = new JMenuItem("  Por Persona...");
        this.opcionListarInvitacionesPorEvento = new JMenuItem("  Por Evento...");
        this.opcionEstaditicas = new JMenuItem("Estadisticas");
        this.menuInvitaciones.add(opcionMenuAgregarInvitaciones);
        this.menuInvitaciones.add(opcionMenuBorrarInvitaciones);
        this.menuInvitaciones.add(opcionMenuBuscarInvitaciones);
        this.menuInvitaciones.add(opcionMenuEditarInvitaciones);
        this.menuInvitaciones.add(subMenuListarInvitaciones);
        this.subMenuListarInvitaciones.add(opcionListarInvitacionesPorPersona);
        this.subMenuListarInvitaciones.add(opcionListarInvitacionesPorEvento);
        this.menuInvitaciones.add(opcionEstaditicas);

        ActionListener accionAgregarEvento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                mostrarVentanaAgregarEvento(evento);
            }
        };
        this.opcionMenuAgregarEvento.addActionListener(accionAgregarEvento);
        this.opcionMenuAgregarPersona.addActionListener(accionAgregarPersona);

    }
    public void mostrarVentanaAgregarEvento(ActionEvent evento) {
        VentanaAgregarEventos VentanaAE = new VentanaAgregarEventos(this);
        VentanaAE.setLocationRelativeTo(null);
        VentanaAE.setVisible(true);
    }
    
    ActionListener accionAgregarPersona = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                mostrarVentanaAgregarPersona(evento);
            }
        };

    

    public void mostrarVentanaAgregarPersona(ActionEvent evento) {
        VentanaAgregarPersonas VentanaAP = new VentanaAgregarPersonas(this);
        VentanaAP.setLocationRelativeTo(null);
        VentanaAP.setVisible(true);
    }
    
        
}




