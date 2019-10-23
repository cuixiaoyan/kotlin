package com.cxy.kotlin.study

/**
 * 集合学习
 */

fun main(args: Array<String>) {

    val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val mutableList = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    /**
     * 总数操作
     */
    println("any--判断集合中是否有满足条件的元素:"+ list.any { it % 2 == 1 })
    println("all--判断集合中的元素是否都满足条件:" + list.all { it % 2 == 1 })
    println("count--查询集合中满足条件的元素个数:" + list.count { it % 2 == 1 })
    println("fold--在给定初始值的基础上，从第一项到最后一项进行累加:" + list.fold(10) { total, next -> total + next })
    //forEach--循环遍历元素，元素是it，可对每个元素进行相关操作；
    list.forEach { value -> if (value > 8) println(value) }
    //forEachIndexed--循环遍历元素，同时得到元素index(下标)；
    list.forEachIndexed { index, value -> if (value > 8) println("value of index $index is $value") }
    println("max--查询最大的元素，如果没有则返回null:" + list.max())
    println("maxBy--获取方法处理后返回结果最大值对应的那个元素的初始值，如果没有则返回null:" + list.maxBy { -it })
    println("min--查询最小的元素，如果没有则返回null:" + list.min())
    println("minBy--获取方法处理后返回结果最小值对应那个元素的初始值，如果没有则返回null:" + list.minBy { -it })
    println("none--判断集合中是否都不满足条件，是则返回true:" + list.none { it % 2 == 10 })
    println("reduce--与fold区别在于没有初始值，或者说初始值为0，从第一项到最后一项进行累加:" + list.reduce { total, next -> total + next })
    println("reduceRight--从最后一项到第一项进行累加，与reduce只是方向的不同:" + list.reduceRight { total, next -> total + next })
    println("sumBy--获取方法处理后返回结果值的总和:" + list.sumBy { it % 2 })
    /**
     * 过滤操作
     */
    println("drop--返回去掉前n个元素后的列表:" + list.drop(4))
    println("dropWhile--返回从第一项起，去掉满足条件的元素，直到不满足条件的一项为止:" + list.dropWhile { it < 9 })
    println("dropLastWhile--返回从最后一项起，去掉满足条件的元素，直到不满足条件的一项为止:" + list.dropLastWhile { it < 9 })
    println("filter--过滤掉所有不满足条件的元素:" + list.filter { it % 2 == 0 })
    println("filterNot--过滤掉所有满足条件的元素:" + list.filterNot { it % 2 == 0 })
    println("filterNotNull--过滤掉所有值为null的元素:" + list.filterNotNull())
    // slice--过滤掉非指定下标的元素，即保留下标对应的元素过滤List中指定下标的元素（比如这里只保留下标为1，3，4的元素），
    // 当过滤list中有元素值大于目标List大小时会出现异常；
    println(list.slice(listOf(0, 4, 8)))
    //println(list.slice(listOf(0, 4, 80)))  //java.lang.ArrayIndexOutOfBoundsException: 80
    println("take--返回从第一个开始的n个元素:" + list.take(2))
    println("takeLast--返回从最后一个开始的n个元素:" + list.takeLast(2))
    println("takeWhile--返回不满足条件的下标前面的所有元素的集合:" + list.takeWhile { it < 3 })




}

