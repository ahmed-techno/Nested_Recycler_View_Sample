package com.ibareq.nestedrecyclerviewsample.ui.home

import android.view.LayoutInflater
import android.widget.Toast
import com.ibareq.nestedrecyclerviewsample.data.DataSource
import com.ibareq.nestedrecyclerviewsample.data.domain.HomeItem
import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Story
import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType
import com.ibareq.nestedrecyclerviewsample.databinding.FragmentHomeBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseFragment
import com.ibareq.nestedrecyclerviewsample.util.toHomeItem

class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionsListener {

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
        adapter = HomeAdapter(itemsList, this)
        binding.recyclerHome.adapter = adapter
    }

    override fun onFavouritePost(post: Post) {
        Toast.makeText(context, "favourit post from ${post.username}", Toast.LENGTH_SHORT).show()
        //TODO: add real action
    }

    override fun onPublishText(text: String) {
        Toast.makeText(context, "publish: $text", Toast.LENGTH_SHORT).show()
        //TODO: add real action
    }

    override fun onSharePost(post: Post) {
        Toast.makeText(context, "share post from ${post.username}", Toast.LENGTH_SHORT).show()
        //TODO: add real action
    }

    override fun onClickStory(story: Story) {
        Toast.makeText(context, "click story ${story}", Toast.LENGTH_SHORT).show()
        //TODO: add real action
    }

    override fun addNewStory() {
        Toast.makeText(context, "navigate to add story screen", Toast.LENGTH_SHORT).show()
        //TODO: add real action
    }
}