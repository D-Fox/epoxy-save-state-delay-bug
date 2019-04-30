package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.root, Fragment.instantiate(this, ListFragment::class.java.name)).commit()
        }

        findViewById<View>(R.id.btn).setOnClickListener {
            goToNextScreen()
        }
    }

    private fun goToNextScreen() {
        Log.d("STATE", "MainActivity.goToNextScreen")
        supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.root, Fragment.instantiate(this, DetailFragment::class.java.name)).commit()
    }
}
