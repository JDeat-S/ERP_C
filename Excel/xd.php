

<?php

require 'Libmail/autoload.php';

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\SMTP;
use PHPMailer\PHPMailer\Exception;

$archivo = $_FILES['adjunto'];

try {
    $mail = new PHPMailer();
    $mail->IsSMTP(); // enable SMTP

    $mail->SMTPDebug = 1; // debugging: 1 = errors and messages, 2 = messages only
    $mail->SMTPAuth = true; // authentication enabled
    $mail->SMTPSecure = 'ssl'; // secure transfer enabled REQUIRED for Gmail
    $mail->Host = "smtp.gmail.com";
    $mail->Port = 465; // or 587
    $mail->IsHTML(true);
    $mail->Username = "jhovan14000@gmail.com";
    $mail->Password = "JDeat5577";
    $mail->setFrom('jhovan14000@gmail.com', 'Jhovan');


    $mail->addAddress('Confort.valet.parking@hotmail.com', 'Cristina');
    $mail->addCC('jdeat0101@gmail.com');

    $mail->AddAttachment($archivo['tmp_name'], $archivo['name']);

    $mail->isHTML(true);
    $mail->Subject = 'Prueba de envio de excel desde correo';
    $mail->Body = 'Hola lic, <br/>Esta es una prueba desde mi correo personal de <b>Gmail</b>.<br/>';
    $mail->send();

    echo 'Correo enviado';
} catch (Exception $e) {
    echo 'Mensaje ' . $mail->ErrorInfo;
}
?>