package com.example.kotlin

import kotlinx.coroutines.channels.consumesAll
import java.util.*




class Animal(name:String,age:Int){

    private var name = ""

    private var age = 0




    fun getName():String{
        return name;
    }
    fun setName(name:String){
        this.name = name
    }

    fun getAge():Int{
        return age;
    }

    fun setAge(age:Int){
        this.age = age
    }



    fun main(){

        //可读可改    变量名  类型      值
        //  var     name: String = "小白"
        var name: String = "小白"
        println(name)

        //val 只读  String = "小黑",不能修改值
        val name1: String = "小黑"

        val name3 = "小红"  //类型推到
        print(name3)

        val name4 = 100

        val aaa= false



        var number = 100

        //range  范围 从哪里  到哪里

        if(number in 0..59){ if(number>=0 && number<=59)
            print("不及格")
        }else if(number in 60..80){
            print("成绩良好")
        }else if (number in 85..100){
            print("成绩优秀")
        }




        var garden = "公园"
        val time = 6

        println("天气晴郎，去${garden},玩了$time")







    }

}