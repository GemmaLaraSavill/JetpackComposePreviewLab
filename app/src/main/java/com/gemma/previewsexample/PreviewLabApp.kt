package com.gemma.previewsexample

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gemma.previewsexample.ui.screens.CustomPreviewScreen
import com.gemma.previewsexample.ui.screens.MainScreen
import com.gemma.previewsexample.ui.screens.MultiPreviewScreen
import com.gemma.previewsexample.ui.screens.RegularPreviewScreen
import com.gemma.previewsexample.ui.theme.PreviewsExampleTheme

@Composable
fun PreviewLabApp(navController: NavHostController) {
    PreviewsExampleTheme {
        NavHost(
            navController = navController,
            startDestination = "main"
        ) {
            composable("main") {
                MainScreen(navController)
            }
            composable("regular_preview_screen") {
                RegularPreviewScreen()
            }
            composable("custom_preview_screen") {
                CustomPreviewScreen()
            }
            composable("multi_preview_screen") {
                MultiPreviewScreen()
            }
        }
    }
}