import Chapter_Data.CheckData_AS

fun main(args: Array<String>) {
    checkIs()
    checkAS()
}


fun checkIs(){
    val checkData_is : CheckData_IS = CheckData_IS()

    checkData_is.printTypeName("String")
    checkData_is.printTypeName(1)
    checkData_is.printTypeName(0.1)
}

fun checkAS() {
    val checkData_AS : CheckData_AS = CheckData_AS()
    checkData_AS.numberToInt(10)
    checkData_AS.numberToInt(111)
}


