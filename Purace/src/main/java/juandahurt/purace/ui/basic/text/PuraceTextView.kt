package juandahurt.purace.ui.basic

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import juandahurt.purace.R
import juandahurt.purace.ui.style.PuraceStyle

private val fontFamily = FontFamily(
    Font(R.font.poppins_regular, weight = FontWeight.Normal),
    Font(R.font.poppins_medium, weight = FontWeight.Medium),
    Font(R.font.poppins_semibold, weight = FontWeight.SemiBold),
)

@Composable
fun PuraceTextView(
    modifier: Modifier = Modifier,
    text: String,
    size: Int = 12,
    weight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Justify
) {
    Text(
        modifier = modifier,
        text = text,
        fontFamily = fontFamily,
        fontWeight = weight,
        fontSize = size.sp,
        textAlign = textAlign,
        color = PuraceStyle.Color.N1
    )
}