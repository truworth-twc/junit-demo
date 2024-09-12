package com.example.junit_aar

import android.util.Log

class PrintLogActivity {
    companion object{
        fun printLog(tagName : String,tagValue:String){
            Log.e(tagName,"Attached Dummy Text : $tagValue")
        }
    }
}