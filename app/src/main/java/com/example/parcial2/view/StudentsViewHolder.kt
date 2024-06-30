package com.example.parcial2.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.parcial2.R
import com.example.parcial2.databinding.ItemStudentBinding
import com.example.parcial2.model.Students

class StudentsViewHolder(view : View) : ViewHolder(view) {
    private val binding : ItemStudentBinding = ItemStudentBinding.bind(view)
    fun render(student : Students){
        binding.tvStudentName.text = student.name
        binding.tvStudentLastName.text = student.lastname
        binding.tvStudentCareer.text = student.career
        binding.tvStudentAge.text = student.age.toString()
    }
}