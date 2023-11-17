package ru.netology.animation.ui

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Scene
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import ru.netology.animation.R
import ru.netology.nmedia.ui.StatsView

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val view = findViewById<StatsView>(R.id.stats)
        val root = findViewById<ViewGroup>(R.id.root)
        // val text = findViewById<TextView>(R.id.label)
        val scene = Scene.getSceneForLayout(root, R.layout.end_scene, this)
        findViewById<Button>(R.id.goButton).setOnClickListener {
            TransitionManager.go(scene, ChangeBounds().apply {
                duration = 10000
            })
        }

// Пример 1 android.view.animation
//        val label = findViewById<TextView>(R.id.label)
//        val viewAnim = AnimationUtils.loadAnimation(
//            this, R.anim.view_animation
//        ).apply {
//            setAnimationListener(object : Animation.AnimationListener {
//                override fun onAnimationStart(animation: Animation?) {
//                    label.text = "started"
//                }
//
//                override fun onAnimationEnd(animation: Animation?) {
//                    label.text = "ended"
//                }
//
//                override fun onAnimationRepeat(animation: Animation?) {
//                    label.text = "repeat"
//                }
//
//            })
//        }
//
//        view.startAnimation(viewAnim)
// Конец примера 1

// Пример 2 ObjectAnimator через рефлексию
//        ObjectAnimator.ofFloat(view, "alpha", 0.25F, 1F).apply {
//            startDelay = 500
//            duration = 300
//            interpolator = BounceInterpolator()
//        }.start()
// Конец примера 2

// Пример 3 ObjectAnimator через готовые property
//        ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F, 1F).apply {
//            startDelay = 500
//            duration = 1000
//            interpolator = BounceInterpolator()
//        }.start()
// Конец примера 3

// Пример 4 Анимация нескольких свойств через PropertyValuesHolder
//        val rotation = PropertyValuesHolder.ofFloat(View.ROTATION, 0F, 360F)
//        //val alpha = PropertyValuesHolder.ofFloat(View.ALPHA, 0F, 1F)
//        ObjectAnimator.ofPropertyValuesHolder(view, rotation)
//            .apply {
//                startDelay = 500
//                duration = 1500
//                interpolator = LinearInterpolator()
//            }.start()
// Конец примера 4

// Пример 5 Использование ViewPropertyAnimator
//        view.animate()
//            .rotation(360F)
//            //.scaleX(1.2F)
//            //.scaleY(1.2F)
//            .setInterpolator(LinearInterpolator())
//            .setStartDelay(300)
//            .setDuration(1000)
//            .start()

// Конец примера 5

// Пример 6 Комбинация нескольких анимаций через AnimatorSet
//        val alpha = ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F, 1F).apply {
//            duration = 6000
//            interpolator = LinearInterpolator()
//        }
//        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0F, 1F)
//        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0F, 1F)
//        val scale = ObjectAnimator.ofPropertyValuesHolder(view, scaleX, scaleY).apply {
//            duration = 6000
//            interpolator = BounceInterpolator()
//        }
//        AnimatorSet().apply {
//            startDelay = 500
//            playSequentially(scale, alpha)
//        }.start()
// Конец примера 6
    }
}

