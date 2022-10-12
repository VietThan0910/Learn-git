class Worker(name: String, age: Int, gender: String, address: String, rank: Int): Officer(name, age, gender, address)
{
    var rank = rank
    override var type = 1

    constructor():this("", 0, "", "", 0)

    override fun input() {
        super.input()
        print("Enter Rank: ")
        rank = readln().toInt()
    }

    override fun show() {
        super.show()
        println("Rank: $rank")
    }
}
