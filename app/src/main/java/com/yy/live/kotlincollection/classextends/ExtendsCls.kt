package com.yy.live.kotlincollection.classextends

/**
 * @className: ExtendsCls
 * @classDescription: extends class
 * @author: leibing
 * @email: leibing@yy.com
 * @createTime:2017/11/6
 */
class ExtendsCls: BaseCls(){

    /**
     * method:a
     */
    override fun a() {
        println(TAG + " ExtendsCls a()")
        super.a()
    }
}