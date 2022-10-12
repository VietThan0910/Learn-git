class OfficerManagement {
    var manager = mutableListOf<Any>()

    fun insertOfficer(officer: Officer):Boolean = manager.add(officer)
    fun searchOfiicerByName(name: String): MutableList<Pair<Int, Officer>>
    {
       var listOfficerByName = mutableListOf<Pair<Int, Officer>>()
       for (i in 0 .. manager.size)
       {
           if ((i as Officer).name == name) listOfficerByName.add(Pair(i, manager[i] as Officer))
       }
        return listOfficerByName
    }
    fun disp()
    {
        manager.forEachIndexed { index, value ->
            println("${index+1}th Officer:")
            (value as Officer).show()
        }
    }
}