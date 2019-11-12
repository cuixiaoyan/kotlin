package com.cxy.kotlin.study

/**
 * 基本类型学习
 */
fun main(args: Array<String>) {
    /**
     * 在 Kotlin 中，所有东西都是对象，在这个意义上讲我们可以在任何变量上调用成员函数与属性。
     * 一些类型可以有特殊的内部表示——例如，数字、字符以及布尔值可以在运行时表示为原生类型值，但是对于用户来说，
     * 它们看起来就像普通的类。 在本节中，我们会描述 Kotlin 中使用的基本类型：数字、字符、布尔值、数组与字符串。
     */


    //表示方式
    //在 Java 平台数字是物理存储为 JVM 的原生类型，除非我们需要一个可空的引用（如 Int?）或泛型。 后者情况下会把数字装箱。
    //注意数字装箱不一定保留同一性
//    val a: Int = 10000
//    println(a === a) // 输出“true”
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
    //另一方面，它保留了相等性:
//    val a: Int = 10000
//    println(a == a) // 输出“true”
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//    println(boxedA == anotherBoxedA) // 输出“true”

    //显式转换
    //由于不同的表示方式，较小类型并不是较大类型的子类型。 如果它们是的话，就会出现下述问题
    //// 假想的代码，实际上并不能编译：
    //val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
    //val b: Long? = a // 隐式转换产生一个装箱的 Long (java.lang.Long)
    //print(b == a) // 惊！这将输出“false”鉴于 Long 的 equals() 会检测另一个是否也为 Long

    //所以相等性会在所有地方悄无声息地失去，更别说同一性了。
    //因此较小的类型不能隐式转换为较大的类型。 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量
    //val b: Byte = 1 // OK, 字面值是静态检测的
    //val i: Int = b // 错误

    //我们可以显式转换来拓宽数字
    //val i: Int = b.toInt() // OK：显式拓宽
    //print(i)

    //每个数字类型支持如下的转换:
    //toByte(): Byte
    //toShort(): Short
    //toInt(): Int
    //toLong(): Long
    //toFloat(): Float
    //toDouble(): Double
    //toChar(): Char
    //缺乏隐式类型转换很少会引起注意，因为类型会从上下文推断出来，而算术运算会有重载做适当转换，例如：
    //val l = 1L + 3 // Long + Int => Long


    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //

    //
    //









}