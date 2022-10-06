package juandahurt.puracedemo.examples.basic

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import juandahurt.purace.ui.basic.image.PuraceImageView
import juandahurt.purace.ui.basic.scaffold.PuraceScaffold

@Composable
fun ImageExample(navController: NavHostController) {
    PuraceScaffold(title = "Image example", onBackTap = {
        navController.popBackStack()
    }) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PuraceImageView(
                url = "https://payan-dev-images.s3.us-east-2.amazonaws.com/Juli%C3%A1n_Trujillo_Largacha.jpg",
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            )
        }
    }
}