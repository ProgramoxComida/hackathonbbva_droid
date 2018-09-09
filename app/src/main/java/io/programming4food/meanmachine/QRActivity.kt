package io.programming4food.meanmachine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import kotlinx.android.synthetic.main.app_bar_core.*

class QRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = getString(R.string.title_qr)

        val finish = findViewById<Button>(R.id.finish_button)
        finish.setOnClickListener({
            finish()
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}
