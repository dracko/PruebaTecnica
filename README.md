# PruebaTecnica
El archivo Uunooo.java, es el problema 1 del PDF, y el archivo Uno.java es el problema 2 del PDF, los dos son las clases completas para que se puedan ejecutar sin problemas.

En los archivos .txt, vienen cada un o con el respectivo nombre del problema.

Para la prueba de la API Rest, lo realice con laravel, unicamente se tiene que agregar el composer, al igual, generar el archivo KEY, la base de datos a la que se conecto fue a MYSQL, en donde se alojo la base de datos, de ahi en fuera todo lo demsa lo hace laravel, hay que crear la base de datos de forma manuel con nombre apirest, y de ahi ejecutar las migraciones para que se creeen las tablas que se ocuparon para el ejemplo, y una vez hechas las migraciones la api se consume y muestran los datos en la tabla.

Comandos:

composer install

cp .env.example .env

php artisan key:generate

php artisan migrate

php artisan serve
