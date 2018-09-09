package io.programming4food.meanmachine.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.programming4food.meanmachine.R
import io.programming4food.meanmachine.adapters.ProductsAdapter
import io.programming4food.meanmachine.adapters.ProductsOptionAdapter
import io.programming4food.meanmachine.models.Product

/**
 * A simple [Fragment] subclass.
 *
 */
class ProductsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_products, container, false)

        var products:ArrayList<Product> = this.setProducts()

        viewManager = LinearLayoutManager(view.context)
        viewAdapter = ProductsOptionAdapter(products)

        recyclerView = view.findViewById<RecyclerView>(R.id.products_recycler_view).apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter

        }

        return view
    }

    private fun setProducts():ArrayList<Product> {
        var p:ArrayList<Product> = ArrayList()

        var p1:Product = Product()
        p1.name = "Quesadillas de Chicharrón"
        p1.price = 20.00

        var p2:Product = Product()
        p2.name = "Quesadillas de Tinga"
        p2.price = 20.00

        var p3:Product = Product()
        p3.name = "Quesadillas de Flor de Calabaza"
        p3.price = 20.00

        var p4:Product = Product()
        p4.name = "Quesadillas de Huitlacoche"
        p4.price = 20.00

        var p5:Product = Product()
        p5.name = "Quesadillas de Queso"
        p5.price = 20.00

        p.add(p1)
        p.add(p2)
        p.add(p3)
        p.add(p4)
        p.add(p5)

        return p
    }


}
