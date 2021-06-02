package com.ibareq.nestedrecyclerviewsample.ui.home

import android.view.LayoutInflater
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentHomeBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val LOG_TAG = HomeFragment::class.java.simpleName
    override val bindingInflater: (LayoutInflater) -> FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun setup() {

    }
}