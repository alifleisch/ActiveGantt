package com.example.fitgantt.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitgantt.ui.theme.FitGanttTheme
import com.example.fitgantt.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitGanttTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Row {
                        AddActionButton()
                        Spacer(modifier = Modifier.width(30.dp))
                        DeleteActionButton()
                    }

                }
            }
        }
    }

    @Composable
    fun AddActionButton(){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add action")
        }
    }

    @Composable
    fun DeleteActionButton(){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Delete action")
        }
    }
}

