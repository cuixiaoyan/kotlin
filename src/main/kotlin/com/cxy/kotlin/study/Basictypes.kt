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


    //运算
    //Kotlin支持数字运算的标准集（+ - * / %），运算被定义为相应的类成员（但编译器会将函数调用优化为相应的指令）

    //整数除法 请注意，整数间的除法总是返回整数。会丢弃任何小数部分。例如：下面运算成立
    //val x = 5 /2
    //println(x == 2)

    //对于任何两个整数类型之间的除法来说都是如此。
    //val x = 5L / 2
    //println(x == 2L)

    //如需返回浮点类型，请将其中的一个参数显式转换为浮点类型。
    //var x = 5 / 2.toDouble()
    //println(x == 2.5)

    //字符用 Char 类型表示。它们不能直接当作数字
    //fun check(c: Char) {
    //  if (c == '1') { // 错误：类型不兼容，需要加上单引号。
    // ……
    //}
    //}
    //字符字面值用单引号括起来: '1'。 特殊字符可以用反斜杠转义。 支持这几个转义序列：\t、 \b、\n、\r、\'、\"、\\ 与 \$。
    // 编码其他字符要用 Unicode 转义序列语法：'\uFF00'。
    //fun decimalDigitValue(c: Char): Int {
    //  if (c !in '0'..'9')
    //    throw IllegalArgumentException("Out of range")
    //return c.toInt() - '0'.toInt() // 显式转换为数字
    //}
    //println(decimalDigitValue('7'))
    //当需要可空引用时，像数字、字符会被装箱。装箱操作不会保留同一性。

    //数组在 Kotlin 中使用 Array 类来表示，它定义了 get 与 set 函数（按照运算符重载约定这会转变为 []）
    //以及 size 属性，以及一些其他有用的成员函数：
    /**
     * class Array<T> private constructor() {
    val size: Int
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T): Unit
    operator fun iterator(): Iterator<T>
    // ……
    }
     */
    //我们可以使用库函数 arrayOf() 来创建一个数组并传递元素值给它，这样 arrayOf(1, 2, 3) 创建了 array [1, 2, 3]。
    //或者，库函数 arrayOfNulls() 可以用于创建一个指定大小的、所有元素都为空的数组。
    //另一个选项是用接受数组大小以及一个函数参数的 Array 构造函数，用作参数的函数能够返回给定索引的每个元素初始值：

    // 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]

    //val asc = Array(5) { i -> (i * i).toString() }
    //asc.forEach { println(it) }
    //如上所述，[] 运算符代表调用成员函数 get() 与 set()。
    //Kotlin 中数组是不型变的（invariant）。这意味着 Kotlin 不让我们把 Array<String> 赋值给 Array<Any>，
    //以防止可能的运行时失败（但是你可以使用 Array<out Any>, 参见类型投影）。


    //字符串用 String 类型表示。字符串是不可变的。 字符串的元素——字符可以使用索引运算符访问: s[i]。 可以用 for 循环迭代字符串:
    //val str = "崔笑颜"
    //for (c in str) {
      //  println(c)
    //}
    //可以用 + 操作符连接字符串。这也适用于连接字符串与其他类型的值， 只要表达式中的第一个元素是字符串：反过来编译时异常。
    //val s = 1 + "abc"
    //println(s + "def")

    //Kotlin 有两种类型的字符串字面值: 转义字符串可以有转义字符， 以及原始字符串可以包含换行以及任意文本。以下是转义字符串的一个示例:
    //val s = "Hello, world!\n"

    //原始字符串 使用三个引号（"""）分界符括起来，内部没有转义并且可以包含换行以及任何其他字符:
    //val text = """
    //for (c in "foo")
      //  print(c)
    //"""
    //println(text)

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