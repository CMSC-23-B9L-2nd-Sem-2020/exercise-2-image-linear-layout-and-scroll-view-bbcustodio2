package com.example.custodio_exer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var princessImage : ImageView
    lateinit var princessInfo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        princessImage = findViewById(R.id.princessImage)
        princessInfo = findViewById(R.id.princessInfo)



        //calls randomizePrincess function when button is pressed
        val start: Button = findViewById(R.id.start_game)
        start.setOnClickListener { randomizePrincess() }

        val retry: Button = findViewById(R.id.retry)
        retry.setOnClickListener { randomizePrincess() }
    }

    //generates a random disney princess and displays their info
     private fun randomizePrincess(){
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.cinderella
            2 -> R.drawable.aurora
            3 -> R.drawable.ariel
            4 -> R.drawable.snow_white
            5 -> R.drawable.jasmine
            6 -> R.drawable.rapunzel
            else ->  R.drawable.rapunzel
        }
        val princessInfoResource = when (randomInt) {
            1 -> R.string.cinderella
            2 -> R.string.aurora
            3 -> R.string.ariel
            4 -> R.string.snow_white
            5 -> R.string.jasmine
            6 -> R.string.rapunzel
            else -> R.string.which_disney_character_are_you
        }
        princessImage.setImageResource(drawableResource)
        princessInfo.setText(princessInfoResource)

    }

}
