package com.example.feedbackproto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class Reflection : AppCompatActivity() {
    val slider by lazy <SeekBar> { findViewById(R.id.slider)}
    val txt_feeling by lazy <TextView>{ findViewById(R.id.txt_feeling)}
    val btn_next by lazy <Button> {findViewById(R.id.btn_next)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reflection)

        slider.setOnSeekBarChangeListener(SBListener(txt_feeling))

        btn_next.setOnClickListener{
            val intent = Intent(this, WentWell::class.java)
            startActivity(intent)

        }


    }
}

class SBListener(textView: TextView):SeekBar.OnSeekBarChangeListener{
     val txt_feeling = textView
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            when(progress){
                1 -> txt_feeling.setText("Unhappy")
                2 -> txt_feeling.setText("Unhappy")
                3 -> txt_feeling.setText("Somewhat Unhappy")
                4 -> txt_feeling.setText("Neutral")
                5 -> txt_feeling.setText("Neutral")
                6 -> txt_feeling.setText("Neutral")
                7 -> txt_feeling.setText("Somewhat happy")
                8 -> txt_feeling.setText("Somewhat happy")
                9 -> txt_feeling.setText("Happy")
                10 -> txt_feeling.setText("Happy")
            }
        }

        override fun onStartTrackingTouch(seekBar: SeekBar?){}

        override fun onStopTrackingTouch(seekBar: SeekBar?) {}

}



