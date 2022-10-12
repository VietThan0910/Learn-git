abstract class Officer(name: String, age: Int, gender: String, address: String) {
    var name = name
    var age = age
    var gender = gender
    var address = address
    open var type = 0

    constructor():this("", 0,"", "")

    open fun input()
    {
        print("Enter name: ")
        name = readln()
        print("Enter age: ")
        age = readln().toInt()
        print("Enter gender: ")
        gender = readln()
        print("Enter address: ")
        address = readln()
    }

    open fun show()
    {
        println("Name: ${name}\nAge: ${age} \nGender: ${gender} \nAddress: ${address}")
    }
}