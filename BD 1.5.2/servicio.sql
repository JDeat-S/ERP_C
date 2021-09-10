-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-09-2021 a las 02:25:21
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `confort`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `idServ` int(11) NOT NULL,
  `idZona` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Nombre Zona` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Supervisor` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Servicio` varchar(80) CHARACTER SET utf8 NOT NULL,
  `Horario` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Abre` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Cierra` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Sabado` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Domingo` varchar(45) CHARACTER SET utf8 NOT NULL,
  `Otro` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Tipo de valet` text COLLATE utf8_spanish_ci NOT NULL,
  `Costo` text COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`idServ`, `idZona`, `Nombre Zona`, `Supervisor`, `Servicio`, `Horario`, `Abre`, `Cierra`, `Sabado`, `Domingo`, `Otro`, `Tipo de valet`, `Costo`) VALUES
(1, '1', 'Sur 1', '', 'SANTANDER GUADALUPE', '', '', '', '', '', '', '', ''),
(2, '1', 'Sur 1', '', 'SANTANDER INSURGENTES', '', '', '', '', '', '', '', ''),
(3, '1', 'Sur 1', '', 'SANTANDER SAN JERONIMO', '', '', '', '', '', '', '', ''),
(4, '1', 'Sur 1', '', 'SANTANDER XOLA', '', '', '', '', '', '', '', ''),
(5, '1', 'Sur 1', '', 'SANTANDER TLALPAN', '', '', '', '', '', '', '', ''),
(6, '1', 'Sur 1', '', 'SANTANDER FELIX CUEVAS', '', '', '', '', '', '', '', ''),
(7, '1', 'Sur 1', '', 'SANTANDER COPILCO', '', '', '', '', '', '', '', ''),
(8, '1', 'Sur 1', '', 'SANT. DESIERTO DE LOS LEONES', '', '', '', '', '', '', '', ''),
(9, '1', 'Sur 1', '', 'EST. ITURBIDE $15 X HRA', '', '', '', '', '', '', '', ''),
(10, '1', 'Sur 1', '', 'EST. PTE TITLA $18 X HRA', '', '', '', '', '', '', '', ''),
(11, '1', 'Sur 1', '', 'CLUB KIDS $50 BOLETAJE', '', '', '', '', '', '', '', ''),
(12, '1', 'Sur 1', '', 'PARTY SURPRISE $45 BOLETAJE', '', '', '', '', '', '', '', ''),
(13, '1', 'Sur 1', '', 'CITY EXPRESS PERIFERICO', '', '', '', '', '', '', '', ''),
(14, '1', 'Sur 1', '', 'XOTEPINGO', '', '', '', '', '', '', '', ''),
(15, '1', 'Sur 1', '', 'EDIFICIO AGATHA', '', '', '', '', '', '', '', ''),
(16, '2', 'Sur 2', '', 'SANTANDER MASARIK', '', '', '', '', '', '', '', ''),
(17, '2', 'Sur 2', '', 'SANTANDER MISISIPI', '', '', '', '', '', '', '', ''),
(18, '2', 'Sur 2', '', 'SANTANDER NEWTON', '', '', '', '', '', '', '', ''),
(19, '2', 'Sur 2', '', 'SANTANDER PALMAS', '', '', '', '', '', '', '', ''),
(20, '2', 'Sur 2', '', 'SANTANDER PLAZA REFORMA', '', '', '', '', '', '', '', ''),
(21, '2', 'Sur 2', '', 'SANTANDER POLANCO', '', '', '', '', '', '', '', ''),
(22, '2', 'Sur 2', '', 'SANTANDER L. DE CHAPULTEPEC', '', '', '', '', '', '', '', ''),
(23, '2', 'Sur 2', '', 'SANTANDER NIZA', '', '', '', '', '', '', '', ''),
(24, '2', 'Sur 2', '', 'NOTARIA EDIF. ROSSEAU', '', '', '', '', '', '', '', ''),
(25, '2', 'Sur 2', '', 'GRUPO EXPANSION', '', '', '', '', '', '', '', ''),
(26, '2', 'Sur 2', '', 'HONDA SAN ANTONIO', '', '', '', '', '', '', '', ''),
(27, '2', 'Sur 2', '', 'BELMAR  $50 BOLETAJE', '', '', '', '', '', '', '', ''),
(28, '2', 'Sur 2', '', 'EST. TEHUANTEPEC $22 X HRA', '', '', '', '', '', '', '', ''),
(29, '3', 'Zona Norte', '', 'SANTANDER LOMAS VERDES', '', '', '', '', '', '', '', ''),
(30, '3', 'Zona Norte', '', 'SANTANDER INTERLOMAS', '', '', '', '', '', '', '', ''),
(31, '3', 'Zona Norte', '', 'ENTRE GAUCHOS S/BOLETAJE', '', '', '', '', '', '', '', ''),
(32, '3', 'Zona Norte', '', 'LA ERA/LA ERA EST.', '', '', '', '', '', '', '', ''),
(33, '3', 'Zona Norte', '', 'LA ERA SANTA CRUZ', '', '', '', '', '', '', '', ''),
(34, '4', 'Foraneos Acapulco', '', 'SANTANDER RENACIMIENTO', '', '', '', '', '', '', '', ''),
(35, '4', 'Foraneos Acapulco', '', 'SANTANDER PRINCIPAPL', '', '', '', '', '', '', '', ''),
(36, '4', 'Foraneos Acapulco', '', 'SANTANDER COSTA AZUL', '', '', '', '', '', '', '', ''),
(37, '5', 'Zona Poniente', '', 'SANTANDER MONTEVIDEO', '', '', '', '', '', '', '', ''),
(38, '5', 'Zona Poniente', '', 'SANTANDER CANAL DEL NORTE', '', '', '', '', '', '', '', ''),
(39, '5', 'Zona Poniente', '', 'SANTANDER AZCAPOTZALCO', '', '', '', '', '', '', '', ''),
(40, '5', 'Zona Poniente', '', 'SANTANDER MARINA NACIONAL', '', '', '', '', '', '', '', ''),
(41, '5', 'Zona Poniente', '', 'SANTANDER EL CABALLITO', '', '', '', '', '', '', '', ''),
(42, '6', 'Foraneos Puebla', '', 'SANTANDER TEHUACAN', '', '', '', '', '', '', '', ''),
(43, '7', 'Foraneos Toluca', '', 'SANTANDER MORELOS', '', '', '', '', '', '', '', ''),
(44, '7', 'Foraneos Toluca', '', 'SANTANDER METEPEC', '', '', '', '', '', '', '', ''),
(45, '7', 'Foraneos Toluca', '', 'EST. MORELOS', '', '', '', '', '', '', '', ''),
(46, '7', 'Foraneos Toluca', '', 'EST. VITRALES', '', '', '', '', '', '', '', ''),
(47, '7', 'Foraneos Toluca', '', 'EST. PROCURADORIA', '', '', '', '', '', '', '', ''),
(48, '7', 'Foraneos Toluca', '', 'EST. SAN MATEO', '', '', '', '', '', '', '', ''),
(49, '7', 'Foraneos Toluca', '', 'SALON DIAMANTE', '', '', '', '', '', '', '', ''),
(50, '7', 'Foraneos Toluca', '', 'SALON HACIENDA LA BONITA', '', '', '', '', '', '', '', ''),
(51, '7', 'Foraneos Toluca', '', 'SALON FINCA LAS JOYAS', '', '', '', '', '', '', '', ''),
(52, '7', 'Foraneos Toluca', '', 'SALON ALCATRACES', '', '', '', '', '', '', '', ''),
(53, '7', 'Foraneos Toluca', '', 'JARDIN ESMERALDA', '', '', '', '', '', '', '', ''),
(54, '7', 'Foraneos Toluca', '', 'SALON MALLORCA', '', '', '', '', '', '', '', ''),
(55, '7', 'Foraneos Toluca', '', 'SALON TARASCO', '', '', '', '', '', '', '', ''),
(56, '7', 'Foraneos Toluca', '', 'SALON MAGYCAL PARTY', '', '', '', '', '', '', '', ''),
(57, '1', 'Sur 1', '', 'SUPERVISOR', '', '', '', '', '', '', '', ''),
(58, '2', 'Sur 2', '', 'SUPERVISOR', '', '', '', '', '', '', '', ''),
(59, '3', 'Zona Norte', '', 'SUPERVISOR', '', '', '', '', '', '', '', ''),
(60, '5', 'Zona Poniente', '', 'SUPERVISOR', '', '', '', '', '', '', '', ''),
(61, '2', 'Sur 2', 'ARTURO LADRILLERO', 'KOWLAAN $30 BOLETAJE SS. $50', '', '', '', '', '', '08:00 AM HASTA EL CIERRE', '', ''),
(62, '4', 'Foraneos Acapulco', 'Leonel garcia', 'Santander re-nacimiento', 'L a V', '8:30', '16:00', '10:00 - 14:00', 'OFF', '', 'Valet', 'Sin costo'),
(63, '8', 'Oficina', '', 'Recepción', 'L a V', '', '', 'OFF', 'OFF', '', '.', ''),
(64, '8', 'Oficina', '', 'Aux contable', 'L a V', '', '', 'OFF', 'OFF', '', '.', ''),
(65, '8', 'Oficina', '', 'Sistemas', 'L a V', '', '', 'OFF', 'OFF', '', '.', ''),
(66, '8', 'Oficina', '', 'Ventas', 'L a V', '', '', 'OFF', 'OFF', '', '.', ''),
(67, '8', 'Oficina', '', 'Limpieza', 'L a V', '', '', 'OFF', 'OFF', '', '.', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`idServ`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `idServ` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
