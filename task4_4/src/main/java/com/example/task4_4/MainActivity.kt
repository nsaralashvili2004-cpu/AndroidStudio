package com.example.task4_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FourPartsScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FourPartsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // ВЕРХНЯЯ ЧАСТЬ: два квадрата
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            // ЛЕВЫЙ ВЕРХНИЙ КВАДРАТ
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFE3F2FD))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(  // ← Добавить Column для вертикального расположения
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Text composable",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(8.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.e",
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }

            // ПРАВЫЙ ВЕРХНИЙ КВАДРАТ
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFE8F5E8))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(  // ← Добавить Column для вертикального расположения
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Image composable",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object",
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        // НИЖНЯЯ ЧАСТЬ: два квадрата
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            // ЛЕВЫЙ НИЖНИЙ КВАДРАТ
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFFFF8E1))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Row composable",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        fontSize = 18.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }

            // ПРАВЫЙ НИЖНИЙ КВАДРАТ
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFFCE4EC))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    Text(
                        text = "Column composable",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "A layout composable that places its children in a vertical sequence",
                        fontSize = 18.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FourPartsPreview() {
    MaterialTheme {
        FourPartsScreen()
    }
}