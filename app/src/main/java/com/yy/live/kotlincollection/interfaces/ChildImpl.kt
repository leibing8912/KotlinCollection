package com.yy.live.kotlincollection.interfaces

/**
 * @className: ChildImpl
 * @classDescription: child impl
 * @author: leibing
 * @email: leibing@yy.com
 * @createTime:2017/11/6
 */
class ChildImpl : IParent{

    /**
     * method:a
     */
    override fun a() {
         println(TAG + " ChildImpl a()");
    }
}