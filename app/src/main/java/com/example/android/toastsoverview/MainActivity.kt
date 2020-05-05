package com.example.android.toastsoverview

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService
import kotlinx.android.synthetic.main.custom_toast.*
import kotlinx.android.synthetic.main.custom_toast.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // The Basics
        val context = applicationContext
        val text = "Testing Basic Toast"
        val toast  = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        toast.show()
        */

        /*
        // Custom Position Toast
        val context = applicationContext
        val text = "Testing Custom positioned Toast"
        val toast  = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP or Gravity.END, 0, 200)
        toast.show()
        */


        // Custom View Toast
        val inflater = layoutInflater
        val layout: ViewGroup = inflater.inflate(R.layout.custom_toast, custom_toast_container) as ViewGroup
        val text: TextView = layout.text
        text.text = "Testing Custom view Toast"
        with(Toast(applicationContext)) {
            setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}
