package com.example.parcial2.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

        studentViewModel.studentModel.observe(this, Observer {student->
            initRecycler(StudentList.listOfStudents)


        })
        binding.btnSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initRecycler(listOfStudents: MutableList<Students>) {
        binding.recyclerStudents.adapter = StudentsAdapter(StudentProvider.studentList)
        binding.recyclerStudents.layoutManager = LinearLayoutManager(this)
    }

}
