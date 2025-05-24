import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 * La clase {@code aniadirPersonaje} extiende de {@link JFrame} y proporciona
 * una interfaz gráfica para añadir nuevos personajes a la base de datos.
 * <p>
 * La interfaz permite ingresar datos como el ID, nombre del personaje, nombre del actor,
 * edad, rol, la primera aparición, y la ruta de la imagen. Al guardar, se inserta un nuevo
 * registro en la tabla {@code personajes} de la base de datos.
 * </p>
 * <p>
 * Se utilizan componentes de Swing posicionados de forma absoluta y se configura el color de
 * fondo y el ícono de la ventana.
 * </p>
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 */
public class aniadirPersonaje extends JFrame {

    /** Campo de texto para el ID del personaje. */
    private JTextField txtId;
    
    /** Campo de texto para el nombre del personaje. */
    private JTextField txtNombrePersonaje;
    
    /** Campo de texto para el nombre del actor. */
    private JTextField txtNombreActor;
    
    /** Campo de texto para la edad del personaje. */
    private JTextField txtEdad;
    
    /** Campo de texto para el rol del personaje. */
    private JTextField txtRol;
    
    /** Campo de texto para la primera aparición del personaje. */
    private JTextField txtPrimeraAparicion;
    
    /** Campo de texto para la ruta de la imagen del personaje. */
    private JTextField txtImagen;
    
    /** Botón para guardar el nuevo personaje en la base de datos. */
    private JButton btnGuardar;
    
    /** Botón para volver a la pantalla principal o menú anterior. */
    private JButton btnVolver;

    /**
     * Crea una nueva instancia de {@code aniadirPersonaje} y configura todos los
     * componentes de la interfaz gráfica.
     * <p>
     * Se establecen el ícono de la ventana, el título, tamaño, layout absoluto y las
     * propiedades de color. Además, se agregan etiquetas y campos de entrada para cada
     * dato del personaje, así como los botones de "Guardar" y "Volver" con su correspondiente
     * funcionalidad.
     * </p>
     */
    public aniadirPersonaje() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\+.png"));
        getContentPane().setBackground(new Color(0, 128, 192));
        setTitle("Añadir Nuevo Personaje");
        setSize(400, 300);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Campo "Id:"
        JLabel lblId = new JLabel("Id:");
        lblId.setForeground(new Color(255, 255, 255));
        lblId.setBounds(20, 20, 144, 25);
        getContentPane().add(lblId);
        txtId = new JTextField();
        txtId.setBounds(174, 20, 200, 25);
        getContentPane().add(txtId);
        
        // Campo "Nombre del personaje:"
        JLabel lblNombrePersonaje = new JLabel("Nombre del personaje:");
        lblNombrePersonaje.setForeground(new Color(255, 255, 255));
        lblNombrePersonaje.setBounds(20, 50, 144, 25);
        getContentPane().add(lblNombrePersonaje);
        txtNombrePersonaje = new JTextField();
        txtNombrePersonaje.setBounds(174, 50, 200, 25);
        getContentPane().add(txtNombrePersonaje);

        // Campo "Nombre del actor:"
        JLabel lblNombreActor = new JLabel("Nombre del actor:");
        lblNombreActor.setForeground(new Color(255, 255, 255));
        lblNombreActor.setBounds(20, 80, 144, 25);
        getContentPane().add(lblNombreActor);
        txtNombreActor = new JTextField();
        txtNombreActor.setBounds(174, 80, 200, 25);
        getContentPane().add(txtNombreActor);
        
        // Campo "Edad:"
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setForeground(new Color(255, 255, 255));
        lblEdad.setBounds(20, 110, 144, 25);
        getContentPane().add(lblEdad);
        txtEdad = new JTextField();
        txtEdad.setBounds(174, 110, 200, 25);
        getContentPane().add(txtEdad);
        
        // Campo "Rol:"
        JLabel lblRol = new JLabel("Rol:");
        lblRol.setForeground(new Color(255, 255, 255));
        lblRol.setBounds(20, 140, 144, 25);
        getContentPane().add(lblRol);
        txtRol = new JTextField();
        txtRol.setBounds(174, 140, 200, 25);
        getContentPane().add(txtRol);
        
        // Campo "Primera Aparición:"
        JLabel lblPrimeraAparicion = new JLabel("Primera Aparición:");
        lblPrimeraAparicion.setForeground(new Color(255, 255, 255));
        lblPrimeraAparicion.setBounds(20, 170, 144, 25);
        getContentPane().add(lblPrimeraAparicion);
        txtPrimeraAparicion = new JTextField();
        txtPrimeraAparicion.setBounds(174, 170, 200, 25);
        getContentPane().add(txtPrimeraAparicion);
        
        // Campo "Ruta de la imagen:"
        JLabel lblImagen = new JLabel("Ruta de la imagen: ");
        lblImagen.setForeground(new Color(255, 255, 255));
        lblImagen.setBounds(20, 200, 144, 25);
        getContentPane().add(lblImagen);
        txtImagen = new JTextField();
        txtImagen.setBounds(174, 200, 200, 25);
        getContentPane().add(txtImagen);
     
        // Botón "Volver"
        btnVolver = new JButton("Volver");
        btnVolver.setBounds(36, 231, 100, 25);
        btnVolver.addActionListener(e -> {
            clasePrincipal ventana = new clasePrincipal();
            ventana.setVisible(true);
            dispose();
        });
        getContentPane().add(btnVolver);

        // Botón "Guardar"
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(236, 231, 100, 25);
        getContentPane().add(btnGuardar);

        // Acción del botón "Guardar" para almacenar el personaje en la base de datos
        btnGuardar.addActionListener(e -> guardarPersonaje());
        
        setVisible(true);
    }

    /**
     * Valida los campos ingresados y guarda el nuevo personaje en la base de datos.
     * <p>
     * Se realiza una comprobación de que ningún campo esté vacío. Si algún campo falta,
     * se muestra un mensaje de advertencia. De lo contrario, se establece la conexión con la
     * base de datos y se ejecuta una sentencia SQL de inserción.
     * </p>
     */
    private void guardarPersonaje() {
        String id = txtId.getText().trim();
        String nombrePersonaje = txtNombrePersonaje.getText().trim();
        String nombreActor = txtNombreActor.getText().trim();
        String edad = txtEdad.getText().trim();
        String rol = txtRol.getText().trim();
        String primeraAparicion = txtPrimeraAparicion.getText().trim();
        String imagen = txtImagen.getText().trim();
        
        if (id.isEmpty() || nombrePersonaje.isEmpty() || nombreActor.isEmpty() || 
            edad.isEmpty() || rol.isEmpty() || primeraAparicion.isEmpty() || imagen.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            String sql = "INSERT INTO personajes (id, Nombre_personaje, Nombre_actor, Edad, Rol, Primera_Aparicion, imagen) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, nombrePersonaje);
            stmt.setString(3, nombreActor);
            stmt.setString(4, edad);
            stmt.setString(5, rol);
            stmt.setString(6, primeraAparicion);
            stmt.setString(7, imagen);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Personaje añadido con éxito.");
            aniadirPersonaje ventana = new aniadirPersonaje();
            ventana.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el personaje.");
        }
    }
}
