import java.lang.Math.random

fun main(){
    print("Write the first name of the Human: ")
    val firstName:String = readln()
    print("Write the last name of the Human: ")
    val lastName:String = readln()
    print("Where's born? ")
    val country:String = readln()

    val human1:Human = Human(firstName, lastName, country)

    var checkAge:Boolean = human1.checkAge()

    while(checkAge){
        println("""What like you to do?
                | 1 - Study
                | 2 - Work
            """.trimMargin())
        val action = readln().toInt()
        when (action) {
            1 -> {
                print("How many points you want to finish the course? ")
                val pointsToPass:Int = readln().toInt()

                print("What course are you starting? ")
                val courseName:String = readln()

                val study:Study = Study(human1, pointsToPass, courseName)
                study.startStudy()
            }

            2 -> {
                print("How many years you want to work? ")
                val yearsWorking:Int = readln().toInt()

                print("What work are you starting? ")
                val nameWork:String = readln()

                val work:Work = Work(human1, yearsWorking, nameWork)
                work.startWork()
            }

            else -> {
                println("You choose a bad answer, try again!")
            }
        }
        checkAge = human1.checkAge()
    }

}