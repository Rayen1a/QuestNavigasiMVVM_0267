package com.example.questnavigasimvvm_0267

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.questnavigasimvvm_0267.ui.theme.questnavigasimvvm_0267Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            questnavigasimvvm_0267Theme {
                DataApp()
            }
        }
    }
}