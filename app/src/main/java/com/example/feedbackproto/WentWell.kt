package com.example.feedbackproto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class WentWell : AppCompatActivity() {
    val listviewWentWell by lazy<ListView> {findViewById(R.id.list_wentwell)}
    val btn_next by lazy<Button> { findViewById(R.id.btn_wentwellnext)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_went_well)

        val names = arrayOf<String>("Being Specific", "Timely", "Relevant", "Actionable", "None in particular")

        val notes = arrayOf<String>("Feedback must be factual and actionable. Saying something like: “You need to be more " +
                "vocal in the team” might sound clear, but actually it’s ambiguous and hard to quantify " +
                "for both you and your colleague. Instead, something like “I’d like you to provide your " +
                "observations during our daily huddle” is much clearer and helps the person receiving the " +
                "feedback to understand exactly what you’re asking of them. Unspecific feedback leads" +
                "to delays and misunderstandings. With concise, specific feedback things definitely move" +
                "a lot smoother.",
            "Employees must receive the feedback as close to the event as possible.",
            "Feedback should be channeled toward key result areas.",
            "When providing feedback, managers should also give specific directions to employee.",
        "")

        val myListAdapter = MyListAdapter(this, names, notes)
        listviewWentWell.adapter = myListAdapter

        btn_next.setOnClickListener{
            val intent = Intent(this, DoBetter::class.java)
            startActivity(intent)
        }
    }
}