package com.example.week7.integrationtesting

import android.content.Context

class ResourceComparer {

    fun isEqual( context: Context, resId: Int, string : String):Boolean{
        return context.getString(resId) == string
    }
}