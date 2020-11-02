# Roadmap Break_Eviction:

## Situación actual y meta a alcanzar:

Nos encontramos en el punto de partida del proyecto, estamos definiendo la arquitectura, el lenguaje, y la estructura de clases que se van a implementar. 
La meta a alcanzar es tener un producto viable orientado a mantener informados y comunicados entre sí a las personas comprometidas con los problema en referencia al derecho a la vivienda y el proceso y ejecución de desahucios.

## Pilares estratégicos:

Nuestro producto se basará en 3 pilares estratégicos relacionados con algunos de los hitos del proyecto. Dichos hitos son los siguientes:

[Hito 1: Funcionalidades referentes al rol colaborador](https://github.com/victorTorres92/Break_Eviction/milestone/2)

[Hito 2: Funcionalidades referentes al rol afectado](https://github.com/victorTorres92/Break_Eviction/milestone/3)

[Hito 3: Funcionalidades referentes al sistema de comunicación (chat)](https://github.com/victorTorres92/Break_Eviction/milestone/4)

## Definición de objetivos:

Cada uno de los pilares conlleva una serie de tareas que nos permitirán avanzar en el proyecto, estas tareas están siempre orientadas a historias de usuario y nos van a proporcionar lo que llamamos productor mínimamente viables. 

Como ya sabemos, todo usuario tendrá un rol de colaborador, independientemente de si también pertenece al rol afectado, por lo que parece lógico comenzar a avanzar en relación a las historias de usuario del [Hito 1](https://github.com/victorTorres92/Break_Eviction/milestone/2).

1. Tareas ralacionadas con la [HU1](https://github.com/victorTorres92/Break_Eviction/issues/5):

	- Definir la estructura de la clase usuario
	- Construcción del constructor de la clase usuario
	- Definir la estructura de la clase desahucio
	- Definir la estructura de la clase aplicacion
	- Construcción del constructor de la clase aplicación
	- Proporcionar un sistema de filtrado por provincias

2. Tareas relacionadas con la [HU2](https://github.com/victorTorres92/Break_Eviction/issues/6):

	- Construcción del método registro() en la clase usuario
	- Construcción del método aniadeColaborador() en la clase desahucio

3. Tareas relacionadas con la [HU3](https://github.com/victorTorres92/Break_Eviction/issues/7):

	- Construcción del método getDesahucio() de la clase desahucio

4. Tareas relacionadas con la [HU4](https://github.com/victorTorres92/Break_Eviction/issues/8):

	- Construcción del método bajaDesahucio() de la clase usuario
	- Construcción del método elminaColaborador() de la clase desahucio

Una vez llegados a este punto, proseguiremos con el desarrollo del proyecto  avanzando en relación a las historias de usuario del [Hito 2](https://github.com/victorTorres92/Break_Eviction/milestone/3)

1. Tareas relacionadas con la [HU5](https://github.com/victorTorres92/Break_Eviction/issues/9)

	- Construccion de los diferentes constructores de la clase desahucio
	- Construcción del método registraDesahucio() de la clase usuario
	- Construcción del método registraDesahucio() de la clase aplicacion
	- Construcción del método registraUsuario() de la clase aplicacion
	- Construcción del método setAfectado() de la clase usuario

2. Tareas relacionadas con la [HU6](https://github.com/victorTorres92/Break_Eviction/issues/10)

	- Construcción de los métodos set{X}() correspondientes de la clase desahucio

3. Tareas relacionadas con la [HU7](https://github.com/victorTorres92/Break_Eviction/issues/11)

	- Definir la estructura de la clase notificacion
	- Construir el constructor de la clase notificacion
	- Construir el método enviarNotificación() de la clase usuario
	-Construir el método enviarCorreos() de la clase notificacion

4. Tareas relacionadas con la [HU11](https://github.com/victorTorres92/Break_Eviction/issues/15)

	- Construir el método borrarDesahucio() de la clase usuario
	- Construir el método borrarDesahucio() de la clase aplicacion
	- Construir el método borrarUsuario() de la clase aplicacion

Para acabar con la planificación del desarrollo de Break_Eviction avanzaremos en relación a las historias de usuario del [Hito 3](https://github.com/victorTorres92/Break_Eviction/milestone/4)

1. Tareas relacionadas con la [HU8](https://github.com/victorTorres92/Break_Eviction/issues/12)

	- Aún por determinar

2. Tareas relacionadas con la [HU9](https://github.com/victorTorres92/Break_Eviction/issues/13)

	- Aún por determinar

3. Tareas relacionadas con la [HU10](https://github.com/victorTorres92/Break_Eviction/issues/14)

	- Aún por determinar

---

**Nota 1**: La realización de test para cada una de las tareas no se incluye en la planificación pero se sobreentiende que todas estas funcionalidades tendrán que pasar el correspondiente test. Las tareas asociadas a este fin están agrupadas en el [Hito 4](https://github.com/victorTorres92/Break_Eviction/milestone/5).

**Nota 2**: Tampoco se han incluido las tareas de documentación en esta planificación aunque también disponemos de un hito que las engloba. véase [Hito 5](https://github.com/victorTorres92/Break_Eviction/milestone/6).

**Nota 3**: Para la construcción de este rodmap me he basado en la guía propuesta en el siguiente [enlace](https://www.transformapartnering.com/como-construir-un-roadmap-estrategico-2/).
