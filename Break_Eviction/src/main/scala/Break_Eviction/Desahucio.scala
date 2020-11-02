class Desahucio (nombreP : String, apellidosP : String, emailP : String, afectadoP : Boolean = false ) {
	
	//Datos del usuario
	val nombre : String = nombreP
	val apellidos : String = apellidosP
	val email : String = emailP
	//afectado será true si el usuario registra un desahucio, inicialmente a false
	val afectado : Boolean = afectadoP
	
	def probar(){
		println("Accedí")
	}
}
