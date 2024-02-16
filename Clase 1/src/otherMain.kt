fun main(){
    /* Condicional */
    print("Ingrese su edad uwu")
    val edad:Int = readln().toInt()
    if(edad > 18){
        println("Es mayor de edad")
    }

    /* When (Switch) */
    val numero:Int = 2
    when(numero){
        1 -> {
            println("No es igual.")
        }
        2 -> {
            println("Sí es igual.")
        }
        else -> {
            println("No es válido.")
        }
    }

    /* Ciclos */
    for(i in 1..10){
        print(i)
    }
    print("\n")
    // De pa tras pa lante
    for(i in 1..100 step 2){
        print(i.toString()+" ")
    }
    print("\n")
    // De pa lante pa tras
    for(i in 100 downTo 1){
        print(i.toString()+" ")
    }

    print("\n")

    /* Whilee */
    var x:Int = 1
    while(x <= 10){
        print(x)
        x++
    }
    print("\n")

    var y:Int = 100
    do {
        println(y)
        y--
    } while (y > 1)
}