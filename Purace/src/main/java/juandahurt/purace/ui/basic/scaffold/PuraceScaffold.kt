package juandahurt.purace.ui.basic.scaffold

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import juandahurt.purace.ui.basic.PuraceTextView

@Composable
fun PuraceScaffold(
    title: String? = null,
    onBackTap: () -> Unit = {},
    content: @Composable () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    title?.let {
                        PuraceTextView(text = it, size = 16, weight = FontWeight.Medium)
                    }
                },
                backgroundColor = Color.White,
                elevation = 0.dp,
                navigationIcon = {
                    Icon(
                        Icons.Outlined.ArrowBackIos, "backIcon",
                        modifier = Modifier
                            .clickable(indication = null, interactionSource = MutableInteractionSource()) {
                                onBackTap()
                            }
                            .padding(start = 8.dp)
                    )
                }
            )
        }
    ) {
        content()
    }
}