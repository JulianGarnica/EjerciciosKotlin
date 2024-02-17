class Automovil {
    var opcColores = arrayOf("Rojo", "Verde", "Negro", "Morado")
    var opcLlantas = arrayOf("4", "6")
    var opcMotores = arrayOf("Simple", "Rápido")
    
    var colores:String = ""
    var llantas:String = ""
    var motor:String = ""

    private fun seleccionarOpciones(opcion:Array<String>): Int{
        println("Tienes estas opciones disponibles:")
        var contador = 0
        for (i in opcion){
            println((contador+1).toString()+" - "+i)
            contador++
        }
        return readln().toInt()
    }

    fun seleccionarColor(){
        println("Selecciona un color del vehículo:")
        var opcionSeleccionada = seleccionarOpciones(opcColores)
        this.colores = opcColores[opcionSeleccionada-1]
    }
    fun seleccionarLlantas(){
        println("Selecciona las llantas del vehículo:")
        var opcionSeleccionada = seleccionarOpciones(opcLlantas)
        this.llantas = opcLlantas[opcionSeleccionada-1]
    }
    fun seleccionarMotor(){
        println("Selecciona el motor del vehículo:")
        var opcionSeleccionada = seleccionarOpciones(opcMotores)
        this.motor = opcMotores[opcionSeleccionada-1]
    }

    fun mostrarAuto(){
        println("El vehículo escogido es de color: ${colores} tiene llantas: ${llantas} y un motor: ${motor}")
    }
}