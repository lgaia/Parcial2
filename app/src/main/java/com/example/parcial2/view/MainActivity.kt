package com.example.parcial2.view

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial2.R
import com.example.parcial2.databinding.ActivityMainBinding
import com.example.parcial2.model.StudentList
import com.example.parcial2.model.StudentProvider
import com.example.parcial2.model.Students
import com.example.parcial2.ui.theme.Parcial2Theme
import com.example.parcial2.viewmodel.StudentViewModel

class MainActivity : ComponentActivity() {
    private lateinit var binding : ActivityMainBinding
    private val studentViewModel : StudentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        studentViewModel._students.observe(this, Observer {students->
            initRecycler(StudentList.listOfStudents)
        })
        binding.btnSecondActivity.setOnClickListener {
            val alertConfirmation : AlertDialog.Builder = AlertDialog.Builder(this)
            alertConfirmation.setMessage("¿Desea acceder a la lista de docentes?")
            alertConfirmation.setCancelable(false)
            alertConfirmation.setPositiveButton("Sí"){_,_->
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
            alertConfirmation.setNegativeButton("No"){_,_->
                Toast.makeText(this,"Click en no",Toast.LENGTH_SHORT).show()
            }
            alertConfirmation.create()
            alertConfirmation.show()
        }
    }

    private fun initRecycler(listOfStudents: MutableList<Students>) {
        binding.recyclerStudents.adapter = StudentsAdapter(StudentProvider.studentList)
        binding.recyclerStudents.layoutManager = LinearLayoutManager(this)
    }

}
