package com.cxy.kotlin.study

import javafx.scene.shape.Rectangle

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

    //当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空
    //println(parseInt("1"))
    //使用返回可空值的函数:
    //println(printProduct("1","java"))

    //类型检测与自动类型转换
    //is 运算符检测一个表达式是否某类型的一个实例。
    // 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换
    //println(getStringLength(999))

    //for 循环
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }
    //或者
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (index in items.indices) {
//        println("item at $index is ${items[index]}")
//    }


    //when 表达式
    //println(describe(9))

    //使用区间（range）
    //使用 in 运算符来检测某个数字是否在指定区间内:
//    val x = 10
//    val y = 9
//    if (x in 1..y+1) {
//        println("fits in range")
//    }

    //检测某个数字是否在指定区间外
//    val list = listOf("a", "b", "c")
//
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range, too")
//    }

    //区间迭代
//    for (x in 1..5) {
//        print(x)
//    }

    //或数列迭代
//    for (x in 1..10 step 2) {
//        print(x)
//    }
//    println()
//    for (x in 9 downTo 0 step 3) {
//        print(x)
//    }


    //Collections
    //对集合进行迭代
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }
//    //使用 in 运算符来判断集合内是否包含某实例
//    when {
//        "orange" in items -> println("juicy")
//        "apple" in items -> println("apple is fine too")
//    }
//    //使用 lambda 表达式来过滤（filter）与映射（map）集合
//    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//    fruits
//            .filter { it.startsWith("a") }
//            .sortedBy { it }
//            .map { it.toUpperCase() }
//            .forEach { println(it) }

    //创建基本类及其实例
    //val rectangle = Rectangle(5.0, 2.0)






}



//fun describe(obj: Any): String =
//        when (obj) {
//            1          -> "One"
//            "Hello"    -> "Greeting"
//            is Long    -> "Long"
//            !is String -> "Not a string"
//            else       -> "Unknown"
//        }


//fun getStringLength(obj: Any): Int? {
//    // `obj` 在 `&&` 右边自动转换成 `String` 类型
//    if (obj is String && obj.length > 0) {
//        return obj.length
//    }
//
//    return null
//}

//fun getStringLength(obj: Any): Int? {
//    if (obj !is String) return null
//
//    // `obj` 在这一分支自动转换为 `String`
//    return obj.length
//}

//fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        // `obj` 在该条件分支内自动转换成 `String`
//        return obj.length
//    }
//
//    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
//    return null
//}


//fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
//    if (x != null && y != null) {
//        // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
//        println(x * y)
//    }
//    else {
//        println("'$arg1' or '$arg2' is not a number")
//    }
//}
//
//fun parseInt(str: String): Int? {
//    return null
//}

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