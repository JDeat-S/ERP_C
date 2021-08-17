-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 192.168.1.2    Database: confort
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `taller`
--

DROP TABLE IF EXISTS `taller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taller` (
  `idTaller` int NOT NULL AUTO_INCREMENT,
  `Fecha de expedicion` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Nombre Completo` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Zona` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Servicio` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Datos vehiculo` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `# de piezas` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Daño` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Costo Aproximado` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Ingreso a taller` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Pagado por cliente` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Pago a confort` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Cobrado` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Pagado` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Pendiente` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Por quincenas` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Forma de pago` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Observaciones` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idTaller`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taller`
--

LOCK TABLES `taller` WRITE;
/*!40000 ALTER TABLE `taller` DISABLE KEYS */;
/*!40000 ALTER TABLE `taller` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-17 17:42:27
