package com.example.junit_aar

import android.util.Log

class PrintLogActivity {
    companion object{
        fun printLog(tagName : String,tagValue:String){
            Log.e(tagName,"This is default value message Dynamic message : $tagValue")
        }
    }
}