# Proyecto Dr. House - Galería de Imágenes en Java

Este proyecto es una aplicación Java Swing que muestra una galería de imágenes de personajes de la serie **Dr. House**. Además, incluye la configuración básica para conectarse a una base de datos MySQL.

---

## Funcionalidades

- Visualización de una galería con 39 imágenes.
- Interfaz construida con Java Swing.
- Conexión a una base de datos MySQL.
- Estructura organizada y modular para futuras extensiones.

---

## Estructura del Proyecto

```
Proyecto/
│
├── ConexionBD.java        # Clase para conectar a MySQL
├── GaleriaImagenes.java   # Ventana principal con la galería
├── claseMenu.java         # Clase base (menú o ventana padre)
├── imágenes/              # Carpeta opcional para imágenes (si se usan rutas relativas)
└── README.md              # Este archivo
```

---

## Requisitos

- Java JDK 8 o superior
- IDE como Eclipse, IntelliJ o NetBeans
- MySQL (como XAMPP o MariaDB)
- Conector JDBC de MySQL (`mysql-connector-j`)

---

## Configuración

### 1. Conexión a la base de datos

La clase `ConexionBD.java` usa los siguientes parámetros por defecto:

```java
private static final String URL = "jdbc:mysql://localhost:3306/proyecto";
private static final String USUARIO = "root";
private static final String CONTRASENA = "";
```

> Asegúrate de que tu base de datos `proyecto` exista y esté activa.

### 2. Rutas de las imágenes

Las imágenes se cargan mediante rutas absolutas, por ejemplo:

```java
"C:\Users\Alumno1\Desktop\Proyecto\Dr. House\1_house.jpg"
```


---

## Ejecución

1. Clona o descarga el repositorio.
2. Asegúrate de tener configurado el classpath correctamente con el conector JDBC.
3. Ejecuta el archivo `GaleriaImagenes.java`.
4. Deberías ver una ventana con la galería de imágenes.

---

## Posibles mejoras

- Escalado de imágenes para adaptarlas al layout.
- Cargar rutas desde una base de datos o archivo externo.
- Añadir funcionalidades al menú base (`claseMenu`).
- Usar rutas relativas para portabilidad.

---

## Autor

- Desarrollado por: Miguel Ceballos Sánchez y Daniel Rivera Miranda
- Contacto: mcs0056@alu.medac.es y drm0039@alu.medac.es
