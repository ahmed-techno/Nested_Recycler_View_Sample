package com.ibareq.nestedrecyclerviewsample.ui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.ibareq.nestedrecyclerviewsample.R

abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {

    abstract val LOG_TAG: String?
    abstract val bindingInflater: (LayoutInflater) -> VB
    private var _binding: ViewBinding? = null

    protected val binding
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_NestedRecyclerViewSample)
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(binding.root)
        setup()
    }

    abstract fun setup()

    protected fun log(value: Any){
        Log.v(LOG_TAG, value.toString())
    }
}