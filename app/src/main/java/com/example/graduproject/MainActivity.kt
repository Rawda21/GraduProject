package com.example.graduproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.graduproject.screens.TopScreen
import com.example.graduproject.ui.theme.GraduProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraduProjectTheme {
                TopScreen()
            }
        }
    }
}
