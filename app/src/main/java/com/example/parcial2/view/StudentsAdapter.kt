package com.example.parcial2.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial2.R
import com.example.parcial2.model.Students

class StudentsAdapter(private val studentsList: List<Students>) : RecyclerView.Adapter<StudentsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return StudentsViewHolder(layoutInflater.inflate(R.layout.item_student, parent, false))
    }

    override fun getItemCount(): Int = studentsList.size

    override fun onBindViewHolder(holder: StudentsViewHolder, position: Int) {
        val item = studentsList[position]
        holder.render(item)
    }
}