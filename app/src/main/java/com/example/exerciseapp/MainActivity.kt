package com.example.exerciseapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var adapter : ExerciseAdapter?
        var exList : ArrayList<ItemExercise>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class ExerciseAdapter : BaseAdapter {
        override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
         val exercise = this.exList[position]

        }

        override fun getItem(p0: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(p0: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        var exList : ArrayList<ItemExercise>()
        var context : Context? = null


    }
}
