package com.erikaosgue.drawprimitives

import android.content.Context
import android.graphics.*
import android.util.Log
import android.view.View

class DrawingImage(context: Context?) : View(context) {
    lateinit var brushImage: Paint
    private val bitmap = BitmapFactory.decodeResource(resources, R.drawable.tortuga)

    override fun draw(canvas: Canvas?) {
        brushImage = Paint(Paint.ANTI_ALIAS_FLAG)

        val x = measuredWidth/2 - 300
        val y = measuredHeight/2 -300
//        Log.d("result", "${measuredHeight/2}")


        val dest = Rect(x, y, x*4, y*2)
        canvas?.drawBitmap(bitmap, null, dest, brushImage)
        canvas?.save()
        super.draw(canvas)
    }


}