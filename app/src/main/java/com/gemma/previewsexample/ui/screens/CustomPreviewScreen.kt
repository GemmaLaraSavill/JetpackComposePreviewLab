package com.gemma.previewsexample.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.gemma.previewsexample.R
import com.gemma.previewsexample.ui.components.CustomCard
import com.gemma.previewsexample.ui.theme.PreviewsExampleTheme
import com.gemma.previewsexample.ui.utils.LightAndDarkPreview

@Composable
fun CustomPreviewScreen() {
        Surface {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CustomCard(
                    title = "Custom Previews",
                    subtitle = "When you define your own annotations",
                    image = R.drawable.skidroid
                )
            }
        }
}


@LightAndDarkPreview
@Composable
private fun CustomPreview() {
    PreviewsExampleTheme {
        CustomPreviewScreen()
    }
}