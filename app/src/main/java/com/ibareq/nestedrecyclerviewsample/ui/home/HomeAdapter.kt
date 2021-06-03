package com.ibareq.nestedrecyclerviewsample.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ibareq.nestedrecyclerviewsample.R
import com.ibareq.nestedrecyclerviewsample.data.domain.HomeItem
import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Story
import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType
import com.ibareq.nestedrecyclerviewsample.databinding.ItemNewPostBinding
import com.ibareq.nestedrecyclerviewsample.databinding.ItemPostBinding
import com.ibareq.nestedrecyclerviewsample.databinding.ItemStoriesListBinding
import com.ibareq.nestedrecyclerviewsample.ui.home.stories.StoriesAdapter
import java.lang.Exception

class HomeAdapter(private val items: List<HomeItem<Any>>) : RecyclerView.Adapter<HomeAdapter.BaseHomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
        return when(viewType){
            VIEW_TYPE_STORIES -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stories_list, parent, false)
                StoriesViewHolder(view)
            }
            VIEW_TYPE_NEW_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_new_post, parent, false)
                NewPostViewHolder(view)
            }
            VIEW_TYPE_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
                PostViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when(holder){
            is StoriesViewHolder -> bindStories(holder, position)
            is NewPostViewHolder -> bindNewPost(holder, position)
            is PostViewHolder -> bindPost(holder, position)
        }
    }

    private fun bindStories(holder: StoriesViewHolder, position: Int){
        val stories = items[position].item as List<Story>
        val adapter = StoriesAdapter(stories)
        holder.binding.apply {
            recyclerStories.adapter = adapter
        }
    }

    private fun bindNewPost(holder: NewPostViewHolder, position: Int){
        val hintText = items[position].item as String
        holder.binding.apply {
            inputNewPost.hint = hintText
        }
    }

    private fun bindPost(holder: PostViewHolder, position: Int){
        val currentPost = items[position].item as Post
        holder.binding.apply {
            textUsername.text = currentPost.username
            textDate.text = currentPost.date
            Glide.with(this.root.context).load(currentPost.postImgUrl).into(imagePost)
            Glide.with(this.root.context).load(currentPost.profileImgUrl).into(imageProfile)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_STORIES -> VIEW_TYPE_STORIES
            HomeItemType.TYPE_NEW_POST -> VIEW_TYPE_NEW_POST
            HomeItemType.TYPE_POST -> VIEW_TYPE_POST
        }
    }


    abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class PostViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemPostBinding.bind(itemView)
    }
    class NewPostViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemNewPostBinding.bind(itemView)
    }
    class StoriesViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemStoriesListBinding.bind(itemView)
    }

    companion object{
        private const val VIEW_TYPE_STORIES = 1
        private const val VIEW_TYPE_NEW_POST = 2
        private const val VIEW_TYPE_POST = 3
    }
}