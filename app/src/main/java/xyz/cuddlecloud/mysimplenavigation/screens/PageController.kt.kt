package xyz.cuddlecloud.mysimplenavigation.screens

import android.graphics.pdf.PdfDocument.Page
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PageController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PageList.First.name) {
        composable(PageList.First.name) { FirstScreen(navController)}
        composable("${PageList.Second.name}/{text}") {
            data -> val input = data.arguments?.getString("text")
            SecondScreen(navController, input)
        }
        composable(PageList.Third.name) { ThirdScreen(navController)}
    }
}

enum class PageList{
    First,
    Second,
    Third
}