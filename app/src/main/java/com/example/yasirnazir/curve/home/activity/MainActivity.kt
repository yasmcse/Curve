package com.example.yasirnazir.curve.home.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yasirnazir.curve.R
import com.example.yasirnazir.curve.home.fragment.FragmentInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = FragmentInputLayout.createNewFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}
