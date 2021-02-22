package com.example.feedbackproto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Hint : AppCompatActivity() {
    val title by lazy <TextView> {findViewById(R.id.txt_title)}
    val description by lazy <TextView> {findViewById(R.id.txt_Description)}
    val btnClose by lazy <ImageView> {findViewById(R.id.btn_Close)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hint)
        val names = arrayOf<String>("Being Specific", "Timely", "Relevant", "Actionable", "None in particular")

        val notes = arrayOf<String>("Feedback must be factual and actionable. Saying something like: “You need to be more " +
                "vocal in the team” might sound clear, but actually it’s ambiguous and hard to quantify " +
                "for both you and your colleague. Instead, something like “I’d like you to provide your " +
                "observations during our daily huddle” is much clearer and helps the person receiving the " +
                "feedback to understand exactly what you’re asking of them. Unspecific feedback leads" +
                "to delays and misunderstandings. With concise, specific feedback things definitely move" +
                "a lot smoother.",
            "Employees must receive the feedback as close to the event as possible." +" " +
                    "Employees who interact with customers over the phone or in person should "+
                    "be monitored and provided immediate feedback once the interaction has finished." +
                    "Additionally, real-time metrics that are readily available to the employee in a dashboard" +
                    "can be very effective as they provide immediate, concrete feedback about performance.",
            "Feedback should be channeled toward key result areas. Managers should choose specific areas that are" +
                    "most important to the company and provide feedback that only relates to performance " +
                    "in those areas. Feedback should also be linked to corporate or departmental goals. \n",
            "When providing feedback, managers should also give specific direction to the employee."+
                    "The employee should know exactly how to increase their performance and what steps"+
                    "they need to take to get there.",
            "")
        val row = intent.getIntExtra("ROW", -1)
        if ( row != -1){
            title.text = names[row]
            description.text = notes[row]

            btnClose.setOnClickListener{
                finish()

            }
        }

    }
}