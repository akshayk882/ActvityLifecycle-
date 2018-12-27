package com.akshaykumbhar.actvitylifecycle.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akshaykumbhar.actvitylifecycle.Model.Player
import com.akshaykumbhar.actvitylifecycle.R
import com.akshaykumbhar.actvitylifecycle.Utility.PLAYER
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val player = intent.getParcelableExtra<Player>(PLAYER)
        textView6.text = "Looking for ${player.league} ${player.skill} league near you"
    }
}
