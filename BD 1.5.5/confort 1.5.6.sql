-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-09-2021 a las 00:10:08
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

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
  `idZona` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Nombre Zona` varchar(50) CHARACTER SET utf8 NOT NULL,
  `Supervisor` varchar(50) CHARACTER SET utf8 NOT NULL,
  `Servicio` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Horario` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Abre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Cierra` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Sabado` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Domingo` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Otro` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Tipo de valet` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Costo` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Status` varchar(25) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`idServ`, `idZona`, `Nombre Zona`, `Supervisor`, `Servicio`, `Horario`, `Abre`, `Cierra`, `Sabado`, `Domingo`, `Otro`, `Tipo de valet`, `Costo`, `Status`) VALUES
(1, '1', 'Sur 1', 'ISAIAS PADILLA', 'OLIVO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(2, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANTANDER INSURGENTES', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(3, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANTANDER SAN JERONIMO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(4, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANTANDER XOLA', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(5, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANTANDER TLALPAN', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(6, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANTANDER FELIX CUEVAS', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(7, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANTANDER COPILCO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(8, '1', 'Sur 1', 'ISAIAS PADILLA', 'SANT. DESIERTO DE LOS LEONES', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(9, '1', 'Sur 1', 'ISAIAS PADILLA', 'EST. ITURBIDE $15 X HRA', '24 HRS', '', '', '', '', '', 'ESTACIONAMIENTOS CDMX', '15', 'Abierto'),
(10, '1', 'Sur 1', 'ISAIAS PADILLA', 'EST. PTE TITLA $18 X HRA', '24 HRS', '', '', '', '', '', 'ESTACIONAMIENTOS CDMX', '18', 'Abierto'),
(11, '1', 'Sur 1', 'ISAIAS PADILLA', 'CLUB KIDS $50 BOLETAJE', '', '', '', '', '', '$50 X EVENTO', 'EVENTOS', '50', 'Cerrado por Contingencia'),
(12, '1', 'Sur 1', 'ISAIAS PADILLA', 'PARTY SURPRISE $45 BOLETAJE', '', '', '', '', '', 'FIJO', 'EVENTOS', '45', 'Cerrado por Contingencia'),
(13, '1', 'Sur 1', 'ISAIAS PADILLA', 'CITY EXPRESS PERIFERICO', '24 HRS', '', '', '', '', '', 'SERVICIOS VP', 'Sin costo', 'Cerrado por Contingencia'),
(14, '1', 'Sur 1', 'ISAIAS PADILLA', 'XOTEPINGO', '', '', '', '', '', '12:45 PM HASTA EL CIERRE', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(15, '1', 'Sur 1', 'ISAIAS PADILLA', 'EDIFICIO AGATHA', '24 HRS', '', '', '', '', '', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(16, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER MASARIK', 'L a V', '08:30', '16:00', '10:00 A 14:00', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(17, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER MISISIPI', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(18, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER NEWTON', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(19, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER PALMAS', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(20, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER PLAZA REFORMA', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(21, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER POLANCO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(22, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER L. DE CHAPULTEPEC', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(23, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SANTANDER NIZA', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(24, '2', 'Sur 2', 'ARTURO LADRILLERO', 'NOTARIA EDIF. ROSSEAU', 'L a V', '09:00', '20:00', 'OFF', 'OFF', '', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(25, '2', 'Sur 2', 'ARTURO LADRILLERO', 'GRUPO EXPANSION', 'L a V', '09:00', '19:00', 'OFF', 'OFF', '', 'SERVICIOS VP', 'Sin costo', 'Cerrado por Contingencia'),
(26, '2', 'Sur 2', 'ARTURO LADRILLERO', 'HONDA SAN ANTONIO', 'L a V', '08:45', '19:00', '08:00 A 16:00', 'OFF', '', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(27, '2', 'Sur 2', 'ARTURO LADRILLERO', 'BELMAR  $50 BOLETAJE', '', '', '', '', '', 'FIJO', 'EVENTOS', '50', 'Cerrado por Contingencia'),
(28, '2', 'Sur 2', 'ARTURO LADRILLERO', 'EST. TEHUANTEPEC $22 X HRA', '24 HRS', '', '', '', '', '', 'ESTACIONAMIENTOS CDMX', '22', 'Abierto'),
(29, '3', 'Norte', 'ARTURO LADRILLERO', 'SANTANDER LOMAS VERDES', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(30, '3', 'Norte', 'ARTURO LADRILLERO', 'SANTANDER INTERLOMAS', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(31, '3', 'Norte', 'ARTURO LADRILLERO', 'ENTRE GAUCHOS S/BOLETAJE', '', '', '', '', '', '8:00 AM HASTA CIERRE', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(32, '3', 'Norte', 'ARTURO LADRILLERO', 'LA ERA/LA ERA EST.', 'L a V', '10:00', '22:30', '10:00 a 22:30', '10:00 a 22:30', '', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(33, '3', 'Norte', 'ARTURO LADRILLERO', 'LA ERA SANTA CRUZ', 'L a V', '10:00', '22:30', '10:00 a 22:30', '10:00 a 22:30', '', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(34, '4', 'Foraneos Acapulco', 'LEONEL OLIVAR', 'SANTANDER RENACIMIENTO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER FORANEOS', 'Sin costo', 'Abierto'),
(35, '4', 'Foraneos Acapulco', 'LEONEL OLIVAR', 'SANTANDER PRINCIPAPL', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER FORANEOS', 'Sin costo', 'Abierto'),
(36, '4', 'Foraneos Acapulco', 'LEONEL OLIVAR', 'SANTANDER COSTA AZUL', 'L a V', '08:30', '16:00', '9:00 A 16:00', 'OFF', '', 'SANTANDER FORANEOS', 'Sin costo', 'Abierto'),
(37, '5', 'Poniente', 'ARTURO LADRILLERO', 'SANTANDER MONTEVIDEO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(38, '5', 'Poniente', 'ARTURO LADRILLERO', 'SANTANDER CANAL DEL NORTE', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(39, '5', 'Poniente', 'ARTURO LADRILLERO', 'SANTANDER AZCAPOTZALCO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(40, '5', 'Poniente', 'ARTURO LADRILLERO', 'SANTANDER MARINA NACIONAL', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(41, '5', 'Poniente', 'ARTURO LADRILLERO', 'SANTANDER EL CABALLITO', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'SANTANDER CDMX', 'Sin costo', 'Abierto'),
(42, '6', 'Foraneos Puebla', 'DELFINO DURAN', 'SANTANDER TEHUACAN', 'L a V', '08:30', '16:00', '9:00 A 16:00', 'OFF', '', 'SANTANDER FORANEOS', 'Sin costo', 'Abierto'),
(43, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SANTANDER MORELOS', 'L a V', '08:30', '16:00', '9:00 A 16:00', 'OFF', '', 'SANTANDER FORANEOS', 'Sin costo', 'Abierto'),
(44, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SANTANDER METEPEC', 'L a V', '08:30', '16:00', '9:00 A 16:00', 'OFF', '', 'SANTANDER FORANEOS', 'Sin costo', 'Abierto'),
(45, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'EST. MORELOS', 'L a V', '08:00', '22:00', '8:00 A 22:00', 'OFF', '', 'ESTACIONAMIENTOS FORANEOS', 'Sin costo', 'Abierto'),
(46, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'EST. VITRALES', '24 HRS', '', '', '', '', '', 'ESTACIONAMIENTOS FORANEOS', 'Sin costo', 'Abierto'),
(47, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'EST. PROCURADORIA', '24 HRS', '', '', '', '', '', 'ESTACIONAMIENTOS FORANEOS', 'Sin costo', 'Abierto'),
(48, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'EST. SAN MATEO', '24 HRS', '', '', '', '', '', 'ESTACIONAMIENTOS FORANEOS', 'Sin costo', 'Abierto'),
(49, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON DIAMANTE', '', '', '', '', '', 'EVENTUAL', 'EVENTOS', '', 'Abierto'),
(50, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON HACIENDA LA BONITA', '', '', '', '', '', 'EVENTUAL', 'EVENTOS', '', 'Abierto'),
(51, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON FINCA LAS JOYAS', '', '', '', '', '', 'EVENTUAL', 'EVENTOS', '', 'Abierto'),
(52, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON ALCATRACES', '', '', '', '', '', 'EVENTUAL', 'EVENTOS', '', 'Abierto'),
(53, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'JARDIN ESMERALDA', '', '', '', '', '', 'EVENTUAL', 'EVENTOS', '', 'Abierto'),
(54, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON MALLORCA', '', '', '', '', '', 'L a V $650 X EVENTO DIA, S y D $1200 X EVENTO NOCHE', 'EVENTOS', 'L a V 650, S y D 1200', 'Abierto'),
(55, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON TARASCO', '', '', '', '', '', '$500 X EVENTO DÍA O NOCHE', 'EVENTOS', '500', 'Abierto'),
(56, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SALON MAGYCAL PARTY', '', '', '', '', '', '$800 X EVENTO', 'EVENTOS', '800', 'Abierto'),
(57, '1', 'Sur 1', 'ISAIAS PADILLA', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(58, '2', 'Sur 2', 'ARTURO LADRILLERO', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(59, '3', 'Norte', 'ARTURO LADRILLERO', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(60, '5', 'Poniente', 'ARTURO LADRILLERO', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(61, '2', 'Sur 2', 'ARTURO LADRILLERO', 'KOWLAAN $30 BOLETAJE SS. $50', '', '', '', '', '', '08:00 AM HASTA EL CIERRE', 'SERVICIOS VP', '50', 'Abierto'),
(62, '1', 'Sur 1', 'ISAIAS PADILLA', 'DIVISION DEL NORTE', 'L a V', '08:00', '20:00', 'OFF', 'OFF', '', 'SERVICIOS VP', 'Sin costo', 'Abierto'),
(63, '8', 'Oficina', '', 'Recepcion', 'L a V', '08:20', '05:20', '10:00 a 14:00', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(64, '8', 'Oficina', '', 'Aux contable', 'L a V', '08:20', '05:20', '10:00 a 14:00', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(65, '8', 'Oficina', '', 'Sistemas', 'L a V', '08:20', '05:20', '10:00 a 14:00', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(66, '8', 'Oficina', '', 'Ventas', 'L a V', '08:20', '05:20', '10:00 a 14:00', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(67, '8', 'Oficina', '', 'Limpieza', 'L a V', '08:20', '05:20', '10:00 a 14:00', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(68, '2', 'Sur 2', 'ARTURO LADRILLERO', 'Comodin', 'L a V', '08:00', '18:00', 'Rolado', 'Rolado', '', 'VARIADOS', '', 'VARIADOS'),
(69, '1', 'Sur 1', 'ISAIAS PADILLA', 'Comodin', 'L a V', '08:30', '18:00', 'Rolado', 'Rolado', '', 'VARIADOS', '', 'VARIADOS'),
(70, '3', 'Norte', 'ARTURO LADRILLERO', 'Comodin', 'L a V', '08:00', '18:00', 'Rolado', 'Rolado', '', 'VARIADOS', '', 'VARIADOS'),
(71, '5', 'Poniente', 'ARTURO LADRILLERO', 'Comodin', 'L a V', '08:00', '18:00', 'Rolado', 'Rolado', '', 'VARIADOS', '', 'VARIADOS'),
(72, '7', 'Foraneos Toluca', 'PEDRO GONZALEZ', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(73, '4', 'Foraneos Acapulco', 'LEONEL OLIVAR', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(74, '6', 'Foraneos Puebla', 'DELFINO DURAN', 'SUPERVISOR', 'L a V', '7:00 Hasta cierre', '7:00 Hasta cierre', '7:00 Hasta cierre', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(75, '1', 'Sur 1', 'ISAIAS PADILLA', 'Cordinador', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(76, '2', 'Sur 2', 'ARTURO LADRILLERO', 'Cordinador', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(77, '5', 'Poniente', 'ARTURO LADRILLERO', 'Cordinador', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'VARIADOS', '', 'VARIADOS'),
(78, '3', 'Norte', 'ARTURO LADRILLERO ', 'Cordinador', 'L a V', '08:30', '16:00', 'OFF', 'OFF', '', 'VARIADOS', '', 'VARIADOS');

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
  MODIFY `idServ` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
