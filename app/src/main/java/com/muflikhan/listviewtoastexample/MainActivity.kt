package com.muflikhan.listviewtoastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val buah = arrayOf("Apel", "Jeruk", "Semangka", "Mangga")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, buah)
        tv_listView.adapter = adapter
        tv_listView.setOnItemClickListener { parent, view, position, id-> Toast.makeText(this, "Buah ${buah[position]}", Toast.LENGTH_SHORT).show()

        }
    }
}