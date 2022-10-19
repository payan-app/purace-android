package juandahurt.purace.ui.basic.loaders

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import juandahurt.purace.ui.style.PuraceStyle

@Composable
fun PuraceCircularLoader(
    modifier: Modifier = Modifier,
    width: Dp = 4.dp,
    color: Color = PuraceStyle.Color.N1
) {
    CircularProgressIndicator(
        modifier = modifier,
        strokeWidth = width,
        color = color
    )
}