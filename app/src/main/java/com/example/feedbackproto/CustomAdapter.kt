package com.example.feedbackproto

import android.content.Intent
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MyListAdapter(private val context: WentWell, val names:Array<String>, val notes:Array<String>)
    : ArrayAdapter<String>(context, R.layout.row_item, names), View.OnClickListener {
    override fun onClick(v: View?) { }

    override fun getCount() = names.size

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.row_item, null, true)


        val cbName = rowView.findViewById(R.id.cb_name) as CheckBox
        val chevron = rowView.findViewById(R.id.icon_hint) as ImageView
        cbName.text = names[position]
        chevron.setOnClickListener{
                openHint(position)
        }



        return rowView
    }
    fun openHint(row:Int){
        val intent = Intent(context, Hint::class.java)
        intent.putExtra("ROW", row)
        context.startActivity(intent)

    }
}
