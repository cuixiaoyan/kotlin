package com.cxy.kotlin.study

/**
 * 基础学习
 */
fun main(args: Array<String>) {

    /**
     * 对象的基本声明
     */
    //创建一个对象 并打印出来
    var artist = Artist(1, "baidu", "https://www.baidu.com")
    println(artist);

    //编译错误，kotlin规定如果显式指明了str1的类型，这里是String，声明时必须同时指定是否允许为空值（null），不加问号"?"表示不允许为null；
    //var str1: String = null

    //编译通过，作第一行代码的另一种情况，加了问号，并赋值为null；
    var str1: String? = null

    //编译通过，隐式赋值为"testNull"，Kotlin会自动推断出str3类型为String，之后便不可再更改了，即不可再赋值为1这种整形数据；
    var str3 = "testNull"

    //编译通过，隐式赋值为null，那么str4就一直为null了；
    var str4 = null

    //编译通过，前者只是指定类型，没有赋值；后者赋予str5 String类型值"testNull"同样不能赋值为其他类型值；
    var str5: String
    str5 = "testNull"

    //编译错误，既没有指定类型，也没有隐式地进行初始化，错误的原因应该是编译器不知道str6类型是什么，不能对其分配空间；
    //var str6

    //不需多解释，str7可为null，同时赋值为"testNull"；
    var str7: String? = "testNull"

    /**
     * 语法 避免空指针异常
     * 对于声明为String?的变量，访问属性时会涉及到问号和双感叹号两个操作符（"?"和"!!"），
     * 前者表示执行后面代码前先检查变量赋值情况，后者表示不检查而直接访问属性（危险）。
     */

    var str2: String? = null

    //编译错误，因为之前只是将str2声明为可以是null同时赋值为null，所以紧接着访问其length属性是不允许的；
    //println("str2.length: " + str2.length)

    //输出"null"，加了问号就会先检查str2的赋值情况，如果是null，就不继续执行后半部分（.length），直接返回null；
    println("str2?.length: " + str2?.length)

    //运行异常，不检查的后果就是通过null引用去访问length属性；
    //println("str2!!.length: " + str2!!.length)

    //不会执行到if代码块中，这里用了类似Java中的做法；
    if (str2 != null) {
        println("str2!!.length: " + str2!!.length)
    }

    //到这里，相比能体会到Kotlin的智能之处了，在第上一行对str2赋值之后，就不会再像第二行那样报编译错误了；
    str2 = "testNull"
    println("str2.length: " + str2.length)

    //不为null的str2，通过三种方式均可访问length属性；
    println("str2.length: " + str2.length)
    println("str2?.length: " + str2?.length)
    println("str2!!.length: " + str2!!.length)
    if (str2 != null) {
       println("str2!!.length: " + str2.length)
    }


    /**
     * 类方法扩展
     * 这个特性支持在现有类的基础上扩展方法，特别是系统库中的类，
     * 因为如果是我们自定义的类，那么扩展和添加方法没有什么差别。
     */

    /**
     * Kotlin中是以fun关键字声明方法，没有返回值时不需要在方法名后面写任何类型，
     * 默认是Unit类型（可写可不写，但其和null不是一回事，所以不写返回值类型或者写了Unit后不能够返回null）。
     */

    fun getArtist() : Artist? {
        return null
    }


    /**
     * 上面代码为类String扩展了一个printStr()，这在Java中是不可能的。因为Java中如果既不能改变原有类，
     * 又想在其基础上添加方法，就得通过新建类来继承的方式。而现实是Java中只能是单继承，
     * 这个机会太珍贵了，更残酷的是有些类还是不能继承的。
     *
     * 可见，通过this关键字即可获取到对象（调用者）的值。
     */
    fun String.printStr(){
        println("printStr: " + this)
    }

    var str = "testExtend"
    str.printStr()




}
