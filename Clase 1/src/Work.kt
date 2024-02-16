class Work(val human: Human, val yearsWorking:Int, val nameWork:String){
    init {
        println("The human ${human.firstName} ${human.lastName} has been start to work ${nameWork}!")

    }

    fun startWork(){
        var actualPoints:Int = 0
        while (actualPoints < this.yearsWorking) {
            println("""What like you to do?
                | 1 - Try to work
                | 2 - Don't do anything
            """.trimMargin())
            //val action = readln().toInt()
            val possibleOptions:IntRange = 1..2
            val action:Int = possibleOptions.random()
            println("Opción seleccionada ${action.toString()}")
            when (action) {
                1  -> {
                    println("Working...")
                    this.human.age += 1
                    this.human.status = "Working"
                    actualPoints += 1
                }
                2 -> {
                    println("Don't do anything!...")
                    this.human.age += 1
                    this.human.status = "Anything (Probabily Sleeping)"
                }
                else -> {
                    println("You choose a bad answer, try again!")
                }
            }
        }
        println("You finished at ${this.human.age} old the ${nameWork} work.")
    }
}