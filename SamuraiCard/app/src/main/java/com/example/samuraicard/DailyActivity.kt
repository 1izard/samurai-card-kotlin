package com.example.samuraicard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_daily.*

class DailyActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)

        checkBox1.text = getString(R.string.daily_check1)
        checkBox2.text = getString(R.string.daily_check2)
        checkBox3.text = getString(R.string.daily_check3)
        checkBox4.text = getString(R.string.daily_check4)
        checkBox5.text = getString(R.string.daily_check5)
        checkBox6.text = getString(R.string.daily_check6)
        checkBox7.text = getString(R.string.daily_check7)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
