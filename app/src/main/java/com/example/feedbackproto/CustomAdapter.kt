package com.example.feedbackproto

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MyListAdapter(private val context: WentWell, val names:Array<String>, val notes:Array<String>)
    : ArrayAdapter<String>(context, R.layout.row_item, names), View.OnClickListener {
    override fun onClick(v: View?) { }

    override fun getCount() = names.size

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.row_item, null, true)

        val cbName = rowView.findViewById(R.id.cb_name) as CheckBox
        val description = rowView.findViewById(R.id.notes) as TextView
        cbName.text = names[position]
        description.text = notes[position]

        return rowView
    }
}