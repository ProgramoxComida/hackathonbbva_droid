package io.programming4food.meanmachine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.app_bar_core.*

class QRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = getString(R.string.title_qr)

        var amount:String = intent.getStringExtra("amount")

        var uri = "http://hackathonbbvabackend-pro.jjej6axnqt.us-east-1.elasticbeanstalk.com/api/code/generate?alias=CREDITCARD&account=4772133032264209&account_type=CREDIT_CARD&reference=1234567&account_holder_name=Fidel%20Aquino&amount=" + amount
        var imageView = findViewById<ImageView>(R.id.qr_image)

        Glide.with(this).load(uri).into(imageView)

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
