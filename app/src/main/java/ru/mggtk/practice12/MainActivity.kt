package ru.mggtk.practice12

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView1 = findViewById<ImageView>(R.id.imageView2)
        val imageView2 = findViewById<ImageView>(R.id.imageView3)
        val imageView3 = findViewById<ImageView>(R.id.imageView4)

        imageView1.visibility = View.INVISIBLE
        imageView2.visibility = View.INVISIBLE
        imageView3.visibility = View.INVISIBLE
    }

    fun onRadioButtonClicked(view: View){
        val imageView = findViewById<ImageView>(R.id.imageView)

        val appleRadioButton = findViewById<RadioButton>(R.id.radioButton1)
        val pearRadioButton =  findViewById<RadioButton>(R.id.radioButton2)
        val grapeRadioButton = findViewById<RadioButton>(R.id.radioButton3)

        if(appleRadioButton.isChecked) imageView.setImageResource(R.drawable.apple)

        else if(pearRadioButton.isChecked) imageView.setImageResource(R.drawable.pear)

        else imageView.setImageResource(R.drawable.grape)
    }

    fun onCheckButtonClicked(view: View){
        val imageView1 = findViewById<ImageView>(R.id.imageView2)
        val imageView2 = findViewById<ImageView>(R.id.imageView3)
        val imageView3 = findViewById<ImageView>(R.id.imageView4)
        //Buttons
        val appleCheckBox = findViewById<CheckBox>(R.id.checkBox)
        val pearCheckBox = findViewById<CheckBox>(R.id.checkBox2)
        val grapeCheckBox = findViewById<CheckBox>(R.id.checkBox3)
        //

        if(appleCheckBox.isChecked) imageView1.visibility=View.VISIBLE
        else imageView1.visibility=View.INVISIBLE

        if(pearCheckBox.isChecked) imageView2.visibility=View.VISIBLE
        else imageView2.visibility=View.INVISIBLE

        if(grapeCheckBox.isChecked) imageView3.visibility=View.VISIBLE
        else imageView3.visibility=View.INVISIBLE
    }
}