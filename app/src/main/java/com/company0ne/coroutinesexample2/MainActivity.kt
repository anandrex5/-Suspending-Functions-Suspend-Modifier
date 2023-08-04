package com.company0ne.coroutinesexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }
        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }
    }
    suspend fun task1(){
        Log.d("TAG","Starting Task 1")
        yield()
        Log.d("TAG","Ending Task 1")
    }
    suspend fun task2(){
        Log.d("TAG","Starting Task 2")
        yield()
        Log.d("TAG","Ending Task 2")
    }
}