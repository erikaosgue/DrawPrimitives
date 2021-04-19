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


		val drawingALine = DrawingALine(this)
		val drawImage = Drawing(this)

		drawingALine.setOnClickListener{
			Toast.makeText(this, "Hello There", Toast.LENGTH_LONG).show()
		}
		setContentView(drawImage)

	}
}