package xyz.cuddlecloud.mysimplenavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ThirdScreen(navController: NavController) {
    Scaffold {
            innerPadding ->
        Surface (modifier = Modifier.padding(innerPadding)) {
            Column {
                Text(text = "Third Screen")
                Button(onClick = { navController.navigate("First") }) {
                    Text(text = "Go to First Page")
                }
            }
        }
    }
}