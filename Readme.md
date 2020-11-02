# Arquitectura para Break_Eviction:
Como arquitectura de nuestro proyecto se ha escogido una arquitectura de microservicios, está decisión se toma teniendo en cuenta diferentes factores.

Sabemos que una arquitectura basada en microservicios nos proporciona un ciclo de vida de la aplicación independiente, es decir, cada uno de los microservicios que componen la solución es totalmente independiente del otro desde el punto de vista tecnológico (arquitectura interna, lenguaje de programación...). Esto nos permite que cada microservicio evolucione de forma independiente. Esta característica de la arquitectura también nos permite, por ejemplo, actualizar versiones de librerías a nivel de componente, lo que lo hace una tarea más limpia y simple que con un núcleo común.

Otro de los motivos de esta decisión es que la arquitectura basada en microservicios nos evita problemas de cuello de botella, al ser distribuida, la gestión del tráfico no converge en un punto común, de forma que si tenemos problemas de cuello de botella será en un solo microservicio. sin afectar al resto.

Por último, destacar que, esta arquitectura también se ha escogido porque promueve la resilencia, es decir, que si un microservicio sufre una caída va a tener un impacto limitado a un contexto puntual y el resto de microservicios no debería verse afectado.

Todas estas características y ventajas de la arquitectura basada en microservicios son las que han decantado al proyecto Break_Eviction a hacer uso de ella.

# Lenguaje de programación para Break_Eviction:

En primer lugar se ha escogido Scala como lenguaje de programación para Break_Eviction porque es un lenguaje de programación funcional y orientado a objetos de tipado estático, esto permite que los errores de tipificación sean detectados antes, y que la ejecución del programa sea más eficiente y segura. Por otro lado, es extensible, ya que nos permite añadir nuevas construcciones del lenguaje en forma de librería.
También se ha tenido en cuenta las similitudes con Java y como Scala aprovecha la madurez de JVM, su recolector de basura y las técnicas de despliegue.

# Definición de tipos de usuarios de Brak_Eviction y su enlace con las HU's:

La aplicación asignará tipos de usuarios a los miembros en función de sus necesidades. Todos los miembros son dados de alta como un usuario base (Colaborador) que podrá cambiar en cualquier momento. El tipo de usuario determina los privilegios que tiene al miembro a través de un rol.

Se ofrecen los siguientes tipos de usuarios:

1. **Colaborador/a:**

Este tipo de usuario representa una persona comprometida con la causa, interesada por recibir información.
El colaborador tiene acceso a visualizar todos los desahucios que se han publicado en nuestra aplicación pudiendo filtrar por fecha de ejecución y zona (_[HU1](https://github.com/victorTorres92/Break_Eviction/issues/5)_). Podrá apuntarse como colaborador de un desahucio (_[HU2](https://github.com/victorTorres92/Break_Eviction/issues/6)_), con esto consigue recibir notificaciones de todas las novedades del estado del desahucio.
Un colaborador, una vez se ha suscrito a un desahucio podrá ver la ficha de ese desahucio (_[HU3](https://github.com/victorTorres92/Break_Eviction/issues/7)_) e interactuar mediante un chat con con el resto de colaboradores de un desahucio al que se ha inscrito (_[HU8](https://github.com/victorTorres92/Break_Eviction/issues/12)_).
Por último, un colaborador podrá darse de baja como tal. de cualquiera de los desahucios en los que colabora (_[HU4](https://github.com/victorTorres92/Break_Eviction/issues/8)_).

**2. Afectado/a:**

Este usuario representa una persona afectada por un desahucio.
El afectado no solo puede actuar como colaborador en otros desahucios,manteniendo así todas las funcionalidades de un colaborador y teniendo las mismas necesidades, si no que también tiene la posibilidad de crear un nuevo desahucio propio(_[HU5](https://github.com/victorTorres92/Break_Eviction/issues/9)_). Una vez el afectado a creado su desahucio, tiene acceso a modificar la información referente al mismo(_[HU6](https://github.com/victorTorres92/Break_Eviction/issues/10)_) y puede enviar notificaciones a sus colaboradores si considera que la nueva información es relevante para ellos (_[HU7](https://github.com/victorTorres92/Break_Eviction/issues/11)_). Las notificaciones que se creen solo llegarán a los colaboradores de su desahucio.
En el chat, el afectado actua como moderador, pudiendo eliminar comentarios (_[HU9](https://github.com/victorTorres92/Break_Eviction/issues/13)_) y banear colaboradores que presenten un mal comportamiento (_[HU10](https://github.com/victorTorres92/Break_Eviction/issues/14)_).
Para finalizar, un afectado puede dar de baja su desahucio por cualquier motivo que considere. (_[HU11](https://github.com/victorTorres92/Break_Eviction/issues/15)_).

# Roadmap:

Pulsar _[aquí](https://github.com/victorTorres92/Break_Eviction/blob/master/Documentacion/Roadmap.md)_ para ver el roadmap de Break_Evition

# Clases implicadas:

[Aplicacion](https://github.com/victorTorres92/Break_Eviction/blob/master/Break_Eviction/src/main/scala/Aplicacion.scala)

[Desahucio](https://github.com/victorTorres92/Break_Eviction/blob/master/Break_Eviction/src/main/scala/Desahucio.scala)

[Usuario](https://github.com/victorTorres92/Break_Eviction/blob/master/Break_Eviction/src/main/scala/Usuario.scala)

[Notificacion](https://github.com/victorTorres92/Break_Eviction/blob/master/Break_Eviction/src/main/scala/Notificacion.scala)

# Chequeo de sintaxis

Pulsar _[aquí](https://github.com/victorTorres92/Break_Eviction/blob/master/Documentacion/Comprobaci%C3%B3n%20de%20sintaxis.md)_ para ver como se ha chequeado la sintaxis de la estructura de las clases

# Información adicional:

Se ha creado un nuevo directorio en la carpeta documentación en el cual se irán almacenando los distintos readme por los que irá pasando el proyecto en cada entrega: [Historial de readmes](https://github.com/victorTorres92/Break_Eviction/tree/master/Documentacion/Historial%20Readmes)
