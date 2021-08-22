<?php

require 'vendor/autoload.php';
require 'conexion.php';

use PhpOffice\PhpSpreadsheet\Spreadsheet;
use PhpOffice\PhpSpreadsheet\IOFactory;
use PhpOffice\PhpSpreadsheet\Worksheet;
use PhpOffice\PhpSpreadsheet\Writer\Xlsx;
use PhpOffice\PhpSpreadsheet\Style\Border;
use PhpOffice\PhpSpreadsheet\Style\Fill;
use PhpOffice\PhpSpreadsheet\Style\Style;
use PhpOffice\PhpSpreadsheet\Style\Alignment;
use PhpOffice\PhpSpreadsheet\Worksheet\Drawing;

//Consulta
$sql = "SELECT `Nombre Zona`, `Supervisor`, `Servicio`, `Horario`, `Abre`, `Cierra`, `Sabado`, `Domingo`, `Otro`, `Tipo de valet` FROM servicio";
$resultado = $mysqli->query($sql);
$fila = 7; //Establecemos en que fila inciara a imprimir los datos


//propiedades del documento
$spreadsheet = new Spreadsheet();
$spreadsheet->getProperties()
        ->setCreator("JDeat")
        ->setTitle("Servicios");

//pestaña activa y nombre 
$spreadsheet->setActiveSheetIndex(0);
$hojaactiva = $spreadsheet->getActiveSheet()
        ->setTitle("Servicios");

$objDrawing = new Drawing();
$objDrawing->setName('Logotipo');
$objDrawing->setDescription('Logotipo');
$objDrawing->setPath('images/logo.png');
$objDrawing->setHeight(100);
$objDrawing->setCoordinates('A1');
$objDrawing->setOffsetX(110);
$objDrawing->setRotation(25);
$objDrawing->getShadow()->setVisible(true);
$objDrawing->getShadow()->setDirection(45);
$objDrawing->setWorksheet($spreadsheet->getActiveSheet());

$estiloTituloReporte = array(
    'font' => array(
        'name' => 'Arial',
        'bold' => true,
        'italic' => false,
        'strike' => false,
        'size' => 13
    ),
    'fill' => array(
        'type' => Fill::FILL_SOLID
    ),
    'borders' => array(
        'allborders' => array(
            'style' => Border::BORDER_NONE
        )
    ),
    'alignment' => array(
        'horizontal' => Alignment::HORIZONTAL_CENTER,
        'vertical' => Alignment::VERTICAL_CENTER
    )
);

$estiloTituloColumnas = array(
    'font' => array(
        'name' => 'Arial',
        'bold' => true,
        'size' => 10,
        'color' => array(
            'rgb' => '000000'
        )
    ),
    'fill' => array(
        'type' => Fill::FILL_SOLID,
        'color' => array('rgb' => '538DD5')
    ),
    'borders' => array(
        'allborders' => array(
            'style' => Border::BORDER_THIN
        )
    ),
    'alignment' => array(
        'horizontal' => Alignment::HORIZONTAL_CENTER,
        'vertical' => Alignment::VERTICAL_CENTER
    )
);

$estiloInformacion = new Style();
$estiloInformacion->applyFromArray(array(
    'font' => array(
        'name' => 'Arial',
        'color' => array(
            'rgb' => '000000'
        )
    ),
    'fill' => array(
        'type' => Fill::FILL_SOLID
    ),
    'borders' => array(
        'allborders' => array(
            'style' => Border::BORDER_THIN
        )
    ),
    'alignment' => array(
        'horizontal' => Alignment::HORIZONTAL_CENTER,
        'vertical' => Alignment::VERTICAL_CENTER
    )
));

$spreadsheet->getActiveSheet()->getStyle('A1:E4')->applyFromArray($estiloTituloReporte);
$spreadsheet->getActiveSheet()->getStyle('A6:J6')->applyFromArray($estiloTituloColumnas);

$spreadsheet->getActiveSheet()->setCellValue('B3', 'REPORTE De Servicios');
$spreadsheet->getActiveSheet()->mergeCells('B3:D3');

$spreadsheet->getActiveSheet()->getColumnDimension('A')->setWidth(19);
$spreadsheet->getActiveSheet()->setCellValue('A6', 'Nombre Zona');
$spreadsheet->getActiveSheet()->getColumnDimension('B')->setWidth(19);
$spreadsheet->getActiveSheet()->setCellValue('B6', 'Supervisor');
$spreadsheet->getActiveSheet()->getColumnDimension('C')->setWidth(30);
$spreadsheet->getActiveSheet()->setCellValue('C6', 'Servicio');
$spreadsheet->getActiveSheet()->getColumnDimension('D')->setWidth(10);
$spreadsheet->getActiveSheet()->setCellValue('D6', 'Horario');
$spreadsheet->getActiveSheet()->getColumnDimension('E')->setWidth(10);
$spreadsheet->getActiveSheet()->setCellValue('E6', 'Abre');
$spreadsheet->getActiveSheet()->getColumnDimension('F')->setWidth(10);
$spreadsheet->getActiveSheet()->setCellValue('F6', 'Cierra');
$spreadsheet->getActiveSheet()->getColumnDimension('G')->setWidth(10);
$spreadsheet->getActiveSheet()->setCellValue('G6', 'Sabado');
$spreadsheet->getActiveSheet()->getColumnDimension('H')->setWidth(10);
$spreadsheet->getActiveSheet()->setCellValue('H6', 'Domingo');
$spreadsheet->getActiveSheet()->getColumnDimension('I')->setWidth(24);
$spreadsheet->getActiveSheet()->setCellValue('I6', 'Otro');
$spreadsheet->getActiveSheet()->getColumnDimension('J')->setWidth(15);
$spreadsheet->getActiveSheet()->setCellValue('J6', 'Tipo de valet');

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

