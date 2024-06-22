package com.example.parcial2.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial2.R
import com.example.parcial2.model.Teachers

class TeachersAdapter (private val teachersList: List<Teachers>) : RecyclerView.Adapter<TeachersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeachersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TeachersViewHolder(layoutInflater.inflate(R.layout.item_teacher, parent, false))
    }

    override fun getItemCount(): Int = teachersList.size

    override fun onBindViewHolder(holder: TeachersViewHolder, position: Int) {
        val item = teachersList[position]
        holder.render(item)
    }


}