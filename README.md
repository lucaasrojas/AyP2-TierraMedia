# Trabajo Practico - Tierra Media

## Integrantes del grupo:

- Lucas Rojas

## Decisiones de diseño

En primera instacia creamos una clase principal que funciona como nexo entre las subclases y ejecuta los metodos correspondientes para el correcto flujo del programa. 
Dicha clase obtiene los datos de las atracciones, usuarios y promociones por medio de la lectura de archivos de texto plano que se encuentran alojados en la carpeta Archivo.
Con estos datos, se genera un itinerario para cada usuario a partir de la muestra por consola del listado de atracciones disponibles para dicho usuario contemplando la cantidad de monedas que posee y el tiempo disponible. En el momento en que ya no se encuentran atracciones y/o promociones para ofrecer, se procede con el siguiente usuario en la lista hasta que ya no quede usuario para registrar.
Una vez cargados los datos de atracciones y/o promociones para todos los usuarios se muestra por consola los itinerarios de cada uno.

## Listado de archivos

- **archivos**
  - Atracciones
  - itinerario
  - promociones
  - usuarios
- **componentes**
  - Atraccion
  - Promocion
  - TipoDeAtracciones
  - Usuario
- **excepciones**
  - ArmarListaException
  - AtraccionYaOfrecidaException
  - CerrarReaderException
  - EscribirArchivoException
  - LecturaArchivoException
  - MeQuedeSinPlataException
  - MeQuedeSinTiempoException
  - YaNoHayAtraccionesParaOfrecerException
- **principal**
  - Menu
  - Principal
- **promociones**
  - Absoluta
  - AxB
  - Porcentual
- **pruebas**
  - ArchivoTest
  - PorcentualTest
  - PromocionAxBTest
  - PromocionTest
  - UsuarioTest
  - VisualizadorTest
- **utilidades**
  - Archivo
  - GeneradorDeListas
  - Visualizador

### Promociones
#### Absoluta

La promocion de tipo Absoluta hace referencia al descuento total de una atraccion. El descuento en  realidad no se aplica, sino que no se suma el costo de dicha atraccion al total del paquete.

### Porcentual

Esta promocion aplica un descuento de un monto especificado en el archivo. Este monto se lo considera un porcentaje y en la clase Porcentual se aplica el descuento al momento de construir el objeto.

### AxB

Al  utilizar este tipo de promocion, se obtiene una tercer atraccion gratis al abonar el monto de dos atracciones.

### Utilidades
### Archivo

Esta utilidad se encarga del manejo de los archivo (lectura y escritura) y de generar los objetos correspondientes a cada archivo.

### GeneradorDeListas

Utiliza los objetos creados por la utilidad Archivo y genera los listados para ser procesados y mostrados por consola.

### Visualizador

Se encarga de mostrar por consola las listas, objetos y todo tipo de informacion que sea necesaria para el usuario.

### Principal
#### Principal/Menu

Ambos archivos fueron combinados para poder ejecutar la aplicacion sin necesidad de tener clases estaticas. Al ejecutar, java necesita una clase Main que tiene que ser estatica, lo que genera que todo lo que se encuentre adentro tambien lo sea. Para no utilizar en demasia llegamos a la conclusion junto a los docentes en crear una segunda clase que ejecute al Menu y asi evitar tener clases estaticas innecesarias.
Por el otro lado, este conjunto de archivos se encargan de ejecutar las correspondientes subclases para el correcto funcionamiento de la aplicacion.

### Componentes
#### Atraccion/Usuario/Promocion

Dichos archivos son las clases destinadas a cada elemento de los archivos de entrada. Son utilizados para generar los objetos necesarios para la ejecucion de la aplicacion y poder interactuar con la informacion obtenida.

#### TipoDeAtracciones

Este componente es de tipo Enum en el cual especificamos los tipos de atracciones que se encuentra en la aplicacion. Se decidio por usar un Enum para estar seguros de que no se van a cometer errores al momento de trabajar logicamente con este tipo de dato.


