package com.cannybits.trigonometrytable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSinZero.text = sin(0.0).toString()
        tvSin15.text = sin(15.0).toString()
        tvSin30.text = sin(30.0).toString()
        tvSin45.text = sin(45.0).toString()
        tvSin60.text = sin(60.0).toString()
        tvSin90.text = sin(90.0).toString()
        tvSin180.text = sin(180.0).toString()

        tvCosZero.text = cos(0.0).toString()
        tvCos15.text = cos(15.0).toString()
        tvCos30.text = cos(30.0).toString()
        tvCos45.text = cos(45.0).toString()
        tvCos60.text = cos(60.0).toString()
        tvCos90.text = cos(90.0).toString()
        tvCos180.text = cos(180.0).toString()

        tvTanZero.text = tan(0.0).toString()
        tvTan15.text = tan(15.0).toString()
        tvTan30.text = tan(30.0).toString()
        tvTan45.text = tan(45.0).toString()
        tvTan60.text = tan(60.0).toString()
        tvTan90.text = tan(90.0).toString()
        tvTan180.text = tan(180.0).toString()



    }

}