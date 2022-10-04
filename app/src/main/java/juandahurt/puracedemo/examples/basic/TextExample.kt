package juandahurt.puracedemo.examples.basic

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import juandahurt.purace.ui.basic.PuraceTextView

@Composable
fun TextExample(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Text example") },
                backgroundColor = Color.White,
                elevation = Dp.Hairline,
                navigationIcon = {
                    Icon(
                        Icons.Default.ArrowBack, "backIcon",
                        modifier = Modifier.clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                        ) {
                            navController.popBackStack()
                        }
                    )
                },
            )
        },
    ) {
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

            PuraceTextView(
                text = "Texto normal semi bold",
                weight = FontWeight.SemiBold
            )

            PuraceTextView(
                text = "Texto mediano semi bold",
                size = 16,
                weight = FontWeight.SemiBold
            )

            PuraceTextView(
                text = "Texto grande semi bold",
                size = 20,
                weight = FontWeight.SemiBold
            )
        }
    }
}