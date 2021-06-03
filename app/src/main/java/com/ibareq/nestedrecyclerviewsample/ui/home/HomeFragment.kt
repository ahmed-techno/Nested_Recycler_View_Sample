package com.ibareq.nestedrecyclerviewsample.ui.home

import android.view.LayoutInflater
import com.ibareq.nestedrecyclerviewsample.data.DataSource
import com.ibareq.nestedrecyclerviewsample.data.domain.HomeItem
import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentHomeBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseFragment
import com.ibareq.nestedrecyclerviewsample.util.toHomeItem

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val LOG_TAG = HomeFragment::class.java.simpleName
    override val bindingInflater: (LayoutInflater) -> FragmentHomeBinding = FragmentHomeBinding::inflate

    lateinit var adapter: HomeAdapter

    override fun setup() {
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.add(HomeItem(DataSource.getStories(), HomeItemType.TYPE_STORIES))
        itemsList.add(HomeItem("Update your status", HomeItemType.TYPE_NEW_POST))
        itemsList.addAll(
            DataSource.getPosts().map { it.toHomeItem() }
        )
        adapter = HomeAdapter(itemsList)
        binding.recyclerHome.adapter = adapter
    }
}