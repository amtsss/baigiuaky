package com.PhamQuocHuy.testdatabase

import java.util.*

class StudentModel ( val  id : Int = getAutoId(),
                     val  name :String ="",
                     val  email :String = "",
                        val  classs : String = "",
                        val sdt : String ="")

{

    companion object{
        fun getAutoId():Int{
            val random = Random()
            return random.nextInt(1000)
        }
    }

}