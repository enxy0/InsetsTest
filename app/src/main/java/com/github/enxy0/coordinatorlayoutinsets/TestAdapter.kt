package com.github.enxy0.coordinatorlayoutinsets

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class TestAdapter : ListAdapter<String, TestAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(
            oldItem: String,
            newItem: String
        ): Boolean = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: String,
            newItem: String
        ): Boolean = oldItem == newItem
    }
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_adapter, parent, false) as TextView
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position))
    }

    class ViewHolder(
        private val view: TextView
    ) : RecyclerView.ViewHolder(view) {

        fun bind(text: String) {
            view.text = text
        }
    }
}
