package com.example.testhome.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyApplicationTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = MyApplicationColors,
        content = content
    )
}

val MyApplicationColors = darkColors(
    primary = Color(0xFFD0BCFF),
    primaryVariant = Color(0xFFCCC2DC),
    secondary = Color(0xD1D1D1),
    onPrimary = Color.White,
    onSecondary = Color.Black
)

