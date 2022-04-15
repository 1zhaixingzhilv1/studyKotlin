package com.example.kotlin

class TestAnimal2 : Animal2 {

    override fun aaa(): String {
        var name = "123"
        name = "456"


        val age1 = 18

        val age2 = 20

        var sex="aghsdjklbaks;dhasda()&%^%&*%(*%"

        when {
            age1 > age2 -> {
                print("age1比较大")
            }
            age1<age2 -> {
                print("age2比较大")
            }
            else -> {
                print("一样大")
            }
        }




        print(sex)




        return ""
    }

}