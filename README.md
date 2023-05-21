# WebAppUTCD

Este es un repositorio en el cual se aloja un proyecto que se nos ha asignado como trabajo práctico para entregarlo posteriormente, en la parcial de los exámenes, parte de este trabajo. En la etapa final, hay que entregar el trabajo completo y exponerlo con los demás compañeros del curso, incluso con otros compañeros de otros cursos que están cursando la misma carrera.

## Dependencias antes de instalar

Primero hay que tener algunos elementos clave antes usar el proyecto para tus fines. Si solamente necesitas ver el código fuente y hacer otras acciones que no necesites un sistema de gestor de bases de datos, adelante, porque tal vez no necesites instalarte PostgreSQL 15, 14, o 13. Sin embargo, si quieres ejecutarlo como nosotros lo haríamos acorde a los objetivos trazados del docente, entonces deberás seguir ciertos pasos para ejecutarlos sin problemas.

- Tener instalado el sistema de gestor de base de datos como `PostgreSQL 15` o `PostgreSQL 14`.
- Es opcional, pero lo usamos. Tener instalado el gestor gráfico `Pgadmin 6` o `Pgadmin 7`. Incluso se ha hecho pruebas con gestores más viejos como el `Pgadmin 4`.
- Tener instalado `Eclipse` en su última versión para `Java Enterprise Edition`. Incluso usar portables, pero aclarar que funciona en cualquier IDE.
- Tener instalado `Git`, indispensable.
- Tener instalado el `Java JDK 17`, el `Java JDK 1.8`, y el `Java JDK 1.7u40`. Precisamente se nos ha asignado esta versión de `Java JDK 7u40` por alguna razón.
- Tener instalado el `Tomcat v7.0-60` (que viene con el Eclipse).
- Poseer los conectores: `jstl-1.2.jar` y el conector para *postgres* el `postgresql-42.2.27.jar`. Estos ya vienen incluídos en el repositorio cuando usted lo clone.
- Tener a la mano la carpeta `Queries` para la creación e inserción para la bases de datos. Todos escritos con el formato PostgreSQL.

## Instalación

### Configuración de Postgres

Una vez cumplido las dependencias necesarias, podemos hacer el proceso de instalación. Lo primero que hay que hacer es tener el servidor de Postgres activado y que pueda permitir conexiones para gestionarlos y poder acceder a ellos. En el siguiente ejemplo podemos colocar los siguientes parámetros en el archivo `pg_hba.conf`:

```
# "local" is for Unix domain socket connections only
local   all             postgres                                peer
local   all             all                                     md5
# IPv4 local connections:
host    all             all             127.0.0.1/32            md5
# IPv6 local connections:
host    all             all             ::1/128                 md5
```

Y luego, en el archivo `postgresql.conf` quitar los comentarios de los siguientes parámetros:

*Antes:* 

```
# listen_addresses = '*'
# port = 5432
```

*Después:* 

```
listen_addresses = '*'
port = 5432
```

Por último, hay que **reiniciar** los servicios de *postgres* para luego utilizar las nuevas configuraciones.

### Pgadmin 4, 6, o 7

No es difícil la instalación de Pgadmin. En mi caso, poseo la versión 6 instalada mediante `pip install`, ya que la versión que me ofrece mi distribución (OpenSUSE) no me acabó de convencer (pero funciona igual). Una vez que tengas instalado, puedes ejecutar todos los scripts de SQL.

- Primero ejecutar el script `create_database.sql` para crear la base de datos principal, aunque deberías tú cambiar el `OWNER` por tu *username*, o, en su defecto por `postgres`.
- Segundo, ejecutar cada uno de aquellos *scripts* que empiecen con `create_*.sql`. Obviamente cambiando el *username OWNER* por el tuyo.
- Tercero, ejecutar cada uno de aquellos *scripts* que empiecen con `insert_*.sql`. Obviamente cambiando el *username OWNER* por el tuyo.

Cabe aclarar que puedes cambiar las tablas e inserciones con los datos que tú quieras, y luego podrían surgir problemas que se podrían solucionar.
En la tabla `usuario` tiene que estar los datos más simples posibles para la preferencia de poder ingresar al sistema sin tanto escándalo.

## Preguntas

### ¿De qué se trata el proyecto?

El proyecto se trata de realizar un sistema web que posee un formulario de ingreso, y luego del ingreso, un menú en el cual se puede interactuar parte de ese sistema. Se puede decir que el objetivo final de este sistema es poseer un formulario en el cual un usuario registrado pueda ingresar datos para quejarse sobre un alumbrado público de su zona. Básicamente es una réplica idéntica al formulario de la [ANDE: Reclamo de alumbrado público](https://www.ande.gov.py/servicios/), aunque con pequeñas modificaciones y adaptados a este sistemas.

### ¿Son con fines educativos?

Sí, son con fines educativos. No es la intención de reemplazar un sistema ya existente, sino más bien de aprender sobre la:
- Programación Orientada a Objetos.
- Base de Datos.
- Desarrollo Web.
- Colaboración en conjunto con los demás compañeros de trabajo.

### ¿Cuál es el estado actual del proyecto?

Está aún en desarrollo, ~pero está listo para ser entregado en la parcial~. Luego de ello, se continuará desarrollando para dar su culminación. Aunque ahora se está preparando el proyecto para entregarlo en el examen final.

### ¿Quiénes conforman en el proyecto?

El equipo que conforma en el proyecto son los alumnos del quinto año de la Facultad de Ingeniería y Ciencias Básicas, en la carrera de Ingeniería en Sistemas Informáticos de la Universidad Técnica de Comercialización y Desarrollo. La materia en el que estamos cursando es **Programación Orientada a Objetos I**.