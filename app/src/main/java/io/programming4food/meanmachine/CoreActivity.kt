package io.programming4food.meanmachine

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import io.programming4food.meanmachine.fragments.BillFragment
import io.programming4food.meanmachine.fragments.DashboardFragment
import io.programming4food.meanmachine.fragments.ProductsFragment
import io.programming4food.meanmachine.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_core.*
import kotlinx.android.synthetic.main.app_bar_core.*

class CoreActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var newFragment: android.support.v4.app.Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar!!.setTitle(R.string.dashboard_title)

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.core, menu)
        return true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.dashboard -> {
                supportActionBar!!.setTitle(R.string.dashboard_title)
                newFragment = DashboardFragment()
            }
            R.id.bill -> {
                supportActionBar!!.setTitle(R.string.bill_title)
                newFragment = BillFragment()
            }
            R.id.products -> {
                supportActionBar!!.setTitle(R.string.products_title)
                newFragment = ProductsFragment()
            }
            R.id.options -> {
                supportActionBar!!.setTitle(R.string.options_title)
                newFragment = SettingsFragment()
            }
            R.id.logout -> {
                supportActionBar!!.setTitle(R.string.logout)
            }
        }

        if(newFragment != null){
            var ft: android.support.v4.app.FragmentTransaction? = supportFragmentManager.beginTransaction()
            if (ft != null) {
                ft.replace(R.id.content_frame, newFragment!!)
                ft.commit()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
