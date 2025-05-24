import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class TestProyecto {

    private clasePrincipal principal;

    @BeforeEach
    void setUp() {
        SwingUtilities.invokeLater(() -> principal = new clasePrincipal());
    }

    @Test
    void testTituloVentana() {
        assertEquals("Dr. House FanZone", principal.getTitle(), "El título de la ventana debe ser correcto");
    }

    @Test
    void testVentanaVisible() {
        SwingUtilities.invokeLater(() -> {
            principal.setVisible(true);
            assertTrue(principal.isVisible(), "La ventana debe estar visible después de inicializarse");
        });
    }

    @Test
    void testBotonPersonajesExiste() {
        JButton btnVerPersonajes = (JButton) principal.getContentPane().getComponent(3);
        assertEquals("Ver Personajes", btnVerPersonajes.getText(), "El botón debe llamarse 'Ver Personajes'");
    }

    @Test
    void testTextoDescripcion() {
        JTextArea txtrDescripcion = (JTextArea) principal.getContentPane().getComponent(1);
        assertEquals("Esta es la Fan Zone de Dr.House. Aquí encontrarás toda la información sobre la serie.",
                txtrDescripcion.getText(), "El texto de bienvenida debe ser correcto");
    }

    @Test
    void testCierreVentana() {
        SwingUtilities.invokeLater(() -> {
            principal.dispose();
            assertFalse(principal.isVisible(), "La ventana debe cerrarse correctamente");
        });
    }
}
