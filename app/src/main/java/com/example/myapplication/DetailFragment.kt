package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("STATE", "DetailFragment.onCreate")
    }
}