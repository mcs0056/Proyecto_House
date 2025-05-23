-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-05-2025 a las 10:51:56
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `log_personaje`
--

CREATE TABLE `log_personaje` (
  `id` int(11) NOT NULL,
  `accion` varchar(10) NOT NULL,
  `id_personaje` int(11) NOT NULL,
  `nombre_personaje` varchar(100) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personajes`
--

CREATE TABLE `personajes` (
  `id` int(3) NOT NULL,
  `Nombre_personaje` varchar(50) NOT NULL,
  `Nombre_actor` varchar(50) NOT NULL,
  `Edad` int(3) NOT NULL,
  `Rol` varchar(50) NOT NULL,
  `Primera_Aparicion` varchar(50) NOT NULL,
  `imagen` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personajes`
--

INSERT INTO `personajes` (`id`, `Nombre_personaje`, `Nombre_actor`, `Edad`, `Rol`, `Primera_Aparicion`, `imagen`) VALUES
(1, 'Gregory House', 'Hugh Laurie', 65, 'Jefe Departamento Diagnóstico Médico', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\1 _house.jpg'),
(2, 'James Wilson', 'Robert Sean Leonard', 56, 'Jefe Departamento de Oncología', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\2_wilson.jpg'),
(3, 'Lisa Cuddy', 'Lisa Edelstein', 58, 'Directora Médica', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\3_cudy.jpg'),
(4, 'Robert Chase', 'Jesse Spencer', 46, 'Diagnóstico Médico', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\4_chase.jpg'),
(5, 'Allison Cameron', 'Jennifer Morrison', 46, 'Diagnóstico Médico', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\5_cameron.jpg'),
(6, 'Eric Foreman', 'Omar Epps', 51, 'Diagnóstico Médico', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\6_foreman.jpg'),
(7, 'Chris Taub', 'Peter Jacobson', 60, 'Diagnóstico Médico', 'Cuarta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\7_taub.jpg'),
(8, 'Remy Hadley', 'Olivia Wilde', 41, 'Diagnóstico Médico', 'Cuarta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\8_trece.jpg'),
(9, 'Lawrence Kutner', 'Kal Penn', 48, 'Diagnóstico Médico', 'Cuarta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\9_kutner.jpg'),
(10, 'Chi Park', 'Charlyne Yi', 39, 'Diagnóstico Médico', 'Octava Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\10_chi.jpg'),
(11, 'Amber Volakis', 'Anne Dudek', 50, 'Diagnóstico Médico', 'Tercera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\11_volakis.jpg'),
(12, 'Martha Masters', 'Amber Tamblyn', 41, 'Estudiante de Medicina', 'Séptima Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\12_masters.jpg'),
(13, 'Jessica Adams', 'Odette Annable', 39, 'Diagnóstico Médico', 'Octava Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\13_jessica.jpg'),
(14, 'Ali', 'Leighton Meester', 39, 'Paciente', 'Segunda Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\14_ali.jpg'),
(15, 'Stacy Warner', 'Sela Ward', 68, 'Expareja del Dr. House', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\15_stacy.jpg'),
(16, 'Lucas Douglas', 'Michael Weston', 51, 'Detective Privado', 'Quinta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\16_douglas.jpg'),
(17, 'Rebecca Adler', 'Robin Tunney', 52, 'Paciente', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\17_rebecca.jpg'),
(18, 'Rachel Taub', 'Jennifer Crystal Foley', 52, 'Esposa del Dr. Chris Taub', 'Cuarta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\18_rachel.jpg'),
(19, 'Michael Tritter', 'David Morse', 71, 'Detective Privado', 'Tercera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\19_michael.jpg'),
(20, 'Dominika', 'Karolina Wydra', 44, 'Esposa del Dr. House', 'Séptima Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\20_dominika.jpg'),
(21, 'Ruby', 'Zena Grey', 36, 'Enfermera', 'Séptima Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\21_ruby.jpg'),
(22, 'Edward Vogler', 'Chi McBride', 63, 'Jefe Junta Directiva', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\22_vogler.jpg'),
(23, 'Mark Warner', 'Curri Graham', 58, 'Esposo de Stacy Warner', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\23_warner.jpg'),
(24, 'Julia Cuddy', 'Paula Marshall', 60, 'Hermana de Lisa Cuddy', 'Séptima Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\24_julia_cuddy.jpg'),
(25, 'Joe Reese', 'Jake Weber', 62, 'Paciente', 'Octava Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\25_reese.jpg'),
(26, 'Valerie', 'Beau Garrett', 42, 'Paciente', 'Sexta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\26_valerie.jpg'),
(27, 'Melanie Landon', 'Rekha Sharma', 44, 'Amiga de Rebecca Adler', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\27_melanie_landon.jpg'),
(28, 'Melinda Bardach', 'Michelle Trachtenberg', 39, 'Paciente', 'Segunda Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\28_melinda.jpg'),
(29, 'Tracy', 'Jurnee Smollett', 38, 'Paciente', 'Tercera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\29_tracy.jpg'),
(30, 'Natalie Tavares', 'Melanie Lynskey', 47, 'Esposa de Paciente', 'Octava Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\30_nataly_tavares.jpg'),
(31, 'Lola Wiggen', 'Meredith Monroe', 55, 'Esposa de Paciente', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\31_lola.jpg'),
(32, 'Hank Wiggen', 'Scott Foley', 52, 'Paciente', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\32_hank.jpg'),
(33, 'Maria Palko', 'Samantha Mathis', 54, 'Esposa de Paciente', 'Segunda Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\33_maria.jpg'),
(34, 'Theresa', 'Heather McComb', 48, 'Hermana de Paciente', 'Octava Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\34_theresa.jpg'),
(35, 'Benjamin Byrd', 'Wentworth Miller', 52, 'Paciente', 'Octava Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\35_benjamin.jpg'),
(36, 'Pam', 'Amanda Seyfried', 39, 'Novia de Paciente', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\36_frankie.jpg'),
(37, 'Frankie', 'Laura Prepon', 45, 'Paciente', 'Sexta Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\37_pam.jpg'),
(38, 'Alex', 'Cameron Richardson', 45, 'Paciente', 'Segunda Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\38_alex.jpg'),
(39, 'Jessica Simms', 'Jennifer Stone', 32, 'Paciente', 'Primera Temporada', 'C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\39_jessica.jpg');

--
-- Disparadores `personajes`
--
DELIMITER $$
CREATE TRIGGER `trg_personaje_delete` AFTER DELETE ON `personajes` FOR EACH ROW BEGIN
	INSERT INTO log_personaje (accion, id_personaje, nombre_personaje, fecha)
    VALUES ('DELETE', OLD.id, OLD.nombre_personaje, NOW());
 END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `trg_personaje_insert` AFTER INSERT ON `personajes` FOR EACH ROW BEGIN
	INSERT INTO log_personaje (accion, id_personaje, nombre_personaje, fecha)
    VALUES ('INSERT', NEW.id, NEW.nombre_personaje, NOW());
 END
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `log_personaje`
--
ALTER TABLE `log_personaje`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `personajes`
--
ALTER TABLE `personajes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `log_personaje`
--
ALTER TABLE `log_personaje`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `personajes`
--
ALTER TABLE `personajes`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
