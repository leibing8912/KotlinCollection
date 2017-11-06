package com.yy.live.kotlincollection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.yy.live.kotlincollection.base.BaseKotlin;
import com.yy.live.kotlincollection.classextends.ExtendsCls;

/**
 * @className: MainActivity
 * @classDescription: main page
 * @author: leibing
 * @email: leibing@yy.com
 * @createTime:2017/11/6
 */
public class MainActivity extends AppCompatActivity {
    // TAG
    private final String TAG = "Kotlin MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // base kotlin
        baseKotlin();
        // class extends
        classExtends();
    }

    /**
     * class extends
     * @author leibing
     * @createTime 2017/11/6
     */
    private void classExtends() {
        ExtendsCls extendCls = new ExtendsCls();
        extendCls.a();
    }

    /**
     * base kotlin
     *
     * @author leibing
     * @createTime 2017/11/6
     */
    private void baseKotlin() {
        BaseKotlin baseKt = new BaseKotlin();
        // property
        baseKt.setA(2);
        Log.e(TAG, " a = " + baseKt.getA());
        baseKt.setC("set c");
        Log.e(TAG, " c = " + baseKt.getC());
        Log.e(TAG, " b = " + baseKt.getB());
        // method
        Log.e(TAG, " 1 plus 3 = " + baseKt.add(1, 3));
        Log.e(TAG, " 2 plus 8 = " + baseKt.adds(2, 8));
        Log.e(TAG, " select max: " + baseKt.max(1, 8));
        Log.e(TAG, " select maxs : " + baseKt.maxs(2, 5));
        Log.e(TAG, " getString length : " + baseKt.getStringLength(123));
        baseKt.forLoop();
        baseKt.forWhile();
        Log.e(TAG, " for when :" + baseKt.forWhen(1));
        baseKt.forRanges(2);
        baseKt.forSet();
    }
}
