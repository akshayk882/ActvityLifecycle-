package com.akshaykumbhar.actvitylifecycle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun ActivityNextClick(view:View)
    {
        val skillIntent = Intent(this, SkillActivity:: class.java)
        startActivity(skillIntent)
    }
}
