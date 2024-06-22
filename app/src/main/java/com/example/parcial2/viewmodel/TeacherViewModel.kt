package com.example.parcial2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.parcial2.model.TeacherList
import com.example.parcial2.model.Teachers

class TeacherViewModel : ViewModel() {
    val teacherModel = MutableLiveData<List<Teachers>>()
    val teachers : LiveData<List<Teachers>> = teacherModel
    init {
        teacherModel.value = TeacherList.listOfTeachers
    }
}
