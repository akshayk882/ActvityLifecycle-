package com.akshaykumbhar.actvitylifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.akshaykumbhar.actvitylifecycle.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill= ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(KEY)
        Toast.makeText(this, league, Toast.LENGTH_LONG).show()

    }
    fun ballerclk(view:View)
    {
        Beginnerbtn.isChecked = false
        skill = "Baller"
    }
    fun beginnerclk(view:View)
    {
        ballerbtn.isChecked = false
        skill = "Beginner"
    }
    fun finishclk(view: View)
    {
        if(skill != "") {
            val finalIntent = Intent(this, FinalActivity::class.java)
            finalIntent.putExtra(KEY,league)
            finalIntent.putExtra(SKILL,skill)
            startActivity(finalIntent)
        }
        else
            Toast.makeText(this,"Select Skill",Toast.LENGTH_SHORT).show()
    }
}
