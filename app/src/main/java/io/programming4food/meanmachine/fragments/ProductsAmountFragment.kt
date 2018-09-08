package io.programming4food.meanmachine.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.programming4food.meanmachine.R


/**
 * A simple [Fragment] subclass.
 *
 */
class ProductsAmountFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products_amount, container, false)
    }


}
