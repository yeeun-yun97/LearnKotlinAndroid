package com.github.yeeun_yun97.toy.learningkotlin.basic

fun main(args: Array<String>){
    //boolean도 마찬가지로 자바와 똑같이 사용한다.
    var t : Boolean = true
    var f : Boolean = false
    if(t)println("t")
    if(!f)println("f")

    //배열 만들기 : 신기한 점. new가 없다.
    var arr : Array<Int> = Array<Int>(3){0}
    //new가 없는 이유가 뭘까???
    //메모리가 자동으로 관리되는 코틀린이나 자바와 같은 언어에서는 유
    //사실상 new라는 키워드를 쓸 필요가 없으며, 그런 이유에서 빠진 것이 아닌가 하는
    //추측을 하는 글을 볼 수 있었다. 실제로 자바에서도 뉴 없이 객체를 생성하는 방법이 있기는 했던 기억이 난다.
    //아무리 찾아보아도 가려운 곳을 잘 긁어준 자료가 없어서 솔직히 찜찜한 기분이지만, 만일 이후 잘 알게 되면
    //여기에 다시 수정하여 작성하거나 블로그로 글을 작성하면 좋을 것 같다.

    arr[0]=100
    arr[2]=1
    println("0: ${arr[0]}, 1: ${arr[1]}, 2: ${arr[2]}")

    var sum = 0;
    for(i in arr){
        sum+=i
    }
    println(sum)

    //자바의 int[]를 만드는 방법은 따로 있다.
    var intArr = intArrayOf(1,2,3)
    var toIntArr = arr.toIntArray()

    //타입을 확인해 보자.
    println(arr.javaClass.canonicalName)
    println(toIntArr.javaClass.canonicalName)
}