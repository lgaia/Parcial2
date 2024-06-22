package com.example.parcial2.view

import android.os.Bundle
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
import com.example.parcial2.databinding.SecondActivityBinding
import com.example.parcial2.model.TeacherList
import com.example.parcial2.model.TeacherProvider
import com.example.parcial2.model.Teachers
import com.example.parcial2.viewmodel.TeacherViewModel

class SecondActivity : ComponentActivity() {
    private lateinit var binding : SecondActivityBinding

    private val teacherViewModel : TeacherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        teacherViewModel.teacherModel.observe(this, Observer { teacher ->
            initRecycler(TeacherList.listOfTeachers)


        })
    }

    private fun initRecycler(listOfTeachers: MutableList<Teachers>) {
        binding.recyclerTeachers.adapter = TeachersAdapter(TeacherProvider.teacherList)
        binding.recyclerTeachers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
}