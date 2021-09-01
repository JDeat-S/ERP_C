Ver 1.4.2
Cambios 01/09/2021
Ventana Almacen
Aun se esta re-diseñando la ventana
Se estan programando la automatizacion de
Entrada y salida para blocks

El diseño aun no se ha terminado

Ver 1.4.1 Ver 1.0.0 PHP
Cambios 30-31/08/2021
Ventana ADM > Zonas y servicios
Se corrigio texto "Tipo de valet" por "Tipo de servicio"
Se quito un el campo de texto y se puso un campo de seleccion

Nuevo modulo almacen
Se esta rediseñando la ventana (aun no es accesible 

Ver 1.4.0 JAVA VER 1.0.0 PHP
Cambios 28/08/2021
-Se añadió botón para hacer reportes en Excel en las siguientes tablas:
Estadias
Torteria
El botón esta con una imagen de Excel para que resalte en la ventana
Este boton direcciona a una interfaz basica de php leer las notas de la ver 1.0.0 para mas detalles


Ver 1.3.2 JAVA VER 0.2.0 PHP
Cambios 27/08/2021
-Se añadió botón para hacer reportes en Excel en las siguientes tablas:
Nomina (con detalles)
Pagos
Ordenes de taller
Prestamos
Empleados
IMSS
El botón esta con una imagen de Excel para que resalte en la ventana
Este boton direcciona a una interfaz basica de php leer las notas de la ver 0.2.0 para mas detalles

Ver 1.3.1 JAVA Ver 0.1.0 PHP
Cambios 26/08/2021
Ventana Administrador > 
Se añadió botón para hacer reportes en Excel
El botón esta con una imagen de Excel para que resalte en la ventana

Ver 1.3.0
Cambios 25/08/2021
Ventana RH
*Nueva Funcion: Cambiar a*
Esta funcion sirve para todas las acceder a las ventanas Estadia y Torteria
Para acceder a las ventanas hay un menu en la parte superior izquierda

Ventana RH > Tabla general
Ahora puedes filtrar datos
Los siguientes filtros estan disponibles:
-Nombre
-Zona
-Servicio
-Fecha de ingreso
-CURP
-NSS
-Estatus

Ventana Nomina
-Se corrigieron errores menores

Acceso como administrador
*Nueva funcion: Todas las ventanas*
Esta funcion se encuentra en la parte superior izquierda de cualquier ventana que abras accediendo como administrador
Esta funcion te da acceso a cualquier ventana ya sea de Nomina, RH o administradores.
Se hizo con el fin de remplazar el boton "volver"

Ver 1.2.0
Cambios 24/08/2021
-Se añadio ventana con Registro y tablas para
	-Tortas
En ventana RH > Tortas podras registrar:
-# EXP.
-Apellido P
-Apellido M
-Nombres(s)
-# Casa
-# Recados
-# Celular	
-RFC
-NSS
-CURP
-Documentos originales	
-Documentos faltantes
-Documentos entregados
-Forma de pago
-Sueldo
-Bono
-Servicio 
-Status
-Fecha entrevista
-Fecha ingreso
-Fecha ultimo dia laborado
-Fecha firma baja	
-BAJA FIRMADA
-FINIQUITO
-FECHA RE-INGRESO
-CAMBIO DE SERVICIO
-FECHA ULTIMO DIA LABORADO
-FECHA DE BAJA	
-BAJA FIRMADA	
-OBSERVACIONES	
-# RECEPCION PERSONAL
Cambios BD
-Se creo una tabla para llenar los campos de Tortas
-Se añadieron detalles a los servicios

Cambios 21-23/08/2021
Se añadio nuevo codigo fuente al repocitorio reportes, ese codigo hara reportes y enviarcelos a la licenciada
Se cuando haya una version disponible se publicara como Ver 1.0
Versiones anteriores a la 1.0 son experimentales es decir pueden producir errores o no estan totalmente terminadas
CAMBIOS IMPORTANTES
Versiones superiores 1.1.0
-El programa MYSQL workbreanch ya no es 100% funcional en el programa se remplazara por Xampp

Ver 1.1.0
Cambios 20/08/2021
Ventana RH
-Se añadio ventana con Registro y tablas para
	-Estadia
En ventana RH > Estadias podras registrar:
-# Exp
-Apellido P
-Apellido M
-Nombre(s)
-# Celular
-Carrera
-Tipo de carrera
-CURP
-Status
-Fecha de ingreso
-Fecha de termino
-Carta de presentación
-Carta de aceptación
-Programa de actividades
-1er avance
-2do avance
-3er avance
-Carta termino
-Autorización del empastado
-Evaluación
-Observaciones
(aun no es accesible)

Cambios BD
-Se creo una tabla para llenar los campos de estadia


Ver 1.0.8
Cambios 19/08/2021

Ventana Administradores > Interface Nomina
-Ahora se puede volver a la pestaña de administradores desde interface Nomina
(para esto se necesita iniciar sesion como administrador)

Ventana Nomina > Nomina, Tabla detallada, Tabla pagos, taller, Tabla taller, prestamos y tabla prestamos
-ahora se comparten los datos correctamente en tabla datos con apellido paterno, materno y nombre(s):
	-Nomina
	-Taller
	-Prestamos
-Se añadio los campos Apellido P, Apellido M y Nombre(s) para llenar en:
	-Nomina
	-Taller
	-Prestamos	
-Ahora muestra Campos Apellido P, Apellido M y Nombre(s) en las tablas:
	-Nomina
	-Pagos
	-Taller
	-Prestamos
-Se corrigieron el tamaño de todas las tablas
-ahora comparte los datos Apellido P y M registrados en empleados en cualquier pestaña de nomina
Actualmente solo se puede filtrar por nombres en prestamos y ordenes de taller

Ver 1.0.7
Cambios 18/08/2021
Ventana Administradores > Interface RH
-Ahora se puede volver a la pestaña de administradores desde interface RH
(para esto se necesita iniciar sesion como administrador)

Ventana RH > Registro y tabla general
-Se cambio el color por defecto

Ventana RH > tabla IMSS
-Se añadieron los campos de Apellido paterno, materno y nombre(s) en la tabla
-Se corrigio el tamaño de la tabla

Ventana RH > IMSS
- Se añadio campos apellido paterno, materno y nombre(s) para llenar
Cambios BD
-Se añadieron campos Apellido paterno y materno en IMSS

AVISO
EL DIA 18/08/2021 LA VENTANA NOMINA NO ESTA DISPONIBLE POR EL COMPARTIMIENTO DE DATOS ENTRE RH Y NOMINA A PARTE DE SUS CAMBIOS


Ver 1.0.6
Cambios 16-17/08/2021

Ventana RH > tabla general
-Se añadieron los campos de Apellido paterno, materno y nombre(s) en la tabla
-Se movio entra imss al inicio de la tabla
-La tabla selecciona correctamente dependiento del campo
Ventana RH > Registro
-Se añadieron los campos de Apellido paterno, materno y nombre(s) para llenar
-Se subieron todos lo botones cerrar sesion

Cambios en la BD
-Se añadieron campo apellido M, apellido P y nombre(s) en empleados
-Se importo la base datos del dia 16-08-2021(mayoria de datos que venian en el)
-Se corrigieron servicios

Ver 1.0.5
Cambios 15/08/2021

Ventana RH > tabla general
-Se oculto botón eliminar
-Se añadió las opciones de filtrar (aun no es funcional, solo se puede filtrar por nombres por ahora)
-se añadió la opción "entra imss"

Ventana RH > registro
-En Status se añadió la opción boletinado

Ventana Nomina > Pestaña tabla pagos
-Se añadió opción de "filtrar por"
Esta opción permite filtrar dependiendo de la opción que elijas (solo se puede filtrar una opción a la vez)
Filtros disponibles: Zona, Servicio (requieres seleccionar una zona), Quincena, nombre empleados y numero de folio.

Ventana Nomina > Pestaña tabla nomina
-Se añadió filtro por folio

Cambios en la BD
-Se re-nombraron algunos datos de nomina y empleados

Ver 1.0.4 
Cambios 14/08/2021

Ventana Nomina > Pestaña Nomina
-Se corrigieron los tamaños de la tabla que comparte los datos de RH
-Ahora solo se muestran Empleados con el estatus "Vigente"
-Se corrigio el error que no encontraba algunos empleados al buscar

Ventana Nomina > Tabla Detallada
-Se corrigio tamaño de la tabla
-Se añadio opcion de "filtrar por"
Esta opcion permite filtrar dependiendo de la opcion que elijas (solo se puede filtrar una opcion a la vez)
Filtros disponibles: Zona, Servicio (requieres seleccionar una zona), Quincena y nombre empleados.

Ventana Nomina > Tabla pagos
-Se corrigió tamaño de la tabla

Ventana RH > General
-Se cambio el nombre de general a Registro

Ver 1.0.3 beta
Cambios 12/08/2021

Ventana Administrador
- Al seleccionar los datos en la tabla de servicios ahora los llena adecuadamente según el dato que haya.
- Ahora se puede modificar cualquier dato un servicio servicio.
- Al agregar o modificar servicios ahora limpia todos los campos
- Se generan reportes pero no los guarda

-Ver 1.0.2
Cambios 11/08/2021

General
-Se cambio el programa a nombre ERP CONFORT

Ventana Administrador
-Ahora se pueden visualizar los datos detallados de los servicios.
-Agrega Servicios detallados sin limpiar detalles
-No modifica los detalles de los servicios
- Las tablas de la ventana "Zonas y Servicios" ahora tienen medidas especificas (Anteriormente no se tenían)

Cambios BD
- Se agrego los apartados de supervisor, Horario, abre y cierre, Sábado y domingo en Servicio

Interno
-Se busco la forma de optimizar el código para buscar datos en tablas resulto un éxito.

Ver 1.0.1
Cambios 10/08/2021

Ventana inicio
-Ahora muestra la versión del programa

Ventana Nomina
- Los botones "Cerrar sesión" ahora preguntan si quieres hacer esa acción.
- Se a corregido el error de derecho a bono que tenias que seleccionar de nuevo para que calculara con bono

Ventana RH
- Los botones "Cerrar sesión" ahora preguntan si quieres hacer esa acción.

Ventana Administrador
-Ahora se pueden ver los nombres de las Zonas el la tabla de servicios. (Administrador > Alta de Zonas y servicios)
-Se subió el botón de Volver en todas las tablas.
-Ahora los botones "cerrar sesión y volver" preguntan si quieres hacer esa acción.
-Se cambio el nombre de "Alta de Zonas y Servicios" a "Zonas y servicios".
-Ahora se puede filtrar por Zonas o por Nombre de servicio. (No se puede hacer los 2 al mismo tiempo)
-Se esta desarrollando la pestaña Agregar Detalles de servicios

Cambios BD
-En la tabla de servicios ahora aparecen los nombres de las Zonas (Antes solo aparecían números)





Ver 1.0

Cambios 09/08/2021
-Se añadieron los botones cerrar sesión en la mayoría de las ventanas.
-Se corrigieron errores ortográficos.
-En la ventana de altas y bajas de servicios se añadió una fecha en los botones "Volver"
-En la ventana "Nomina > General" se cambio el descuento IMSS para que sea 26.98 automáticamente (se puede editar).
*Esta version es totalmente funcional*
No hay cambios en la BD




