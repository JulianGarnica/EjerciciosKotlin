class Study(val human: Human, val pointsToPass:Int, val course:String){
    init {
        println("The human ${human.firstName} ${human.lastName} has been start to study ${course}!")
    }

    fun startStudy(){
        var actualPoints:Int = 0
        while (actualPoints < this.pointsToPass) {
            println("""What like you to do?
                | 1 - Try to study
                | 2 - Don't do anything
            """.trimMargin())
            //val action = readln().toInt()
            val possibleOptions = 1..2
            val action = possibleOptions.random()
            when (action) {
                1  -> {
                    println("Studying...")
                    this.human.age += 1
                    this.human.status = "Studying"
                    actualPoints += 20
                }
                2 -> {
                    println("Don't do anything!...")
                    this.human.age += 1
                    this.human.status = "Anything (Probabily Sleeping)"
                    //actualPoints += 20
                }
                else -> {
                    println("You choose a bad answer, try again!")
                }
            }
        }
        println("You finished at ${this.human.age} old the ${course} course.")
    }
}