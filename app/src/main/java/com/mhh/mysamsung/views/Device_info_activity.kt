package com.mhh.mysamsung.views

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.mhh.mysamsung.R
import com.squareup.picasso.Picasso
import com.transitionseverywhere.Fade
import com.transitionseverywhere.Transition
import com.transitionseverywhere.TransitionManager
import io.github.muddz.styleabletoast.StyleableToast


class Device_info_activity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_info)

        val tvDisplay: TextView = findViewById(R.id.tvi)
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
        val t2 = findViewById<TextView>(R.id.tv2)
        val t3 = findViewById<TextView>(R.id.tv3)
        val t4 = findViewById<TextView>(R.id.tv4)
        val t5 = findViewById<TextView>(R.id.tv5)
        val t6 = findViewById<TextView>(R.id.tv6)
        val t7 = findViewById<TextView>(R.id.tv7)
        val t8 = findViewById<TextView>(R.id.tv8)
        val t9 = findViewById<TextView>(R.id.tv9)
        val t10 = findViewById<TextView>(R.id.tv10)
        val t11 = findViewById<TextView>(R.id.tv11)
        val t12 = findViewById<TextView>(R.id.tv12)
        val t13 = findViewById<TextView>(R.id.tv13)
        val t14 = findViewById<TextView>(R.id.tv14)
        val t15 = findViewById<TextView>(R.id.tv15)
        val t16 = findViewById<TextView>(R.id.tt1)
        val t17 = findViewById<TextView>(R.id.tt2)
        val t18 = findViewById<TextView>(R.id.tt3)
        val t19 = findViewById<TextView>(R.id.tvi)
        val t20 = findViewById<ImageView>(R.id.imv1)
        val t21 = findViewById<Button>(R.id.bt1)
        val t22 = findViewById<Button>(R.id.bt2)

        Handler().postDelayed({
            val transition: Transition = Fade()
            transition.duration = 1200
            TransitionManager.beginDelayedTransition(r, transition)
            t1.visibility = View.VISIBLE
            t2.visibility = View.VISIBLE
            t3.visibility = View.VISIBLE
            t4.visibility = View.VISIBLE
            t5.visibility = View.VISIBLE
            t6.visibility = View.VISIBLE
            t7.visibility = View.VISIBLE
            t8.visibility = View.VISIBLE
            t9.visibility = View.VISIBLE
            t10.visibility = View.VISIBLE
            t11.visibility = View.VISIBLE
            t12.visibility = View.VISIBLE
            t13.visibility = View.VISIBLE
            t14.visibility = View.VISIBLE
            t15.visibility = View.VISIBLE
            t16.visibility = View.VISIBLE
            t17.visibility = View.VISIBLE
            t18.visibility = View.VISIBLE
            t19.visibility = View.VISIBLE
            t20.visibility = View.VISIBLE
            t21.visibility = View.VISIBLE
            t22.visibility = View.VISIBLE

        }, 200)

        //OnClick --------------------------------
        @SuppressLint("CutPasteId") val bt1 = findViewById<View>(R.id.bt1) as Button
        bt1.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_DIAL)
                startActivity(intent)
                startActivity(intent)
            } catch (e: Exception) {
                StyleableToast.makeText(applicationContext, getString(R.string.phone_support2), Toast.LENGTH_LONG, R.style.support_toast).show()
            }
        }

        @SuppressLint("CutPasteId") val bt2 = findViewById<View>(R.id.bt2) as Button
        bt2.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_DIAL)
                startActivity(intent)
                startActivity(intent)
            } catch (e: Exception) {
                StyleableToast.makeText(applicationContext, getString(R.string.phone_support2), Toast.LENGTH_LONG, R.style.support_toast).show()
            }
        }

        //Image links

        //Image links
        val ImageView = findViewById<View>(R.id.imv1) as ImageView
        Picasso.get()
            .load("https://s8.uupload.ir/files/screenshot_20230615_122600_hwmoduletest_l516.jpg")
            .placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView)

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