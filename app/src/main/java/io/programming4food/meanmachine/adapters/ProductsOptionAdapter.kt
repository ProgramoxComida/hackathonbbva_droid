package io.programming4food.meanmachine.adapters

import android.support.v4.view.LayoutInflaterFactory
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.programming4food.meanmachine.R

import io.programming4food.meanmachine.models.Product
import kotlinx.android.synthetic.main.product_description_item.view.*

class ProductsOptionAdapter(private val productsDataset:ArrayList<Product>): RecyclerView.Adapter<ProductsOptionAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val container = LayoutInflater.from(parent.context).inflate(R.layout.product_description_item, parent, false)
        var holder:ViewHolder = ViewHolder(container)
        return holder
    }

    override fun getItemCount(): Int {
        return productsDataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.product_name.text = productsDataset[position].name
    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var product_name:TextView = itemView.findViewById(R.id.txt_product_name)

        init {

        }
    }

}