package juandahurt.puracedemo.examples.basic

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import juandahurt.purace.ui.basic.PuraceTextView
import juandahurt.purace.ui.basic.scaffold.PuraceScaffold

@Composable
fun TextExample(navController: NavHostController) {
    PuraceScaffold(title = "Text example", onBackTap = {
        navController.popBackStack()
    }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PuraceTextView(
                text = "Texto normal",
            )

            PuraceTextView(
                text = "Texto mediano",
                size = 16
            )

            PuraceTextView(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Texto grande",
                size = 20
            )

            PuraceTextView(
                text = "Texto normal medium",
                weight = FontWeight.Medium
            )

            PuraceTextView(
                text = "Texto mediano medium",
                size = 16,
                weight = FontWeight.Medium
            )

            PuraceTextView(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Texto grande medium",
                size = 20,
                weight = FontWeight.Medium
            )
        }
    }
}