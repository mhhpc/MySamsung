package com.mhh.mysamsung.views

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.mhh.mysamsung.R
import com.transitionseverywhere.Fade
import com.transitionseverywhere.Transition
import com.transitionseverywhere.TransitionManager
import io.github.florent37.shapeofview.shapes.RoundRectView

class Device_info_activity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_info)

        val tvDisplay: TextView = findViewById(R.id.tv1)
        tvDisplay.text = getSystemDetail()

        //Gradient -----------
        val nestedScrollView = findViewById<NestedScrollView>(R.id.device_info)
        val animationDrawable = nestedScrollView.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()

        val collapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        val animationDrawable2 = collapsingToolbarLayout.background as AnimationDrawable
        animationDrawable2.setEnterFadeDuration(2000)
        animationDrawable2.setExitFadeDuration(4000)
        animationDrawable2.start()

        //Animation ------------
        val r = findViewById<ViewGroup>(R.id.device_info)
        val t1 = findViewById<TextView>(R.id.tv1)
        val t2 = findViewById<TextView>(R.id.tv0)

        Handler().postDelayed({
            val transition: Transition = Fade()
            transition.duration = 1200
            TransitionManager.beginDelayedTransition(r, transition)
            t1.visibility = View.VISIBLE
            t2.visibility = View.VISIBLE

        }, 200)

    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("HardwareIds")
    private fun getSystemDetail(): String {
        return "Brand: ${Build.BRAND} \n" +
                "Android ID: ${
                    Settings.Secure.getString(
                        contentResolver,
                        Settings.Secure.ANDROID_ID
                    )
                } \n" +
                "Model: ${Build.MODEL} \n" +
                "Device ID: ${Build.ID} \n" +
                "Android V: ${Build.VERSION.RELEASE} \n" +
                "SDK: ${Build.VERSION.SDK_INT} \n" +
                "Security Patch: ${Build.VERSION.SECURITY_PATCH} \n" +
                "Manufacture: ${Build.MANUFACTURER} \n" +
                "User: ${Build.USER} \n" +
                "Type: ${Build.TYPE} \n" +
                "Baseband V: ${Build.VERSION.INCREMENTAL} \n" +
                "Board: ${Build.BOARD} \n" +
                "Host: ${Build.HOST} \n" +
                "Hardware: ${Build.HARDWARE}"

    }

}