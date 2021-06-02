package com.ibareq.nestedrecyclerviewsample.ui.search

import android.view.LayoutInflater
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentHomeBinding
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentSearchBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    override val LOG_TAG = SearchFragment::class.java.simpleName
    override val bindingInflater: (LayoutInflater) -> FragmentSearchBinding = FragmentSearchBinding::inflate

    override fun setup() {

    }
}