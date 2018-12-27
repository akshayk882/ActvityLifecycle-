package com.akshaykumbhar.actvitylifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.akshaykumbhar.actvitylifecycle.Model.Player
import com.akshaykumbhar.actvitylifecycle.R
import com.akshaykumbhar.actvitylifecycle.Utility.PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun ActivityNextClick(view:View)
    {
        if(player.league!= "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(PLAYER,player)
            startActivity(skillIntent)
        }
        else
            Toast.makeText(this ,"Select a League", Toast.LENGTH_SHORT).show()
    }
    fun menbtnclk(view: View)
    {
        womenbtn.isChecked = false
        coedbtn.isChecked = false
       player.league = "mens"
    }
    fun womenbtnclk(view: View)
    {
        menbtn.isChecked = false
       player.league = "womens"
    }
    fun coedbtnclk(view: View)
    {
        menbtn.isChecked = false
        womenbtn.isChecked = false
       player.league = "Co-Ed"
    }
}
