# cvds-lab-05
## INTEGRANTES
**JUAN JOSE ALVAREZ BELTRAN**

### RESPUESTAS 
#### PARTE 1
**¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.**
- El código de error que sale es 301 Moved Permanetly.

**¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?**
- 1xx Informational response : la solicitud fue recibida y atendida.
- 2xx Success: la solicitud fue recibida por el cliente fue recibida, entendida y aceptada.
- 3xx Redirection: el cliente debe realizar una acción adicional para completar la solicitud.
- 4xx Client errors: el error ha sido causado por el cliente.
- 5xx Server errors: el servidor no pudo cumplir con una solicitud.

**Ahora,solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?**

- Con el comando GET conseguimos el recurso correspondiente al HTML del servidor web.

**¿Cuál esla diferencia entre los verbos GET y POST? ¿Qué otros tipos de peticiones existen?**

- **GET** sirve para solicitar datos de un recurso específico a un servidor web
- **POST** sirve para enviar datos a un servidor web para procesarlos
- **otras peticiones**
    - PUT
    - DELETE
    - HEAD
  
**¿Cuáles son las difernecias con los diferentes parámetros?**

- **VERBOSE (-v):**
  Indica la información detallada sobre la comunicación que se está llevando a cabo entre el cliente y el servidor.
- **INCLUDE (-i):**
  Incluye los encabezados de respuesta en la salida, además del cuerpo de la respuesta, es útil para asegurar que todo este funcionando correctamente.


#### PARTE 2
**¿Por qué MVC obtiene ese nombre?**

- Obtiene su nombre de la división de una aplicación en tres componentes principales
    - MODELO
    - VISTA 
    - CONTROLADOR
- El patrón MVC promueve la reutilización de componentes y la claridad en la estructura del código

**¿Cuáles son las ventajas de usar MVC?**

- Ayuda a lograr la modularidad y la organización en una aplicación de software, lo que facilita el mantenimiento y la escalabilidad

**¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?**

- tenemos un nuevo directorio dentro del SRC llamado Resources donde alojaremos los recursos de html que nuestro servidor web tiene para mostrar , tambien posee una carpeta static donde podemos alojar el index y los estilos por CSS

**¿Qué anotaciones usaste y cuál es la diferencia entre ellas?**

- **@Controller**: Se utiliza para marcar una clase de Java como un controlador de Spring. Los controladores en Spring MVC son responsables de manejar las solicitudes HTTP entrantes, procesarlas y devolver una respuesta,
- **@RequestMapping** : Esta anotación se utiliza para mapear una solicitud HTTP a un método específico en un controlador. Define la URL en la que se escuchará la solicitud y el método que la manejará.
- **@PathVariable** : Esta anotación se utiliza para mapear variables de la URL a parámetros de métodos en controladores

#### PARTE 3
**¿Qué es RESTful?**

- es un estilo arquitectónico utilizado en el diseño de aplicaciones web y servicios web que se basa en una serie de principios y restricciones. Estos principios están destinados a crear servicios web que sean escalables, fáciles de mantener, y que aprovechen las características del protocolo HTTP
#### PARTE 4
**¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?**

- Al abrir el juego en 2 navegadores en el mismo computador cada uno se comportará como un juego independiente con un numero a adivinar diferente, hasta que el jugador decida reiniciar el juego , cuando se reinicia el juego en cualquiera de los navegadores este reiniciará el de ambos

**Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?**

- Ya lo hace , la unica imposibilidad es el echo de querer reiniciar el juego solo en uno de los navegadores.