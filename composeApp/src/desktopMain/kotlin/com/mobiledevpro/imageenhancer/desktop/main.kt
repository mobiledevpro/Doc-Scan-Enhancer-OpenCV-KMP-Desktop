package com.mobiledevpro.imageenhancer.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "image-enhancer-opencv-desktop-compose-ui",
    ) {
        App()
    }
}