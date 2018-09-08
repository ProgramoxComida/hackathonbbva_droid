package io.programming4food.meanmachine.fragments


import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment

import io.programming4food.meanmachine.R
import android.support.design.widget.TabLayout
import io.programming4food.meanmachine.adapters.BillPagerAdapter
import android.support.v4.view.ViewPager
import android.view.*
import io.programming4food.meanmachine.R.string.action_settings

/**
 * A simple [Fragment] subclass.
 *
 */
class BillFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view:View = inflater.inflate(R.layout.fragment_bill, container, false)

        val tabLayout = view.findViewById(R.id.tab_layout) as TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Monto Fijo"))
        tabLayout.addTab(tabLayout.newTab().setText("Productos"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val viewPager:ViewPager = view.findViewById(R.id.pager)
        val adapter = BillPagerAdapter(fragmentManager!!, tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        return view
    }
}
