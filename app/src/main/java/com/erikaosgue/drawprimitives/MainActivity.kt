package com.erikaosgue.drawprimitives

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.erikaosgue.drawprimitives.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	lateinit var  activityMainBinding: ActivityMainBinding
 	override fun onCreate(savedInstanceState: Bundle?) {
 		super.onCreate(savedInstanceState)
 		activityMainBinding = ActivityMainBinding.inflate(layoutInflater)


		val drawingALineAndCircle = DrawingALineAndCircle(this)
		val drawImage = DrawingImage(this)
		val customTextView = CustomTextView(this, null)

		drawingALineAndCircle.setOnClickListener{
			Toast.makeText(this, "Hello There", Toast.LENGTH_LONG).show()
		}

//		setContentView(drawingALineAndCircle)
		setContentView(drawImage)
//		setContentView(customTextView)

	}
}