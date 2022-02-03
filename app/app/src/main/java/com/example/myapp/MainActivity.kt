package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

const val NCREATE = "Activity CREATED"
const val NSTART = "Activity STARTED"
const val NRESUME = "Activity RESUME"
const val NPAUSE = "Activity PAUSED"
const val NSTOP = "Activity STOPPED"
const val NRESTART = "Activity RESTARTED"
const val NDESTROY = "Activity DESTROYED"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var c = Toast.makeText(this,NCREATE,Toast.LENGTH_SHORT)
        c.setGravity(Gravity.NO_GRAVITY,0,0)
        c.show()
    }
    override fun onStart() {
        super.onStart()
        var sta = Toast.makeText(this, NSTART,Toast.LENGTH_SHORT)
        sta.setGravity(Gravity.LEFT,0,0)
        sta.show()
    }
    override fun onResume() {
        super.onResume()
        var r = Toast.makeText(this, NRESUME,Toast.LENGTH_SHORT)
        r.setGravity(Gravity.TOP,0,0)
        r.show()
    }
    override fun onPause() {
        super.onPause()
        var p = Toast.makeText(this, NPAUSE,Toast.LENGTH_SHORT)
        p.setGravity(Gravity.RIGHT,0,0)
        p.show()
    }
    override fun onStop() {
        super.onStop()
        var s = Toast.makeText(this, NSTOP,Toast.LENGTH_SHORT)
        s.setGravity(Gravity.CENTER,0,0)
        s.show()
    }
    override fun onRestart() {
        super.onRestart()
        var resta = Toast.makeText(this, NRESTART,Toast.LENGTH_SHORT)
        resta.setGravity(Gravity.FILL_HORIZONTAL,0,0)
        resta.show()
    }
    override fun onDestroy() {
        super.onDestroy()
        var d = Toast.makeText(this, NDESTROY,Toast.LENGTH_SHORT)
        d.setGravity(Gravity.FILL,0,0)
        d.show()
    }
}



