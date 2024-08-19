package xyz.cuddlecloud.mysimplenavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController) {
    Scaffold {
        innerPadding ->
        Surface (modifier = Modifier.padding(innerPadding)) {

            var text by remember {
                mutableStateOf("")
            }

            Column {
                Text(text = "First Screen")
                TextField(value = text, onValueChange = {text = it})
                Button(onClick = { navController.navigate("Second/${text}") }) {
                    Text(text = "Go to Second Page")
                }
            }
        }
    }
}