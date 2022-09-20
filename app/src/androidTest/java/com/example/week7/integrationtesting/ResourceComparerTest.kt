package com.example.week7.integrationtesting

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import com.example.week7.R
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


internal class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    /*@After
    fun teardown(){

    }*/

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        Log.d("ObjVal",resourceComparer.toString())
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name,"Week 7")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsFalse(){
        Log.d("ObjVal2",resourceComparer.toString())
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name,"HelloWorld")
        assertThat(result).isFalse()
    }
}