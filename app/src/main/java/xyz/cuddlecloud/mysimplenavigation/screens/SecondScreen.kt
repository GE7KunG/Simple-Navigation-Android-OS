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
fun SecondScreen(navController: NavController, input: String?) {

    var age = -1;
    try {
        age = Integer.parseInt(input)
    } catch (e : Exception) {
        e.printStackTrace()
    }
    //val s = if(age > 18) "Welcome :) ;-; ^-^" else "เข้าไม่ได้"

    Scaffold {
            innerPadding ->
        Surface (modifier = Modifier.padding(innerPadding)) {
            Column {
                Text(text = "Second Screen")
                Text(text = "Age: $age")
                Text(text = "Welcome")
                Button(onClick = { navController.navigate(PageList.Third.name) }) {
                    Text(text = "Go to Third Page")
                }
            }
        }
    }
}