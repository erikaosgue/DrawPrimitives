package com.erikaosgue.drawprimitives

import android.content.Context
import android.graphics.*
import android.util.Log
import android.view.View

class Drawing(context: Context?) : View(context) {
    lateinit var brushImage: Paint
    val bitmap = BitmapFactory.decodeResource(resources, R.drawable.tortuga)

    override fun draw(canvas: Canvas?) {
        brushImage = Paint(Paint.ANTI_ALIAS_FLAG)

        bitmap.width
        bitmap.height

        val matrix =  Matrix()
        matrix.postScale(0.1f,0.1f)
        //(measuredWidth/2 - bitmap.width/2), (measuredHeight/2 - bitmap.height/2
        val i = measuredWidth/2 - 300
        val dest = Rect(i-100, i*2, i*4, i*4)
        canvas?.drawBitmap(bitmap, null, dest, brushImage)
        canvas?.save()
        super.draw(canvas)
    }


}