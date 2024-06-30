package com.example.parcial2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.parcial2.model.StudentList
import com.example.parcial2.model.Students

class StudentViewModel :ViewModel() {
    val _students = MutableLiveData<List<Students>>()
    val students : LiveData<List<Students>> = _students
    init {
        _students.value = StudentList.listOfStudents
    }
    /*fun addStudent(name:String, lastname: String, career: String, age: Int){
        val student = Students(name, lastname, career, age)
        val updatedStudents = _students.value.orEmpty().toMutableList()
        updatedStudents.add(student)
        _students.value = updatedStudents
    }*/
}
