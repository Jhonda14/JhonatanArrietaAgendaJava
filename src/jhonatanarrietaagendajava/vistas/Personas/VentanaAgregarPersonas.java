/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhonatanarrietaagendajava.vistas.Personas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import jhonatanarrietaagendajava.Controladores.ControlPersona;
import jhonatanarrietaagendajava.vistas.VentanaPrincipal;

/**
 *
 * @author jhonda
 */
public class VentanaAgregarPersonas extends JDialog {
    // FUNCION	CONSTRUCTOR

    public VentanaAgregarPersonas(VentanaPrincipal ventanaPrincipal) {
        super(ventanaPrincipal);
        this.configurar();
    }
    //	PROPIEDADES
    private VentanaPrincipal ventanaPrincipal;
    private JPanel contenedorDeCampos;
    private JPanel contenedorParaLaFoto;
    private JLabel etiquetaTitulo;
    private JLabel etiquetaId;
    private JTextField campoId;

    public JComboBox getComboGenero() {
        return comboGenero;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public JFormattedTextField getCampoFechaDeNacimiento() {
        return campoFechaDeNacimiento;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public JTextArea getCajaDireccion() {
        return cajaDireccion;
    }

    public JTextField getCampoId() {
        return campoId;
    }
    private JLabel etiquetaNombre;
    private JTextField campoNombre;
    private JLabel etiquetaApellido;
    private JTextField campoApellido;
    private JLabel etiquetaFechaDeNacimiento;
    private JFormattedTextField campoFechaDeNacimiento;
    private JLabel etiquetaGenero;
    private JComboBox comboGenero;
    private JLabel etiquetaTelefono;
    private JTextField campoTelefono;
    private JLabel etiquetaEmail;
    private JTextField campoEmail;
    private JLabel etiquetaDireccion;
    private JScrollPane contenedorAreaDesplazamiento;
    private JTextArea cajaDireccion;
    private JButton botonAceptar;
    private JButton botonCancelar;

    public void configurar() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setModal(true);
        Container contendorDelaVentana = this.getContentPane();
        GridBagLayout gestorDiseñoVentana = new GridBagLayout();
        contendorDelaVentana.setLayout(gestorDiseñoVentana);
        contendorDelaVentana.setLayout(gestorDiseñoVentana);

        this.etiquetaTitulo = new JLabel();
        this.etiquetaTitulo.setText("FOMULARIO PARA AGREGAR UNA NUEVA PERSONA A LA AGENDA ");
        Font tipoDeLetra = new Font("Arial ", Font.PLAIN, 20);
        this.etiquetaTitulo.setFont(tipoDeLetra);
        this.etiquetaTitulo.setForeground(Color.BLUE);
        this.etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        this.contenedorDeCampos = new JPanel();
        this.contenedorDeCampos.setBorder(new TitledBorder("Ingrese los Datos de la nueva Persona:"));
        GridBagLayout diseñadorPanelDeDatos = new GridBagLayout();
        contenedorDeCampos.setLayout(diseñadorPanelDeDatos);
        //Dimension tamañoDeLosCompos = new Dimension(20, 80);
        this.etiquetaId = new JLabel("Id:");
        this.etiquetaId.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaId.setForeground(Color.BLACK);
        this.etiquetaId.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaNombre = new JLabel("Nombre:  ");
        this.etiquetaNombre.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaNombre.setForeground(Color.BLACK);
        this.etiquetaNombre.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaApellido = new JLabel("Apellido:");
        this.etiquetaApellido.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaApellido.setForeground(Color.BLACK);
        this.etiquetaApellido.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaFechaDeNacimiento = new JLabel("Fecha De Nacimiento:");
        this.etiquetaFechaDeNacimiento.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaFechaDeNacimiento.setForeground(Color.BLACK);
        this.etiquetaFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaGenero = new JLabel("Genero:");
        this.etiquetaGenero.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaGenero.setForeground(Color.BLACK);
        this.etiquetaGenero.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaEmail = new JLabel("Email:");
        this.etiquetaEmail.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaEmail.setForeground(Color.BLACK);
        this.etiquetaEmail.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaDireccion = new JLabel("Direccion:");
        this.etiquetaDireccion.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaDireccion.setForeground(Color.BLACK);
        this.etiquetaDireccion.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaTelefono = new JLabel("Telefono:");
        this.etiquetaTelefono.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaTelefono.setForeground(Color.BLACK);
        this.etiquetaTelefono.setHorizontalAlignment(SwingConstants.RIGHT);

        this.campoId = new JTextField();
        this.campoId.setFont(new Font("Calibri", 0, 14));
        this.campoId.setForeground(Color.BLACK);
        this.campoId.setHorizontalAlignment(SwingConstants.CENTER);
        this.campoId.setPreferredSize(new Dimension(200, 20));

        this.campoNombre = new JTextField();
        this.campoNombre.setFont(new Font("Calibri", 0, 14));
        this.campoNombre.setForeground(Color.BLACK);
        this.campoNombre.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoApellido = new JTextField();
        this.campoApellido.setFont(new Font("Calibri", 0, 14));
        this.campoApellido.setForeground(Color.BLACK);
        this.campoApellido.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoEmail = new JTextField();
        this.campoEmail.setFont(new Font("Calibri", 0, 14));
        this.campoEmail.setForeground(Color.BLACK);
        this.campoEmail.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoFechaDeNacimiento = new JFormattedTextField();
        this.campoFechaDeNacimiento.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeNacimiento.setForeground(Color.BLACK);
        this.campoFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);

        this.comboGenero = new JComboBox();
        this.comboGenero.setFont(new Font("Calibri", 0, 14));
        this.comboGenero.setForeground(Color.BLACK);
        this.comboGenero.addItem("-SELECCIONE-");
        this.comboGenero.addItem("Masculino");
        this.comboGenero.addItem("Femenino");
        

        this.cajaDireccion = new JTextArea();
        this.cajaDireccion.setFont(new Font("Calibri", 0, 14));
        this.cajaDireccion.setForeground(Color.BLACK);

        this.campoTelefono = new JFormattedTextField();
        this.campoTelefono.setFont(new Font("Calibri", 0, 14));
        this.campoTelefono.setForeground(Color.BLACK);
        this.campoTelefono.setHorizontalAlignment(SwingConstants.CENTER);

        this.contenedorParaLaFoto = new JPanel();
        this.contenedorParaLaFoto.setBorder(new TitledBorder("Foto:"));
        this.contenedorParaLaFoto.setPreferredSize(new Dimension(70, 70));

        this.botonAceptar = new JButton("Aceptar");
        this.botonAceptar.setPreferredSize(new Dimension(15, 20));

        this.botonCancelar = new JButton("Cancelar");
        this.botonCancelar.setPreferredSize(new Dimension(15, 20));

        this.agregarComponenteConReglas(this.etiquetaTitulo, contendorDelaVentana,
                0, 0, 3, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.FIRST_LINE_START,
                0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.contenedorDeCampos,
                contendorDelaVentana, 0, 1, 1, 2, GridBagConstraints.BOTH,
                GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 80, 150, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.contenedorParaLaFoto,
                contendorDelaVentana, 1, 1, 2, 1, GridBagConstraints.NONE,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 150, 100, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonAceptar, contendorDelaVentana,
                1, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.LAST_LINE_END, 0.5f,
                0.5f, 50, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonCancelar, contendorDelaVentana,
                2, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.LAST_LINE_END, 0.5f,
                0.5f, 50, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaId,
                this.contenedorDeCampos, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaNombre,
                this.contenedorDeCampos, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaApellido,
                this.contenedorDeCampos, 0, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaFechaDeNacimiento,
                this.contenedorDeCampos, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaGenero,
                this.contenedorDeCampos, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaDireccion,
                this.contenedorDeCampos, 0, 5, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaEmail,
                this.contenedorDeCampos, 0, 6, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaTelefono,
                this.contenedorDeCampos, 0, 7, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoId,
                this.contenedorDeCampos, 1, 0, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoNombre,
                this.contenedorDeCampos, 1, 1, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoApellido,
                this.contenedorDeCampos, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoFechaDeNacimiento,
                this.contenedorDeCampos, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.comboGenero,
                this.contenedorDeCampos, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.cajaDireccion,
                this.contenedorDeCampos, 1, 5, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoEmail,
                this.contenedorDeCampos, 1, 6, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoTelefono,
                this.contenedorDeCampos, 1, 7, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.pack();

        this.botonAceptar.setActionCommand("agregar_persona");
        ControlPersona controlador = new ControlPersona(this);
        this.botonAceptar.addActionListener(controlador);
        
        this.botonCancelar.setActionCommand("Cancelar_Accion");
        ControlPersona controlador2 = new ControlPersona(this);
        this.botonCancelar.addActionListener(controlador2);
        
        this.campoId.setActionCommand("Escribir_numeros");
        ControlPersona controlador3 = new ControlPersona(this);
        this.botonCancelar.addActionListener(controlador3);
        
        this.campoId.addActionListener(pasarElFoco(campoNombre));
         this.campoNombre.addActionListener(pasarElFoco(campoApellido));
         this.campoApellido.addActionListener(pasarElFoco(campoFechaDeNacimiento));
         this.campoFechaDeNacimiento.addActionListener(pasarElFoco(comboGenero));
         this.comboGenero.addActionListener(pasarElFoco(campoEmail));
         this.campoEmail.addActionListener(pasarElFoco(campoTelefono));
 
         
         

    }

    public ActionListener pasarElFoco(Component campo){
      
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(campo instanceof JComboBox){
                    ((JComboBox)campo).showPopup();
                }
                  campo.requestFocus();
            }
        };
    }
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void agregarComponenteConReglas(
            JComponent componente,
            Container contenedor,
            int fila,
            int columna,
            int numFilas,
            int numColumnas,
            int relleno,
            int anclado,
            float espaciadox,
            float especiadoy,
            int espacioX,
            int espacioY,
            int bordeSuperior,
            int bordeIzquierdo,
            int bordeInferior,
            int bordeDerecho
    ) {
        GridBagConstraints reglas = new GridBagConstraints();
        reglas.gridy = columna;
        reglas.gridx = fila;
        reglas.gridwidth = numFilas;
        reglas.gridheight = numColumnas;
        reglas.fill = relleno;
        reglas.anchor = anclado;
        reglas.weightx = espaciadox;
        reglas.weighty = especiadoy;
        reglas.ipadx = espacioX;
        reglas.ipady = espacioY;
        reglas.insets = new Insets(bordeSuperior, bordeIzquierdo, bordeInferior, bordeDerecho);
        GridBagLayout diseñador = (GridBagLayout) contenedor.getLayout();
        diseñador.setConstraints(componente, reglas);
        contenedor.add(componente);

    }
    

}
