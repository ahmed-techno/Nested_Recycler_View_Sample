package com.ibareq.nestedrecyclerviewsample.data

import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Story

object DataSource {
    //fake data for learning only
    fun getStories(): List<Story> = listOf(

    )

    fun getPosts(): List<Post> = listOf(
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
        Post(username = "ali", date = "2021/6/3", profileImgUrl = "a", postImgUrl = "a"),
    )
}