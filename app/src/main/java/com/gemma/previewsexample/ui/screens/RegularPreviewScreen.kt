package com.gemma.previewsexample.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.gemma.previewsexample.R
import com.gemma.previewsexample.ui.components.CustomCard
import com.gemma.previewsexample.ui.theme.PreviewsExampleTheme

@Composable
fun RegularPreviewScreen() {
    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CustomCard(
                title = "Regular Previews",
                subtitle = "Use simple annotations",
                image = R.drawable.simpledroid
            )
        }
    }
}

@Preview(
    name = "With system UI",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showSystemUi = true
)
@Composable
private fun RegularPreviewDark() {
    PreviewsExampleTheme {
        RegularPreviewScreen()
    }
}

@Preview(
    name = "Nexus 7",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    device = Devices.NEXUS_7
)
@Composable
private fun RegularPreviewLight() {
    PreviewsExampleTheme {
        RegularPreviewScreen()
    }
}

