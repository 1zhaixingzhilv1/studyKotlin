package com.example.base

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VM:BaseViewModel,DB : ViewDataBinding> : AppCompatActivity() {


    //处理逻辑业务
    protected abstract fun startWork()

    //创建viewmodel
    protected abstract fun createViewModel():VM


    //获取当前activity布局文件,并初始化我们的binding
    protected abstract fun getLayout():Int

    //activity的binding对象
    protected lateinit var mBinding:DB

    protected lateinit var mViewModel:VM

    protected var isLoad = false//是否已经加载过这个activity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!isLoad) {
            //初始化binding
            mBinding = DataBindingUtil.setContentView(this,getLayout())

            //给binding加上感知生命周期，AppCompatActivity就是lifeOwner
            mBinding.lifecycleOwner = this

            mViewModel = createViewModel()

            //业务处理
            startWork()

            isLoad = true
        }

    }

}