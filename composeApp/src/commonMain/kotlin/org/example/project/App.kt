package org.example.project

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.example.project.nav_controller.RootNavGraph
import org.example.project.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val statusBarValues = WindowInsets.safeDrawing.asPaddingValues()
    AppTheme {
        Surface(
            modifier = Modifier
                .padding(top = statusBarValues.calculateTopPadding())
        ) {
            RootNavGraph(rememberNavController())
        }
    }
}