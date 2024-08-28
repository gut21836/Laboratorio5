package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class LocationsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocationsScreen()
        }
    }
}

@Composable
fun LocationsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Lugares de Conciertos") }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(listOf("Lugar 1", "Lugar 2", "Lugar 3", "Lugar 4")) { lugar ->
                Row {
                    Image(painter = painterResource(id = R.drawable.ic_location), contentDescription = "Icono de Lugar")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = lugar, style = MaterialTheme.typography.h6)
                }
                Divider()
            }
        }
    }
}
