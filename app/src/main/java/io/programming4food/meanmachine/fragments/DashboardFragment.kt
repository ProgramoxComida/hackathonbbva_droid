package io.programming4food.meanmachine.fragments


import android.os.Bundle
import android.os.DropBoxManager
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.programming4food.meanmachine.R
import com.github.mikephil.charting.charts.LineChart
import io.programming4food.meanmachine.models.Sale


/**
 * A simple [Fragment] subclass.
 *
 */
class DashboardFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view:View = inflater.inflate(R.layout.fragment_dashboard, container, false)

        // in this example, a LineChart is initialized from xml
        val chart = view.findViewById(R.id.sales_chart) as LineChart
        val items = this.setDummyData()
        val entries = ArrayList<DropBoxManager.Entry>()

        for(i in 0 until items.size){
            entries.add(DropBoxManager.Entry(items[i].date, items[i].amount as Long))
        }
        // Inflate the layout for this fragment
        return view
    }

    private fun setDummyData():ArrayList<Sale> {
        var items:ArrayList<Sale> = ArrayList()

        var item1:Sale = Sale()
        item1.amount = 100
        item1.date = "2018-09-07"

        var item2:Sale = Sale()
        item2.amount = 100
        item2.date = "2018-09-08"

        items.add(item2)

        return items
    }
}



    /*
     - Concentración en Pagos.
     */
