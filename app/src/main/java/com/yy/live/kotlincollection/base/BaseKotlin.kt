package com.yy.live.kotlincollection.base

/**
 * @className: BaseKotlin
 * @classDescription: base kotlin
 * @author: leibing
 * @email: leibing@yy.com
 * @createTime:2017/11/6
 */
class BaseKotlin {
    // TAG
    val TAG = "Kotlin BaseKotlin";
    // property
    var a: Int = 1
    val b = "b"
    var c: String = "c"

    /**
     * method: add
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * method: adds
     */
    fun adds(c: Int, d: Int) = c + d

    /**
     * method: max
     */
    fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    /**
     * method: maxs
     */
    fun maxs(c: Int, d: Int) = if (c > d) c else d

    /**
     * method: getStringLength
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }

    /**
     * method: forLoop
     */
    fun forLoop(): Unit {
        var items = listOf("1", "2", "3")
        for (item in items) {
            println(TAG + " item = " + item)
        }
    }

    /**
     * method: forWhile
     */
    fun forWhile(): Unit {
        var items = listOf("a", "b", "c")
        var itemIndex = 0
        while (itemIndex < items.size) {
            println(TAG + " item = " + items[itemIndex])
            itemIndex++
        }
    }

    /**
     * method: forWhen
     */
    fun forWhen(obj: Any): String = when (obj) {
        1 -> "one"
        "2" -> "two"
        else -> "unknow"
    }

    /**
     * method: forRanges
     */
    fun forRanges(a: Int): Unit {
        var b = 10;
        if (a in 1..b) {
            println(TAG + " fits in range")
        }
    }

    /**
     * method: forSet
     */
    fun forSet(): Unit {
        var items = setOf("d", "e", "f");
        when {
            "d" in items -> println(TAG + " d in set")
        }
    }
}