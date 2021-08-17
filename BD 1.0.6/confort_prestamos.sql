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
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos` (
  `idprestamos` int NOT NULL AUTO_INCREMENT,
  `Fecha de solicitud` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Mes` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Nombre Completo` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Zona` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Servicio` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Cantidad` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Interes` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Monto total` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Por quincena` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Carpeta de descuentos` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Fecha liberado` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Status` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Metodo` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idprestamos`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (35,'04/08/2021','Agosto','PEDROZA ARGAEZ JULIO CESAR','SUR 2','KOWLAAN','2000','300.0','2300.0','575.0','','19/08/2021','AUTORIZADO','BBVA');
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-17 17:42:28
