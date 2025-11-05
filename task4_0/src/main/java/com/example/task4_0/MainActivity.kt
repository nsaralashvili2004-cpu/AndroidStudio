package com.example.task4_0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task4_0.ui.theme.AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidStudioTheme() {

                 Scaffold(
                     modifier = Modifier.fillMaxSize(),
                     containerColor = Color.Transparent // Делаем прозрачным, чтобы был виден фон
                 ) { innerPadding ->
                     // Основной экран с фоновым изображением
                     GreetingScreen(
                         name = "Nikita",
                         modifier = Modifier.padding(innerPadding)
                     )
                 }
             }
        }
    }
}

@Composable
fun GreetingScreen(name: String, modifier: Modifier = Modifier) {
    // Box позволяет накладывать элементы друг на друга
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // Слой 1: Фоновое изображение (самый нижний слой)
        BackgroundImage()

        // Слой 2: Основной контент (поверх изображения)
        GreetingContent(name = name)
    }
}

@Composable
fun BackgroundImage() {
    // Загружаем изображение из ресурсов
    val backgroundImage = painterResource(R.drawable.androidparty)

    Image(
        painter = backgroundImage,
        contentDescription = "Фоновое изображение", // Описание для accessibility
        modifier = Modifier.fillMaxSize(), // Растягиваем на весь экран
        contentScale = ContentScale.Crop // Обрезаем изображение чтобы заполнить весь экран

    )
}

@Composable
fun GreetingContent(name: String) {
    // Column для вертикального расположения текстовых элементов
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Отступы от краев экрана
        horizontalAlignment = Alignment.CenterHorizontally, // Выравнивание по центру горизонтали
        verticalArrangement = Arrangement.Center // Выравнивание по центру вертикали
    ) {
        // Основное приветствие
        Text(
            text = "Hello $name!",
            fontSize = 50.sp,
            color = Color.White // Белый цвет для контраста с фоном
        )

        // Дополнительный текст
        Text(
            text = "How are you",
            fontSize = 24.sp,
            color = Color.White
        )
    }
}

// Предварительный просмотр для Android Studio
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
AndroidStudioTheme() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.Transparent
        ) { innerPadding ->
            GreetingScreen(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}