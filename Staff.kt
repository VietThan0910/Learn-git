import kotlin.system.exitProcess

class Staff(name: String, age: Int, gender: String, address: String, job: String) :Officer(name, age, gender, address)
{
    var job = job
    override var type = 3
    constructor():this("", 0, "", "", "")

    override fun input() {
        super.input()
        print("Enter job: ")
        job = readln()
    }

    override fun show() {
        super.show()
        println("Job: $job")
    }
}