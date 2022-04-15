package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.base.BaseActivity
import com.example.base.BaseViewModel
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : BaseActivity<BaseViewModel,ActivityMainBinding>() {

    //R.layout.activity_main
    override fun startWork() {

    }

    override fun createViewModel(): BaseViewModel {
        TODO("Not yet implemented")
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }
}