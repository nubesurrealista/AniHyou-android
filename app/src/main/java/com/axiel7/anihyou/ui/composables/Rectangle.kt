package com.axiel7.anihyou.ui.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.axiel7.anihyou.ui.theme.AniHyouTheme

@Composable
fun Rectangle(
    width: Dp,
    height: Dp,
    color: Color
) {
    Canvas(modifier = Modifier.size(width, height)) {
        drawIntoCanvas {
            drawRect(
                color = color,
                size = size
            )
        }
    }
}

@Preview
@Composable
fun RectanglePreview() {
    AniHyouTheme {
        Surface {
            Rectangle(width = 50.dp, height = 12.dp, color = Color.Blue)
        }
    }
}