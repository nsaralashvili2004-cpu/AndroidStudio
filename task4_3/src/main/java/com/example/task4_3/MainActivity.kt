package com.example.task4_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task4_3.ui.theme.AndroidStudioTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidStudioTheme() {
                 Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                     Greeting(
                         modifier = Modifier.padding(innerPadding)
                     )
                 }
             }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Картинка
        Image(
            painter = painterResource(R.drawable.test),
            contentDescription = "center image",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        // Текст под картинкой
        Text(
            text = "All task completed",
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp),
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Nice work",
            fontSize = 16.sp,
            color = Color.Black,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidStudioTheme() {
        Greeting()
    }
}