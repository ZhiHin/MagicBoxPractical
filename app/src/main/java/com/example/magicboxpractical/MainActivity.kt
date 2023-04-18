package com.example.magicboxpractical

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        var boxOneText = findViewById<TextView>(R.id.box_one_text)
        var boxTwoText = findViewById<TextView>(R.id.box_two_text)
        var boxThreeText = findViewById<TextView>(R.id.box_three_text)
        var boxFourText = findViewById<TextView>(R.id.box_four_text)
        var boxFiveText = findViewById<TextView>(R.id.box_five_text)

        var rootConstraintLayout = findViewById<View>(R.id.ConstraintLayout)

        var clickableView: List<View> =
            listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout)

        for(item in clickableView){
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view:View){
        when(view.id){
            //boxes using color class for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}