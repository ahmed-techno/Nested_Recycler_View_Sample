package com.ibareq.nestedrecyclerviewsample.ui.favourite

import android.view.LayoutInflater
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentFavouriteBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseFragment

class FavouriteFragment : BaseFragment<FragmentFavouriteBinding>() {

    override val LOG_TAG = FavouriteFragment::class.java.simpleName
    override val bindingInflater: (LayoutInflater) -> FragmentFavouriteBinding = FragmentFavouriteBinding::inflate

    override fun setup() {

    }
}