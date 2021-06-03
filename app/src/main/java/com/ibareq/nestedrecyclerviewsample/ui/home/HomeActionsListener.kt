package com.ibareq.nestedrecyclerviewsample.ui.home

import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Story

interface HomeActionsListener {
    fun onFavouritePost(post: Post)
    fun onPublishText(text: String)
    fun onSharePost(post: Post)
    fun onClickStory(story: Story)
    fun addNewStory()
}