package com.erikaosgue.drawprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class DrawingALine(context: Context?) : View(context) {

    private lateinit var brush: Paint
    private lateinit var lineBrush: Paint

    override fun draw(canvas: Canvas?) {
        brush = Paint(Paint.ANTI_ALIAS_FLAG)
        lineBrush = Paint(Paint.ANTI_ALIAS_FLAG)

        // Add width value to the Line
        lineBrush.strokeWidth = 13f


        brush.color = Color.parseColor("green")
        lineBrush.color = Color.MAGENTA

        canvas?.drawCircle((measuredWidth/2).toFloat(),
            (measuredHeight/2).toFloat(), 24f, brush)

        canvas?.drawLine(0F,0F,measuredWidth/2F, measuredHeight/2F, lineBrush)
        canvas?.save()
        super.draw(canvas)
    }


}