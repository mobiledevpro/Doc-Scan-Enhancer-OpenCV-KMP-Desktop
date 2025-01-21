package com.mobiledevpro.imageenhance.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mobiledevpro.imageenhance.view.state.ImageEnhanceState
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.decodeToImageBitmap

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ImageEnhanceScreen(
    uiState: StateFlow<ImageEnhanceState>
) {

    val state by uiState.collectAsStateWithLifecycle()

    var imageBitmap by remember {
        mutableStateOf<ImageBitmap?>(null)
    }

    if (state is ImageEnhanceState.Success) {
        imageBitmap = (state as ImageEnhanceState.Success).imageBitmap
    }

    Scaffold {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            imageBitmap?.let { bitmap ->
                Image(bitmap = bitmap, contentDescription = null)
            }
        }
    }
}