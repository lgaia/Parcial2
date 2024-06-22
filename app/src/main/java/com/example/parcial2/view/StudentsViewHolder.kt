package com.example.parcial2.view

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.parcial2.R
import com.example.parcial2.databinding.ItemStudentBinding
import com.example.parcial2.model.Students

class StudentsViewHolder(view : View) : ViewHolder(view) {
    val binding = ItemStudentBinding.bind(view)
    fun render(student : Students){
        binding.tvStudentName.text = student.name
        binding.tvStudentLastName.text = student.lastname
        binding.tvStudentCareer.text = student.career
        binding.tvSudentAge.text = student.age.toString()
    }
}