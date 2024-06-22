package com.example.parcial2.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.parcial2.databinding.ItemStudentBinding
import com.example.parcial2.databinding.ItemTeacherBinding
import com.example.parcial2.model.Students
import com.example.parcial2.model.Teachers

class TeachersViewHolder(view : View) : ViewHolder(view){
    val binding = ItemTeacherBinding.bind(view)
    fun render(teacher : Teachers){
        binding.tvTeacherName.text = teacher.name
        binding.tvTeacherLastName.text = teacher.lastname
        binding.tvTeacherClassroom.text = teacher.classroom
    }
}