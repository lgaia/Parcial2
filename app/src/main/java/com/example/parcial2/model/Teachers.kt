package com.example.parcial2.model

data class Teachers (
    val name:String,
    val lastname:String,
    val classroom:String
)
object TeacherList {

    val listOfTeachers= mutableListOf<Teachers>()}