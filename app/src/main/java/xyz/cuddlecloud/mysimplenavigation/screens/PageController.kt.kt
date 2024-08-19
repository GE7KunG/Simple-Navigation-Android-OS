package xyz.cuddlecloud.mysimplenavigation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PageController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "First") {
        composable("First") { FirstScreen(navController)}
        composable("Second/{text}") {
            data -> val input = data.arguments?.getString("text")
            SecondScreen(navController, input)
        }
        composable("Third") { ThirdScreen(navController)}
    }
}