package io.programming4food.meanmachine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.net.sip.SipErrorCode.TIME_OUT
import android.content.Intent



class SplashActivity : AppCompatActivity() {
    private val TIMER: Int = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val i = Intent(this@SplashActivity, CoreActivity::class.java)
            startActivity(i)
            finish()
        }, TIMER.toLong())
    }
}
