package com.akshaykumbhar.actvitylifecycle.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akshaykumbhar.actvitylifecycle.R
import com.akshaykumbhar.actvitylifecycle.Utility.KEY
import com.akshaykumbhar.actvitylifecycle.Utility.SKILL
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        var league = intent.getStringExtra(KEY)
        var skill = intent.getStringExtra(SKILL)
        textView6.text = "Looking for $league $skill league near you"
    }
}
