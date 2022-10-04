package juandahurt.puracedemo

import android.os.Bundle
import android.view.Menu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import juandahurt.puracedemo.examples.basic.TextExample


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MenuWrapper()
        }
    }
}

@Composable
fun MenuWrapper(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "menu"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("menu") {
            MainMenu(navController)
        }

        composable("text") {
            TextExample(navController)
        }
    }
}

@Composable
fun MainMenu(navController: NavHostController) {
    Scaffold {
        Column {
            Text(
                modifier = Modifier.clickable {
                    navController.navigate("text")
                },
                text = "Text"
            )
        }
    }
}