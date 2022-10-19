package juandahurt.puracedemo.examples.basic

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import juandahurt.purace.ui.basic.image.PuraceImageView
import juandahurt.purace.ui.basic.loaders.PuraceCircularLoader
import juandahurt.purace.ui.basic.scaffold.PuraceScaffold

@Composable
fun CircularLoaderExample(navController: NavHostController) {
    PuraceScaffold(title = "Loaders example", onBackTap = {
        navController.popBackStack()
    }) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PuraceCircularLoader(
                modifier = Modifier
                    .size(
                        width = 80.dp,
                        height = 80.dp
                    )
            )
        }
    }
}