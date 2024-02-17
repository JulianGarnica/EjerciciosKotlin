fun main(){
    val mouse:Int = 43000
    val usb:Int = 28000
    val teclados:Int = 97000
    val memorias:Int = 36000
    var cargadores:Int = 83000

    var productosGuardados:String = ""
    val estructuraTabla:String = "| %-20s | %-8s | %-8s | %-10s |%n"

    print(String.format("+---------------------------------------------------------+%n"))
    print(String.format("|--------------TECNOLOGÍA TU HARDWARE S.A.S.--------------|%n"))
    print(String.format("+---------------------------------------------------------+%n"))
    print("¡Vamos a realizar compras!: ")
    var valido:Boolean = true
    var sumatoria:Int = 0

    while (valido){
        println("""
            ¿Qué producto te gustaría?:
             1 - Mouse: ${mouse.toString()}
             2 - Usb: ${usb.toString()}
             3 - Teclado: ${teclados.toString()}
             4 - Memoria: ${memorias.toString()}
             5 - Cargador: ${cargadores.toString()}
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
                productosGuardados += String.format(estructuraTabla, "Mouse", mouse.toString(), cantidad, (mouse*cantidad).toString())
                sumatoria += mouse*cantidad
            }
            2 -> {
                productosGuardados += String.format(estructuraTabla, "Usb", usb.toString(), cantidad, (usb*cantidad).toString())
                sumatoria += usb*cantidad
            }
            3 -> {
                productosGuardados += String.format(estructuraTabla, "Teclado", teclados.toString(), cantidad, (teclados*cantidad).toString())
                sumatoria += teclados*cantidad
            }
            4 -> {
                productosGuardados += String.format(estructuraTabla, "Memoria", memorias.toString(), cantidad, (memorias*cantidad).toString())
                sumatoria += memorias*cantidad
            }
            5 -> {
                productosGuardados += String.format(estructuraTabla, "Cargador", cargadores.toString(), cantidad, (cargadores*cantidad).toString())
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
    print(String.format("+---------------------------------------------------------+%n"))
    print(String.format("|--------------TECNOLOGÍA TU HARDWARE S.A.S.--------------|%n"))
    print(String.format("|---------------------FACTURA VIRTUAL---------------------|%n"))
    print(String.format("+---------------------------------------------------------+%n"))
    print(String.format("+----------+-----------------+----------+-----------------+%n"))
    print(String.format("| NIT      | %-15s | Dir      | %-15s |%n", nit, direccion))
    print(String.format("+----------+-----------------+----------+-----------------+%n"))
    print(String.format("| Teléfono | %-15s | Cliente  | %-15s |%n", telefono, cliente))
    print(String.format("+----------+-----------------+----------+-----------------+%n"))
    print(String.format("+----------------------+----------+----------+------------+%n"))
    print(String.format(estructuraTabla, "Producto", "P/Ind.", "Cantidad", "Total"))
    print(String.format("+----------------------+----------+----------+------------+%n"))
    print(productosGuardados)
    print(String.format("+----------------------+----------+----------+------------+%n"))
    print(String.format(estructuraTabla, "", "", "IVA 12%", (sumatoria*.12).toString()))
    print(String.format(estructuraTabla, "", "", "Total", ((sumatoria*.12)+sumatoria).toString()))
    print(String.format("+----------------------+----------+----------+------------+%n"))

}