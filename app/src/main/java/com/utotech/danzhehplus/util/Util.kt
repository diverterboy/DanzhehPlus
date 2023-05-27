package com.utotech.danzhehplus.util

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.app.Activity
import android.view.animation.LinearInterpolator
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2

class Util {
    fun animate(pagerVocab: ViewPager2){
          val anim = ValueAnimator.ofFloat(1f, 1.5f)
    anim.duration = 300
    anim.addUpdateListener { animation ->
            pagerVocab.setScaleX(animation.animatedValue as Float)
        pagerVocab.setScaleY(animation.animatedValue as Float)
    }
    anim.repeatCount = 1
    anim.repeatMode = ValueAnimator.REVERSE
    anim.start()
    }

    fun animWave1(layout: Button , activity: Activity) {
        val display = activity.windowManager.defaultDisplay
        val width = display.width
        val height = display.height
        var moverx = ObjectAnimator.ofFloat(layout, "translationX", (0).toFloat(), 400f)
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()


        var movery = ObjectAnimator.ofFloat(layout, "translationY", 50f)
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 600

        moverx.start()
        movery.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", 550f)
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 3000

        movery =
            ObjectAnimator.ofFloat(layout, "translationY", -20f)
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 3000
        moverx.start()
        movery.start()

        movery = ObjectAnimator.ofFloat(layout, "translationY", (height / 2).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 5900

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (-1).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 8500
        movery.start()
        moverx.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (-20).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 11000

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((height / 2) - 120).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 11000

        movery.start()
        moverx.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (20).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 13999

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((height / 2) - 200).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 13500

        movery.start()
        moverx.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (-20).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 16999

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((height / 2) - 300).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 16500

        movery.start()
        moverx.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (27).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 19999

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((height / 2) - 500).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 19500

        movery.start()
        moverx.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (-27).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 22999

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((height / 2) - 600).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 22500

        movery.start()
        moverx.start()

        moverx = ObjectAnimator.ofFloat(layout, "translationX", (27).toFloat())
        moverx.duration = 3000
        moverx.interpolator = LinearInterpolator()
        moverx.startDelay = 25999

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((height / 2) - 850).toFloat())
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 25500

        movery.start()
        moverx.start()

        movery = ObjectAnimator.ofFloat(layout, "translationY", ((-10).toFloat()))
        movery.duration = 3000
        movery.interpolator = LinearInterpolator()
        movery.startDelay = 25500

        movery.start()

    }

}