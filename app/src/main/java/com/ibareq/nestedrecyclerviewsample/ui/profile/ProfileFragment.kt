package com.ibareq.nestedrecyclerviewsample.ui.profile

import android.view.LayoutInflater
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentProfileBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override val LOG_TAG = ProfileFragment::class.java.simpleName
    override val bindingInflater: (LayoutInflater) -> FragmentProfileBinding = FragmentProfileBinding::inflate

    override fun setup() {

    }
}