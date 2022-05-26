



package jhonatanarrietaagendajava.vistas.Invitaciones;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import jhonatanarrietaagendajava.vistas.VentanaPrincipal;

/**
 *
 * @author jhonda
 */
public class VentanaAgregarInvitaciones extends JDialog {

    public VentanaAgregarInvitaciones(VentanaPrincipal ventanaPrincipal) {
        super(ventanaPrincipal);
        this.configurar();
    }
    //	PROPIEDADES
    private VentanaPrincipal ventanaPrincipal;
    private JPanel contenedorDeCampos;
    private JLabel etiquetaTitulo;
    private JLabel etiquetaId;
    private JTextField campoId;
    private JLabel etiquetaNombre;
    private JTextField campoNombre;
    private JLabel etiquetaFechaDeInicio;
    private JFormattedTextField campoFechaDeInicio;
    private JLabel etiquetaFechaDeFin;
    private JFormattedTextField campoFechaDeFin;
    private JLabel etiquetaFechaDeRegistro;
    private JFormattedTextField campoFechaDeRegistro;
    private JLabel etiquetaTipo;
    private JTextField campoTipo;
    private JLabel etiquetaCategoria;
    private JTextField campoCategoria;
    private JLabel etiquetaLugar;
    private JTextField campoLugar;
    private JLabel etiquetaContacto;
    private JTextField campoContacto;
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
        this.etiquetaTitulo.setText("FOMULARIO PARA AGREGAR UNA NUEVO EVENTO");
        Font tipoDeLetra = new Font("Arial ", Font.PLAIN, 20);
        this.etiquetaTitulo.setFont(tipoDeLetra);
        this.etiquetaTitulo.setForeground(Color.BLUE);
        this.etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        this.contenedorDeCampos = new JPanel();
        this.contenedorDeCampos.setBorder(new TitledBorder("Ingrese los Datos del nuevo evento: "));
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

        this.etiquetaFechaDeRegistro = new JLabel("Fecha De Registro:");
        this.etiquetaFechaDeRegistro.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaFechaDeRegistro.setForeground(Color.BLACK);
        this.etiquetaFechaDeRegistro.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaFechaDeInicio = new JLabel("Fecha De Inicio:");
        this.etiquetaFechaDeInicio.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaFechaDeInicio.setForeground(Color.BLACK);
        this.etiquetaFechaDeInicio.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaFechaDeFin = new JLabel("Fecha De Fin:");
        this.etiquetaFechaDeFin.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaFechaDeFin.setForeground(Color.BLACK);
        this.etiquetaFechaDeFin.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaTipo = new JLabel("Tipo:");
        this.etiquetaTipo.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaTipo.setForeground(Color.BLACK);
        this.etiquetaTipo.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaCategoria = new JLabel("Categoria:");
        this.etiquetaCategoria.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaCategoria.setForeground(Color.BLACK);
        this.etiquetaCategoria.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaLugar = new JLabel("Lugar:");
        this.etiquetaLugar.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaLugar.setForeground(Color.BLACK);
        this.etiquetaLugar.setHorizontalAlignment(SwingConstants.RIGHT);

        this.etiquetaContacto = new JLabel("Contacto:");
        this.etiquetaContacto.setFont(new Font("Candara", Font.BOLD, 14));
        this.etiquetaContacto.setForeground(Color.BLACK);
        this.etiquetaContacto.setHorizontalAlignment(SwingConstants.RIGHT);

        this.campoId = new JTextField();
        this.campoId.setFont(new Font("Calibri", 0, 14));
        this.campoId.setForeground(Color.BLACK);
        this.campoId.setHorizontalAlignment(SwingConstants.CENTER);
        this.campoId.setPreferredSize(new Dimension(200, 20));

        this.campoNombre = new JTextField();
        this.campoNombre.setFont(new Font("Calibri", 0, 14));
        this.campoNombre.setForeground(Color.BLACK);
        this.campoNombre.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoFechaDeRegistro = new JFormattedTextField();
        this.campoFechaDeRegistro.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeRegistro.setForeground(Color.BLACK);
        this.campoFechaDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoFechaDeInicio = new JFormattedTextField();
        this.campoFechaDeInicio.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeInicio.setForeground(Color.BLACK);
        this.campoFechaDeInicio.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoFechaDeFin = new JFormattedTextField();
        this.campoFechaDeFin.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeFin.setForeground(Color.BLACK);
        this.campoFechaDeFin.setHorizontalAlignment(SwingConstants.CENTER);

        this.campoTipo = new JTextField();
        this.campoTipo.setFont(new Font("Calibri", 0, 14));
        this.campoTipo.setForeground(Color.BLACK);

        this.campoCategoria = new JTextField();
        this.campoCategoria.setFont(new Font("Calibri", 0, 14));
        this.campoCategoria.setForeground(Color.BLACK);

        this.campoLugar = new JFormattedTextField();
        this.campoLugar.setFont(new Font("Calibri", 0, 14));
        this.campoLugar.setForeground(Color.BLACK);
        this.campoLugar.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.campoContacto = new JFormattedTextField();
        this.campoContacto.setFont(new Font("Calibri", 0, 14));
        this.campoContacto.setForeground(Color.BLACK);
        this.campoContacto.setHorizontalAlignment(SwingConstants.CENTER);

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
        
        this.agregarComponenteConReglas(this.botonAceptar, contendorDelaVentana,
                0, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.LAST_LINE_END, 0.5f,
                0.5f, 50, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonCancelar, contendorDelaVentana,
                0, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.LAST_LINE_END, 0.5f,
                0.5f, 50, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaId,
                this.contenedorDeCampos, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaNombre,
                this.contenedorDeCampos, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaFechaDeRegistro,
                this.contenedorDeCampos, 0, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaFechaDeInicio,
                this.contenedorDeCampos, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaFechaDeFin,
                this.contenedorDeCampos, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaTipo,
                this.contenedorDeCampos, 0, 5, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaCategoria,
                this.contenedorDeCampos, 0, 6, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaLugar,
                this.contenedorDeCampos, 0, 7, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        
        this.agregarComponenteConReglas(this.etiquetaContacto,
                this.contenedorDeCampos, 0, 8, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoId,
                this.contenedorDeCampos, 1, 0, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoNombre,
                this.contenedorDeCampos, 1, 1, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoFechaDeRegistro,
                this.contenedorDeCampos, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoFechaDeInicio,
                this.contenedorDeCampos, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoFechaDeFin,
                this.contenedorDeCampos, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoTipo,
                this.contenedorDeCampos, 1, 5, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoCategoria,
                this.contenedorDeCampos, 1, 6, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.campoLugar,
                this.contenedorDeCampos, 1, 7, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        
        this.agregarComponenteConReglas(this.campoContacto,
                this.contenedorDeCampos, 1, 8, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.pack();

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
