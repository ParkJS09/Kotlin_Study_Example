
class CheckData_equlas {
    fun equalsFooBar(){

        val foo : Int = 1
        val bar : Int = 1
        val equals : Boolean = foo == bar
        println("foo equlas bar :  ${equals}")
    }

    fun EqualsIdentical(){
        val a : Pair<Char, Int> = Pair('A', 65)
        val b = a
        val c : Pair<Char, Int> = Pair('A', 65)

        //a와 b의 값이 동일? -> true
        val aEqualsToB : Boolean = a == b
        println("aEqualsToB  : ${aEqualsToB }")

        //a와 c의 값이 동일? -> true
        val aEqualsToC : Boolean = a == b
        println("aEqualsToC  : ${aEqualsToC}")

        //a와 b는 동일 객체? -> true
        val aIdenticalToB : Boolean = a === b
        println("aIdenticalToB  : ${aIdenticalToB}")

        //a와 c는 동일 객체? False
        val aIdenticalToC : Boolean = a === c
        println("aIdenticalToC  : ${aIdenticalToC}")
    }
}