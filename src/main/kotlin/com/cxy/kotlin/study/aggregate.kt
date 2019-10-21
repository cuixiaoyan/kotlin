package com.cxy.kotlin.study

/**
 * 集合学习
 */

fun main(args: Array<String>) {
    val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val mutableList = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("any--判断集合中是否有满足条件的元素:"+ list.any { it % 2 == 1 })
    println("all--判断集合中的元素是否都满足条件:" + list.all { it % 2 == 1 })





}

