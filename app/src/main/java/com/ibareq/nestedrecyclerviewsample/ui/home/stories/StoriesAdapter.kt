package com.ibareq.nestedrecyclerviewsample.ui.home.stories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ibareq.nestedrecyclerviewsample.R
import com.ibareq.nestedrecyclerviewsample.data.domain.Story
import com.ibareq.nestedrecyclerviewsample.databinding.ItemAddStoryBinding
import com.ibareq.nestedrecyclerviewsample.databinding.ItemStoryBinding
import com.ibareq.nestedrecyclerviewsample.ui.home.HomeActionsListener
import java.lang.Exception

class StoriesAdapter(private val items: List<Story>,private val listener: HomeActionsListener) : RecyclerView.Adapter<StoriesAdapter.BaseStoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseStoryViewHolder {
        return when(viewType){
            VIEW_TYPE_ADD_STORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_add_story, parent, false)
                AddStoryViewHolder(view)
            }
            VIEW_TYPE_STORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
                StoryViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseStoryViewHolder, position: Int) {
        when(holder){
            is AddStoryViewHolder -> bindAddStory(holder, position)
            is StoryViewHolder -> bindStory(holder, position)
        }
    }

    private fun bindAddStory(holder: AddStoryViewHolder, position: Int){
        holder.binding.apply {
            root.setOnClickListener { listener.addNewStory() }
        }
    }

    private fun bindStory(holder: StoryViewHolder, position: Int){
        val currentStory = items[position-1]
        holder.binding.apply{
            if (currentStory.seen){
                ringStoryNotSeen.visibility = View.INVISIBLE
            } else {
                ringStoryNotSeen.visibility = View.VISIBLE
            }
            Glide.with(this.root.context).load(currentStory.imgUrl).into(imageStory)
            root.setOnClickListener { listener.onClickStory(currentStory) }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            0 -> VIEW_TYPE_ADD_STORY
            else -> VIEW_TYPE_STORY
        }
    }

    override fun getItemCount() = items.size + 1

    abstract class BaseStoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class AddStoryViewHolder(itemView: View) : BaseStoryViewHolder(itemView){
        val binding = ItemAddStoryBinding.bind(itemView)

    }
    class StoryViewHolder(itemView: View) : BaseStoryViewHolder(itemView){
        val binding = ItemStoryBinding.bind(itemView)

    }

    companion object{
        private const val VIEW_TYPE_ADD_STORY = 1
        private const val VIEW_TYPE_STORY = 2
    }
}