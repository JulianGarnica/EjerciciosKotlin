class Human(
    val firstName:String,
    val lastName:String,
    val country:String
){
    var status:String = "Born"
        get() = field
        set(value) {
            field = value
        }
    var age:Int = 0
        get() = field
        set(value) {
            field = value
        }

    init {
        println("The human ${firstName} ${lastName} has been born in ${country}!")
    }

    fun checkAge(): Boolean {
        return this.age<50
    }
}