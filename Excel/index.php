<?php

require 'vendor/autoload.php';

use PhpOffice\PhpSpreadsheet\Spreadsheet;
use PhpOffice\PhpSpreadsheet\IOFactory;

$spreadsheet =new Spreadsheet();
$spreadsheet->getProperties()->setCreator("JDeat")->setTitle("Zona");

$spreadsheet ->setActiveSheetIndex(0);
$hojaactiva = $spreadsheet->getActiveSheet();

$hojaactiva->setCellValue('A1', 'Zonas');
$hojaactiva->setCellValue('B1', 'Zonas');
$hojaactiva->setCellValue('C1', 'Zonas');

header("Content-Type: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
header('Content-Disposition: attachment;filename="Excel.xlsx"');
header('Cache-Control: max-age=0');

$writer = IOFactory::createWriter($spreadsheet, 'Xlsx');
$writer->save('php://output');
        
        
?>