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

class ConcertsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConcertsScreen()
        }
    }
}

@Composable
fun ConcertsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Próximos Conciertos") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.ic_concert), contentDescription = "Icono de Concierto")
            Text(text = "Concierto 1", fontSize = 20.sp)
            Text(text = "Concierto 2", fontSize = 20.sp)
            Text(text = "Concierto 3", fontSize = 20.sp)
        }
    }
}
