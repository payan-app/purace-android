package juandahurt.purace.ui.basic.image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.SubcomposeAsyncImage
import juandahurt.purace.ui.style.PuraceStyle

@Composable
fun PuraceImageView(
    url: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    placeholder: @Composable () -> Unit = {
        Box(
            modifier = Modifier
                .background(PuraceStyle.Color.skeletons.random())
        )
    },
) {
    SubcomposeAsyncImage(
        model = url,
        "image",
        loading = {
            placeholder()
        },
        contentScale = contentScale,
        modifier = modifier
    )
}