package com.yy.live.kotlincollection.interfaces

/**
 * @className: IParent
 * @classDescription: interface parent
 * @author: leibing
 * @email: leibing@yy.com
 * @createTime:2017/11/6
 */
interface IParent {
    // TAG
    val TAG: String
        get() = "Kotlin IParent"

    /**
     * method: a
     */
    fun a()

    /**
     * method:b
     */
    fun b() {
        println(TAG + " IParent b()")
    }
}