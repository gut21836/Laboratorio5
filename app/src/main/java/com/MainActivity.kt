package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Mi Perfil") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(text = "Nombre: Isaac Gutierrez", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Correo: isaac.gutierrez@example.com", fontSize = 18.sp)
        }
    }
}
