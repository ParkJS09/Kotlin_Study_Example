package Chapter_Data

//자료형의 변환

class CheckData_AS {

    fun numberToInt(number : Number){
        val foo : Int = number as Int

        if(foo is Int){
            println("${foo} is Int")
        }
        else
        {
            println("${foo} is not Int")
        }
    }
}