import static org.junit.jupiter.api.Assertions.*;
import java.awt.Component;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.swing.*;

public class TestProyecto {

    private clasePrincipal ventana;

    @BeforeEach
    public void setUp() {
        ventana = new clasePrincipal();
    }

    @Test
    public void testTituloVentana() {
        assertEquals("Dr. House FanZone", ventana.getTitle(), "El título de la ventana debe ser correcto.");
    }

    @Test
    public void testTamañoVentana() {
        assertEquals(450, ventana.getWidth(), "El ancho de la ventana debe ser 450.");
        assertEquals(300, ventana.getHeight(), "La altura de la ventana debe ser 300.");
    }

    @Test
    public void testPanelPrincipalNoEsNull() {
        assertNotNull(ventana.getContentPane(), "El contentPane no debe ser null.");
    }

    @Test
    public void testComponentesEnPanel() {
        int numeroEsperadoComponentes = 5; // JTextArea + JLabel + 2 JButton
        assertEquals(numeroEsperadoComponentes, ventana.getContentPane().getComponentCount(), "Debe haber 5 componentes en el panel.");
    }

    @Test
    public void testBotonVerPersonajesExiste() {
        boolean encontrado = false;
        for (Component comp : ventana.getContentPane().getComponents()) {
            if (comp instanceof JButton && ((JButton) comp).getText().equals("Ver Personajes")) {
                encontrado = true;
                break;
            }
        }
        assertTrue(encontrado, "El botón 'Ver Personajes' debe estar presente.");
    }
}

