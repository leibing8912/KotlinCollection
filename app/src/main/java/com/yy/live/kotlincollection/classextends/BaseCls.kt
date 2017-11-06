package com.yy.live.kotlincollection.classextends

/**
 * @className: BaseCls
 * @classDescription: base class
 * @author: leibing
 * @email: leibing@yy.com
 * @createTime:2017/11/6
 */
open class BaseCls {
    // TAG
    val TAG = "Kotlin BaseCls"

    /**
     * constructor
     */
    open class BaseCls(name: String){
        init {
            println("Kotlin BaseCls Constructor name = " + name)
        }
    }

    /**
     * method:a
     */
    open fun a(){
        println(TAG + " BaseCls a()")
    }

    /**
     * method:b
     */
    fun b(){}
}