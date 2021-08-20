Ver 1.0.9
Cambios 20/08/2021
Ventana RH
-Se añadio ventana con Registro y tablas para
	-Tortas
	-Estadia
En ventana RH > Estadias podras registrar:
# Exp
Apellido P
Apellido M
Nombre(s)
# Celular
Carrera
Tipo de carrera
CURP
Status
Fecha de ingreso
Fecha de termino
Carta de presentación
Carta de aceptación
Programa de actividades
1er avance
2do avance
3er avance
Carta termino
Autorización del empastado
Evaluación
Observaciones


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




