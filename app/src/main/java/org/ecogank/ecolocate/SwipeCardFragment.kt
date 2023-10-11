package org.ecogank.ecolocate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.constraintlayout.widget.ConstraintSet
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min
import kotlin.math.max

class SwipeCardFragment : Fragment() {

    private lateinit var cardView: CardView
    private val constraintSet = ConstraintSet()
    private lateinit var cardRecyclerView: RecyclerView
    private var isCardFullScreen = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.swp_card, container, false)
        cardView = rootView.findViewById(R.id.cardView)

        val screenHeight = resources.displayMetrics.heightPixels

        val initialHeight = screenHeight / 2
        cardView.layoutParams.height = initialHeight

        cardView.setOnTouchListener(SwipeTouchListener(initialHeight))

        return rootView
    }

    private inner class SwipeTouchListener(private val initialHeight: Int) : View.OnTouchListener {
        private var lastY = 0

        override fun onTouch(v: View, event: MotionEvent): Boolean {
            val layoutParams = v.layoutParams as ViewGroup.LayoutParams
            when (event.action) {
                MotionEvent.ACTION_MOVE -> {
                    val deltaY = lastY - event.rawY.toInt()
                    layoutParams.height += deltaY

                    val screenHeight = resources.displayMetrics.heightPixels

                    val statusBarHeight = (24 * resources.displayMetrics.density).toInt()

                    layoutParams.height = max(layoutParams.height, initialHeight)

                    layoutParams.height = min(layoutParams.height, screenHeight - statusBarHeight)

                    v.layoutParams = layoutParams
                }
            }
            lastY = event.rawY.toInt()
            return true
        }
    }

}
