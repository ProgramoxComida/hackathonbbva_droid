package io.programming4food.meanmachine.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import io.programming4food.meanmachine.R
import io.programming4food.meanmachine.models.Product
import kotlinx.android.synthetic.main.product_item.view.*

class ProductsAdapter(private val productsDataset:ArrayList<Product>): RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val container = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        var holder:ViewHolder = ViewHolder(container)
        return holder
    }

    override fun getItemCount(): Int {
        return productsDataset.size
    }

    override fun onBindViewHolder(p0: ProductsAdapter.ViewHolder, position: Int) {

    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productCheckbox:CheckBox = itemView.findViewById(R.id.product_checkbox)
        var priceText:TextView = itemView.findViewById(R.id.product_price)

        init {
            productCheckbox.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener{
                override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                    Log.d("stat", "Changed")
                }

            })
        }
    }
}