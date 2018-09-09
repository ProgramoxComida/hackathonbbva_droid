package io.programming4food.meanmachine.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.programming4food.meanmachine.R
import io.programming4food.meanmachine.adapters.SettingsOptionsAdapter

/**
 * A simple [Fragment] subclass.
 *
 */
class SettingsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_settings, container, false)

        var options:Array<String> = arrayOf("Mi código QR", "Test 2", "Test 3")

        viewManager = LinearLayoutManager(view.context)
        viewAdapter = SettingsOptionsAdapter(options)

        recyclerView = view.findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter

        }

        return view
    }


}
