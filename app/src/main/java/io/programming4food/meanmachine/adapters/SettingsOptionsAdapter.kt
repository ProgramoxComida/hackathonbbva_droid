package io.programming4food.meanmachine.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.programming4food.meanmachine.R

class SettingsOptionsAdapter(private val optionsDataset:Array<String>): RecyclerView.Adapter<SettingsOptionsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val container = LayoutInflater.from(parent.context).inflate(R.layout.option_menu_item, parent, false)
        var holder:ViewHolder = ViewHolder(container)
        return holder
    }

    override fun getItemCount(): Int {
        return optionsDataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = optionsDataset[position]
    }


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title:TextView = itemView.findViewById(R.id.option_textview)

        init {

        }
    }
}