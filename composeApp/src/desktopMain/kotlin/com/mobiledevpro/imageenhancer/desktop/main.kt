package com.mobiledevpro.imageenhancer.desktop

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.mobiledevpro.imageenhance.di.featureImageEnhanceModule
import org.koin.core.context.GlobalContext.startKoin

fun main() = application {

  /*  startKoin {
        modules(
         featureImageEnhanceModule
        )
    }*/

    Window(
        onCloseRequest = ::exitApplication,
        title = "Image Enhancer",
        state = rememberWindowState(width = 1280.dp, height = 720.dp)
    ) {
        App()
    }
}