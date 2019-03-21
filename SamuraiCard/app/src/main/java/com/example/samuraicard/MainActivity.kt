package com.example.samuraicard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox1.text = getString(R.string.drinking_check1)
        checkBox2.text = getString(R.string.drinking_check2)
        checkBox3.text = getString(R.string.drinking_check3)
        checkBox4.text = getString(R.string.drinking_check4)
        checkBox5.text = getString(R.string.drinking_check5)
        checkBox6.text = getString(R.string.drinking_check6)
        checkBox7.text = getString(R.string.drinking_check7)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            var intent = Intent(this, DailyActivity::class.java)
            startActivity(intent)
        }
    }
}
