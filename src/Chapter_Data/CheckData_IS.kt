
class CheckData_IS {

    fun printTypeName ( obj : Any) {
        if(obj is Int) {
            println("Type = Integer")
        } else if (obj is Float){
            println("Type = Float")
        } else if (obj is String) {
            println("Type = String")
        } else {
            println("Type = Unknown Type")
        }
    }
}