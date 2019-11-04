package com.cxy.kotlin.study

/**
 * 官网学习
 */
//程序入口
fun main(args: Array<String>) {
    //println("hello cuixiaoyan")
    //println(sum(1,2))
    //println(printSum(1,2))

    //变量  定义只读局部变量使用关键字 val 定义。只能为其赋值一次。

//    val a: Int = 1  // 立即赋值
//    val b = 2   // 自动推断出 `Int` 类型
//    val c: Int  // 如果没有初始值类型不能省略
//    c = 3       // 明确赋值
//    //可重新赋值的变量使用 var 关键字：
//    var x = 5 // 自动推断出 `Int` 类型
//    x += 1
//    //顶层变量
//    val PI = 3.14
//    var x = 0
//    fun incrementX() {
//        x += 1
//    }

    //字符串模板

//    var a = 1
//    // 模板中的简单名称：
//    val s1 = "a is $a"
//    println(s1)
//    a = 2
//    // 模板中的任意表达式：
//    val s2 = "${s1.replace("is", "was")}, but now is $a"
//    println(s2)

    //条件表达式
    //println(maxOf(1, 2))

    //同时提交到码云 和github




}
//带有两个 Int 参数、返回 Int 的函数：
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

//将表达式作为函数体、返回值类型自动推断的函数：
//fun sum(a: Int, b: Int) = a + b

//函数返回无意义的值： Unit 返回类型可以省略：
//fun printSum(a: Int, b: Int): Unit {
//    println("sum of $a and $b is ${a + b}")
//}

//fun maxOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}
//在 Kotlin 中，if 也可以用作表达式：
//fun maxOf(a: Int, b: Int) = if (a > b) a else b