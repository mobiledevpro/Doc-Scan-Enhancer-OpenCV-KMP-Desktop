package com.mobiledevpro.imageenhancer.desktop

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(colors = darkColors(background = Color(0xFF212427))){
        content()
    }
}