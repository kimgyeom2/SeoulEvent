package com.gy25m.lastdance.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gy25m.lastdance.model.User

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