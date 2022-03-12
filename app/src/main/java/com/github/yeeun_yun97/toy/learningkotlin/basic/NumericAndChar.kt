package com.github.yeeun_yun97.toy.learningkotlin.basic

fun main(args: Array<String>) {
    //정수형 타입들.
    var byte: Byte = 0
    var short: Short = 0
    var int: Int = 0
    var long: Long = 234214213213

    //실수형 타입들.
    var float: Float = 0.001f
    var double: Double = 1.111

    //문자 타입. 딱 한 글자만.
    var char: Char = 'r'
    var korChar: Char = '가'
    var charToInt = char.toInt()

    //문자열
    var str: String = "Hello, World!"
    var korStr: String = "안녕하세요!"
    //자주 쓰이는 이스케이프 문자.
    //탭  \t
    //개행  \n
    //작은따옴표  \'
    //큰따옴표 \"
    //백슬래시  \\
    //달러  \$

    //Raw String
    //이스케이프 문자를 입력할 필요 없디 직접 문자열을 적어도 무방하게 작성하는 방법
    //따옴표를 세개 사용하여 적는다.
    var raw: String = """한 번 값을 대충 넣어봅시다.
엔터 그냥 치고요,          탭도 세 번 치고요.
$$$// '귀여운', " 각청 " \\$$$"""
    println(raw)

    //문자열 템플릿
    //문자열 안에 특정 값을 넣을 수 있다.
    var name : String = "윤예은"
    var message: String = "\n안녕하세요 $name 님!"
    print(message)

}