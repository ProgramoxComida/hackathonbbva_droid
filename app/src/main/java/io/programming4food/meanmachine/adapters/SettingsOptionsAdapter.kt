package io.programming4food.meanmachine.adapters

import android.app.Activity
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.programming4food.meanmachine.R
import io.programming4food.meanmachine.models.MenuOption

class SettingsOptionsAdapter(private val optionsDataset:ArrayList<MenuOption>): RecyclerView.Adapter<SettingsOptionsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val container = LayoutInflater.from(parent.context).inflate(R.layout.option_menu_item, parent, false)
        var holder:ViewHolder = ViewHolder(container)
        return holder
    }

    override fun getItemCount(): Int {
        return optionsDataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = optionsDataset[position].title
        holder.activity = optionsDataset[position].activity
    }


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title:TextView = itemView.findViewById(R.id.option_textview)
        var activity:Activity? = null

        init {
            itemView.setOnClickListener({
                var i:Intent = Intent(itemView.context, activity!!::class.java)
                itemView.context.startActivity(i)
            })
        }
    }
}