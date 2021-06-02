package com.ibareq.nestedrecyclerviewsample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ibareq.nestedrecyclerviewsample.R
import com.ibareq.nestedrecyclerviewsample.databinding.ActivityMainBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val LOG_TAG = MainActivity::class.simpleName

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {

    }

}