class Engineer(name: String, age: Int, gender: String, address: String, major: String):Officer(name, age, gender, address)
{
    var major = major
    override var type = 2

    constructor():this("", 0, "", "", "")

    override fun input() {
        super.input()
        print("Enter major: ")
        major = readln()
    }

    override fun show() {
        super.show()
        println("Major: $major")
    }
}