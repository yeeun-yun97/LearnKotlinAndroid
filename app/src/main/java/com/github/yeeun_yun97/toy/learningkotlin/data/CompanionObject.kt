package com.github.yeeun_yun97.toy.learningkotlin.data


class Car(val id: Int, var name: String) {
    companion object Obj {
        var nextId = 0
        fun newCar(name: String): Car {
            return Car(nextId++, name)
        }
    }
}


data class Exam(val subject: String, val score: Int) {
    companion object ExamCompanion {
        fun writeExam(exam: Exam) {
            println("당신의 ${exam.subject} 점수는 ${exam.score}점 입니다.")
        }
    }
}


class Clazz {
    companion object{}
    fun func1() :Unit {
        println("안녕!")
    }
}

fun main() {
    val obj = Clazz.Companion


    val carA = Car.newCar("carA")
    val carB = Car.newCar("carB")
    val carC = Car.newCar("carC")

    println(carA.id)                        //0
    println(carB.id)                        //1
    println(carC.id)                        //2
}