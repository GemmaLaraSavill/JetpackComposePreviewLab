package com.gemma.previewsexample.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gemma.previewsexample.ui.theme.PreviewsExampleTheme

@Composable
fun MainScreen(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Button(onClick = { navController.navigate("regular_preview_screen") }) {
                Text(text = "Regular Previews")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("custom_preview_screen") }) {
                Text(text = "Custom Previews")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("multi_preview_screen") }) {
                Text(text = "MultiPreview API")
            }
        }
    }
}

