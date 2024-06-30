package com.example.parcial2.model

data class Students (
    val name:String,
    val lastname:String,
    val career:String,
    val age: Int
)
object StudentList {
    val listOfStudents = mutableListOf<Students>()}