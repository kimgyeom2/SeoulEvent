package com.gy25m.seoulevent.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gy25m.seoulevent.model.User

object BindingAdapter
{
    @BindingAdapter("ItemList")
    @JvmStatic
    fun setRecyclerViewProperties(recyclerView: RecyclerView, data: List<User>?) {
        recyclerView.adapter=RecyclerAdapter()
        if (recyclerView.adapter is RecyclerAdapter) {
            (recyclerView.adapter as RecyclerAdapter).submitList(data ?: emptyList())
        }
    }
}