package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_one_text, box_two_text,
                                box_three_text, box_four_text, box_five_text, constraint_layout, red_button,
            yellow_button, green_button)
        for (item in clickableViews) {
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.RED)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.material_blue_grey_800)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.material_deep_teal_500)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.material_blue_grey_950)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
