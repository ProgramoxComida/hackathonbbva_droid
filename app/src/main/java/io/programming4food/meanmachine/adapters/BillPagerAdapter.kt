package io.programming4food.meanmachine.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import io.programming4food.meanmachine.fragments.FixedAmountTabFragment
import io.programming4food.meanmachine.fragments.ProductsAmountFragment

class BillPagerAdapter(fm: FragmentManager, internal var mNumOfTabs: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> {
                return FixedAmountTabFragment()
            }
            1 -> {
                return ProductsAmountFragment()
            }
            else -> return null
        }
    }

    override fun getCount(): Int {
        return mNumOfTabs
    }
}