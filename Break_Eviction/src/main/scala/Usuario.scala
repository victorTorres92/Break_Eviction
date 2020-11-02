package Break_Eviction

import Break_Eviction.Aplicacion
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Usuario (idUsuarioP : Int, nombreP : String, apellidosP : String, emailP : String, afectadoP : Boolean = false ) {
	
	//Datos del usuario
	val idUsuario : Int = idUsuarioP
	val nombre : String = nombreP
	val apellidos : String = apellidosP
	val email : String = emailP
	//afectado será true si el usuario registra un desahucio, inicialmente a false
	val afectado : Boolean = afectadoP
	
	//Se inicializa a 0, esto quiere decir que el usuario no es, al menos aún, un usuario afectado
	val miDesahucio : Int = 0
	
	//Lista que contendrá los ID de los desahucios a los que el usuario se inscribió como colaborador
	val listaColaboraciones : List[Int] = List()
	
	//Método que permite a un usuario inscribirse a un desahucio, incluyendo el ID del mismo en su lista de colaboraciones
	def registro(idP : Int){

	}
	//Método que permite a un usuario darse de baja de un desahucio, eliminando el ID del mismo en su lista de colaboraciones
	def bajaDesahucio(idP : Int){
	
	}
	
	//Llama al método registraDesahucio de la clase aplicación y asocia dicho desahucio al atributo miDesahucio
	def registraDesahucio(idAfectadoP: Int, localizacionP : String, fechaEjecucionP : java.time.LocalDate ){
	
	}
	
	//Método que nos permite modificar el atributo afectado del usuario
	def setAfectado(estadoP : Boolean){
	
	}
	
	//Método para crear y enviar una notificación
	def enviarNotificacion(asuntoP : String, cuerpoCorreo : String){
	
	}
	
	//Método para dar de baja miDesahucio (Implica cambiar el atributo afectadoP, y llamar al método que elimina el desahucio de la aplicación)
	def borrarDesahucio(idDesahucioP : Int){
	
	}
}
