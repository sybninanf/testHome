package com.example.testhome.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

)

//@Composable
//fun MyApplicationTheme(darkTheme: Boolean = isSystemInDarkTheme(),content: @Composable () -> Unit) {
//    val colors = if (darkTheme) {
//        DarkColorScheme
//    } else {
//        LightColorScheme
//    }
//
//
//    MaterialTheme(
//        colors = colors,
//        typography = typography,
//        content = content
//    )
//}




//object MyApplicationTypography {
//    // Define your typography styles here
//    // ...
//}