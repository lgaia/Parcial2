package com.example.parcial2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.parcial2.model.StudentList
import com.example.parcial2.model.Students

class StudentViewModel :ViewModel() {
    val studentModel = MutableLiveData<List<Students>>()
    val students : LiveData<List<Students>> = studentModel
    init {
        studentModel.value = StudentList.listOfStudents
    }
}
