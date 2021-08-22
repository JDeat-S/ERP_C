<?php

require 'vendor/autoload.php';
require 'conexion.php';

use PhpOffice\PhpSpreadsheet\Spreadsheet;
use PhpOffice\PhpSpreadsheet\IOFactory;

//Consulta
$sql = "SELECT `Nombre Zona`, `Supervisor`, `Servicio`, `Horario`, `Abre`, `Cierra`, `Sabado`, `Domingo`, `Otro`, `Tipo de valet` FROM servicio";
$resultado = $mysqli->query($sql);
$fila = 2; //Establecemos en que fila inciara a imprimir los datos

$spreadsheet = new Spreadsheet();
$spreadsheet->getProperties()->setCreator("JDeat")->setTitle("Zona");

$spreadsheet->setActiveSheetIndex(0);
$hojaactiva = $spreadsheet->getActiveSheet()->setTitle("Servicios");

$spreadsheet->getActiveSheet()->setCellValue('A1', 'Nombre Zona');
$spreadsheet->getActiveSheet()->setCellValue('B1', 'Supervisor');
$spreadsheet->getActiveSheet()->setCellValue('C1', 'Servicio');
$spreadsheet->getActiveSheet()->setCellValue('D1', 'Horario');
$spreadsheet->getActiveSheet()->setCellValue('E1', 'Abre');
$spreadsheet->getActiveSheet()->setCellValue('F1', 'Cierra');
$spreadsheet->getActiveSheet()->setCellValue('G1', 'Sabado');
$spreadsheet->getActiveSheet()->setCellValue('H1', 'Domingo');
$spreadsheet->getActiveSheet()->setCellValue('I1', 'Otro');
$spreadsheet->getActiveSheet()->setCellValue('J1', 'Tipo de valet');

while ($row = $resultado->fetch_assoc()) {
    $spreadsheet->getActiveSheet()->setCellValue('A' . $fila, $row['Nombre Zona']);
    $spreadsheet->getActiveSheet()->setCellValue('B' . $fila, $row['Supervisor']);
    $spreadsheet->getActiveSheet()->setCellValue('C' . $fila, $row['Servicio']);
    $spreadsheet->getActiveSheet()->setCellValue('D' . $fila, $row['Horario']);
    $spreadsheet->getActiveSheet()->setCellValue('E' . $fila, $row['Abre']);
    $spreadsheet->getActiveSheet()->setCellValue('F' . $fila, $row['Cierra']);
    $spreadsheet->getActiveSheet()->setCellValue('G' . $fila, $row['Sabado']);
    $spreadsheet->getActiveSheet()->setCellValue('H' . $fila, $row['Domingo']);
    $spreadsheet->getActiveSheet()->setCellValue('I' . $fila, $row['Otro']);
    $spreadsheet->getActiveSheet()->setCellValue('J' . $fila, $row['Tipo de valet']);

    $fila++;
}

header("Content-Type: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
header('Content-Disposition: attachment;filename="Excel.xlsx"');
header('Cache-Control: max-age=0');

$writer = IOFactory::createWriter($spreadsheet, 'Xlsx');
$writer->save('php://output');

