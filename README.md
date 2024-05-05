Ejercicio: Sistema CRUD para la Gestión de Reservas de Dispositivos Audiovisuales
Descripción del Problema:
El departamento de tecnología de una universidad del Pacifico necesita un sistema para 
gestionar las reservas de dispositivos audiovisuales, como proyectores, computadoras 
portátiles y cámaras de video. El sistema debe permitir a los usuarios realizar reservas de 
dispositivos para eventos específicos, así como cancelar o modificar reservas existentes.
Requisitos Funcionales: 
Gestión de Dispositivos: 
1. Los usuarios autorizados pueden agregar nuevos dispositivos al sistema.
2. Cada dispositivo debe tener los siguientes campos:
• Nombre del dispositivo (texto)
• Descripción (texto)
• Estado (disponible, reservado)
Gestión de Reservas: 
1. Los usuarios pueden ver una lista de todas las reservas activas.
2. Los usuarios pueden agregar una nueva reserva especificando:
a. Dispositivo (selección de dispositivos disponibles)
b. Fecha y hora de inicio de la reserva
c. Fecha y hora de fin de la reserva
3. Los usuarios pueden actualizar una reserva existente cambiando las fechas y horas de 
inicio y fin.
4. Los usuarios pueden cancelar una reserva existente.
Requisitos Técnicos:
• El sistema debe desarrollarse utilizando Java y Spring Boot, bajo la estructura de 
proyecto vista en clase
• Se debe utilizar una base de datos para almacenar la información de dispositivos y 
reservas.
Entregables Esperados:
• Copia de la base de datos creada
• Implementación del sistema en Java utilizando Spring Boot, con la funcionalidad 
CRUD completa.
• Notas Adicionales:
o Se espera que el sistema sea intuitivo y fácil de usar para los usuarios finales.
o Se valora la atención a la seguridad y la implementación de buenas prácticas 
de desarrollo de software
