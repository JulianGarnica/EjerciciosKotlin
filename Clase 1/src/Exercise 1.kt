fun main(){
    val mouse:Int = 43000
    val usb:Int = 28000
    val teclados:Int = 97000
    val memorias:Int = 36000
    var cargadores:Int = 83000

    var productosGuardados:String = ""

    println("///BIENVENIDO A LA TIENDA DE TECNOLOGÍA TUHARDWARE SAS")
    print("¡Vamos a realizar compras!: ")
    var valido:Boolean = true
    var sumatoria:Int = 0

    while (valido){
        println("""
            ¿Qué producto te gustaría?:
             1 - Mouse:${mouse.toString()}
             2 - Usb:${usb.toString()}
             3 - Teclado:${teclados.toString()}
             4 - Memoria:${memorias.toString()}
             5 - Cargador:${cargadores.toString()}
             6 - Terminar de comprar
        """.trimIndent())
        val producto:Int = readln().toInt()

        var cantidad:Int = 0
        if(producto != 6) {
            print("Ingresa la cantidad que te gustaría comprar: ")
            cantidad = readln().toInt()
        }

        when(producto){
            1 -> {
                productosGuardados += "Mouse\t${mouse.toString()}\t${cantidad}\t${mouse*cantidad}\n"
                sumatoria += mouse*cantidad
            }
            2 -> {
                productosGuardados += "Usb\t${usb.toString()}\t${cantidad}\t${usb*cantidad}\n"
                sumatoria += usb*cantidad
            }
            3 -> {
                productosGuardados += "Mouse\t${teclados.toString()}\t${cantidad}\t${teclados*cantidad}\n"
                sumatoria += teclados*cantidad
            }
            4 -> {
                productosGuardados += "Memoria\t${memorias.toString()}\t${cantidad}\t${memorias*cantidad}\n"
                sumatoria += memorias*cantidad
            }
            5 -> {
                productosGuardados += "Cargador\t${cargadores.toString()}\t${cantidad}\t${cargadores*cantidad}\n"
                sumatoria += cargadores*cantidad
            }
            6 -> {
                valido = false
            }
        }
    }
    println("Estamos Generando tu factura! Ingresa la información de la factura: ")
    print("NIT: ")
    val nit:String = readln()
    print("Dirección: ")
    val direccion:String = readln()
    print("Teléfono: ")
    val telefono:String = readln()
    print("Cliente: ")
    val cliente:String = readln()

    println("Esta es tu factura:")
    println("===================================================")
    println("NIT: ${nit}\tDir: ${direccion}\n\tTel: ${telefono}\tCliente: ${cliente}")
    println("Producto\tV/Unitario\tCant\tTotal")
    println(productosGuardados)
    println("\t\t\t${sumatoria.toString()}")
    println("\t\tIva 12%\t${(sumatoria*.12).toString()}")
    println("\t\tTotal\t${((sumatoria*.12)+sumatoria).toString()}")

}