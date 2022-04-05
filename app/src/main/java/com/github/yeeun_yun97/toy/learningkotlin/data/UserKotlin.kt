package com.github.yeeun_yun97.toy.learningkotlin.data

data class UserKotlin(val name: String, val age: Int, var address: String)

data class DataUser(var name: String)
class User(var name: String)


data class Twin1(var name: String)
class Twin2(var name: String)

data class Store(val id: Int) {
    var stock: Int = 0
}

data class Example(val number: Int, var description: String, val content: ArrayList<String>) {
    var text: String? = ""
}

fun main() {
    val expl = Example(0, "예시입니다.", ArrayList<String>().apply { add("dd") })

    println("component1 = ${expl.component1()}")
    println("component2 = ${expl.component2()}")
    println("component3 = ${expl.component3()}")


    val same = expl.copy()
    val expl1 = expl.copy(number = 1)

    println(expl.equals(same))
    println(same)
    println(expl1)


    val id = 343827

    var storeA = Store(id)
    storeA.stock = 10
    var storeB = Store(id)
    storeB.stock = 20

    println(storeA.equals(storeB))


    val example = Example(1, "예시 1번", ArrayList())
    example.description = "예시 1번입니다."
    //example.number=2


    val name = "tt"

    //equals
    println(DataUser(name).equals(DataUser(name)))
    println(User(name).equals(User(name)))


    //hashCode
    println(DataUser(name).hashCode())
    println(DataUser(name).hashCode())
    println(DataUser(name).hashCode())

    println(User(name).hashCode())
    println(User(name).hashCode())
    println(User(name).hashCode())


    //toString
    println(DataUser(name))       //true
    println(User(name))               //false


    val mike = UserKotlin("mike", 23, "seoul")
    val soda1_a = Twin1("soda")
    val soda1_b = Twin1("soda")

    val soda2_a = Twin2("soda")
    val soda2_b = Twin2("soda")

    println(soda1_a.equals(soda1_b))
    println(soda2_a.equals(soda2_b))

    println(soda1_a.hashCode())
    println(soda1_b.hashCode())
    println(soda2_a.hashCode())
    println(soda2_b.hashCode())


}