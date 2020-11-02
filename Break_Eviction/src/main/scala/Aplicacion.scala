package Break_Eviction

import Break_Eviction.Usuario
import Break_Eviction.Desahucio
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Aplicacion () {
	
	//Datos de la aplicacion
	val usuarios: Map[Int, Usuario] = Map()
	val desahucios: Map[Int, Desahucio] = Map()
	
	//Pasamos como parámetro una provincia y nos devuelve todos los desahucios publicados para dicha provincia
	def filtrarProvincia(provinciaP : String){
	
	}
	
	//Método que registra un desahucio llamando al constructor de la clase Desahucio y asignando un valor Int autoincremental para el ID
	//Una vez creado, se incluirá en el mapa de desahucios
	def registraDesahucio(idAfectadoP: Int, localizacionP : String, fechaEjecucionP : java.time.LocalDate ) {
	
	}
	
	//Método que registra un usuario llamando al constructor de la clase Usuario y asignando un valor Int autoincremental para el ID
	//Una vez creado, se incluirá en el mapa de usuarios
	def registraUsuario(nombreP : String, apellidosP : String, emailP : String){
	
	}
	
	//Método que elimina del mapa de usuarios el elemento cuya clave se corresponde con el ID que pasamos como parámetro
	def borrarUsuario(idUsuarioP : Int){
	
	}
	
	//Método que elimina del mapa de desahucios el elemento cuya clave se corresponde con el ID que pasamos como parámetro
	def borrarDesahucio(idDesahucioP : Int){
	
	}
}
