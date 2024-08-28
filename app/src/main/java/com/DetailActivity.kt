package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailScreen()
        }
    }
}

@Composable
fun DetailScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Detalle del Concierto") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.ic_concert_detail), contentDescription = "Imagen del Concierto")
            Text(text = "Nombre del Concierto", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Fecha: 10/10/2024", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Descripción del evento...", fontSize = 16.sp)
        }
    }
}
