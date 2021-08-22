<?php
/* $servername = "192.168.1.10";
$database = "confort";
$username = "Servidor";
$password = "Remoto08";
*/
$servername = "192.168.1.2";
$database = "confort";
$username = "JDeat";
$password = "JDeat5577";
// Create connection
$conn = mysqli_connect($servername, $username, $password, $database);
mysqli_set_charset($conn, "utf8")
// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
echo "Connected successfully";
mysqli_close($conn);
?>
