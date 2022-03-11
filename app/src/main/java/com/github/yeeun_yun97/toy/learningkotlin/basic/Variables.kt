package com.github.yeeun_yun97.toy.learningkotlin.basic

fun main(args: Array<String>){

    //변수를 선언할 때에는
    //var name : type = value 와 같이 하는 것이 기본이다.
    var nickname : String = "가나다"
    var score : Int = 1
    var age : Int
    age = 100
    nickname = "한죽"

    //한 번에 값을 저장할 경우에는
    //값의 타입을 통해 추론이 가능하다.
    //또한 추론이 된 후에는 자동으 해당 타입의 값만 넣을 수 있는 변수가 된다.
    var favoriteGame = "소녀전선"
    favoriteGame = "원신"

    //val 키워드을 사용하면 상수를 선언하여 사용할 수 있다.
    val c= "constant"

    //다른 프로그래밍 언어와 마찬가지로,
    //변수와 상수의 이름은 숫자로 시작할 수 없으며, 예약어를 피해야 한다.
    //이름의 중간에 스페이스 바가 들어갈 수 없고, 대소문자를 구별한다.
    //특수 기호를 포함할 수 없다. (#,@ 등)


    //예약어의 종류
    //as, break, class, continue, do, else, false, for, fun, if, in, interface,
    //is, null, object, package, return, super, this, throw, true, try, typealias,
    //typeof, val, var, when, while


    //코틀린도 자바와 마찬가지로, camelCase 표기법을 사용하는 것이 일반적이다.
    //언제나 스스로에게 말하는 것이지만! 어떤 언어든 그 언어답게 사용하는게 제일 이쁘다! 명심!!

}