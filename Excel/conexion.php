<?php
/* $servername = "192.168.1.10";
$database = "confort";
$username = "Servidor";
$password = "Remoto08";
*/
$mysqli=new mysqli("192.168.1.2","JDeat","JDeat5577","confort"); //servidor, usuario de base de datos, contraseña del usuario, nombre de base de datos
	
	if(mysqli_connect_errno()){
		echo 'Conexion Fallida : ', mysqli_connect_error();
		exit();
	}
?>
