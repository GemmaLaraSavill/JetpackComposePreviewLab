package com.gemma.previewsexample.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.gemma.previewsexample.R
import com.gemma.previewsexample.ui.components.CustomCard
import com.gemma.previewsexample.ui.theme.PreviewsExampleTheme

@Composable
fun MultiPreviewScreen() {
    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CustomCard(
                title = "Multi Previews API",
                subtitle = "Use the power of library included preview sets",
                image = R.drawable.spacedroid
            )
        }
    }
}

@PreviewScreenSizes
@Composable
private fun MultiPreview() {
    PreviewsExampleTheme {
        MultiPreviewScreen()
    }
}