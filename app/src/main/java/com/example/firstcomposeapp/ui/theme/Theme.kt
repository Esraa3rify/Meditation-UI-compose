package com.example.firstcomposeapp.ui.theme



import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

import androidx.compose.runtime.Composable

@Composable
fun FirstComposeAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
   MaterialTheme(
        typography = Typography,
       // shapes = Shapes,
        content = content
    )
}

