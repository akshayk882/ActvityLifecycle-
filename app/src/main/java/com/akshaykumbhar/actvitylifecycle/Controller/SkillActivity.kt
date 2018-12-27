package com.akshaykumbhar.actvitylifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.akshaykumbhar.actvitylifecycle.Model.Player
import com.akshaykumbhar.actvitylifecycle.R
import com.akshaykumbhar.actvitylifecycle.Utility.PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player= intent.getParcelableExtra(PLAYER)
        Toast.makeText(this, player.league, Toast.LENGTH_LONG).show()

    }
    fun ballerclk(view:View)
    {
        Beginnerbtn.isChecked = false
        player.skill = "Baller"
    }
    fun beginnerclk(view:View)
    {
        ballerbtn.isChecked = false
        player.skill = "Beginner"
    }
    fun finishclk(view: View)
    {
        if(player.skill != "") {
            val finalIntent = Intent(this, FinalActivity::class.java)
            finalIntent.putExtra(PLAYER,player)
            startActivity(finalIntent)
        }
        else
            Toast.makeText(this,"Select Skill",Toast.LENGTH_SHORT).show()
    }
}
