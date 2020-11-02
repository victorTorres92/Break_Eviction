package Break_Eviction
import java.time.LocalDate

class Desahucio (idAfectadoP: Int, idDesahucioP : Int, localizacionP : String, fechaEjecucionP : java.time.LocalDate ) {
	
	//Datos del Desahucio
	val idAfectado : Int = idAfectadoP
	val id : Int = idDesahucioP
	val localizacion : String = localizacionP
	val fechaEjecucion : java.time.LocalDate = fechaEjecucionP
	
	//Lista de colaboradores inicializada a vacio
	val listaColaboradores : List[Int] = List()
	
	//Inluye en la lista de colaboradores al usuario que corresponde con el ID que pasamos como parámetro
	def aniadeColaborador(idColaboradorP : Int){
	
	}
	
	//Elimina de la lista de colaboradores al usuario que corresponde con el ID que pasamos como parámetro
	def eliminaColaborador(idColaboradorP : Int){
	
	}
	//Método para devolver la información pública de un desahucio
	def getDesahucio(){
	
	}
	
	//Metodo para cambiar la localización del desahucio, aunque a priori puede no tener sentido, se permite este cambio por posibles errores al introducir la localización.
	def setLocalizacion(){
	
	}
	
	//Metodo para cambiar la fecha de ejecución del desahucio
	def setFechaEjecucion(){
	
	}
}
