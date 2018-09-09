package io.programming4food.meanmachine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.app_bar_core.*

class UserQRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_qr)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = getString(R.string.user_title_qr)

        var uri = "http://hackathonbbvabackend-pro.jjej6axnqt.us-east-1.elasticbeanstalk.com/api/code/generate?alias=TEST&account=4772133032264209&account_type=CREDIT_CARD&reference=1234567&account_holder_name=Fidel%20Aquino"
        var imageView = findViewById<ImageView>(R.id.qr_user_image)

        Glide.with(this).load(uri).into(imageView)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}
