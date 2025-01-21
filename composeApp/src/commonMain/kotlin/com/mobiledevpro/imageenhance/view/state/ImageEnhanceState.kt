package com.mobiledevpro.imageenhance.view.state

import androidx.compose.ui.graphics.ImageBitmap

sealed interface ImageEnhanceState {
    data object Loading : ImageEnhanceState

    data class Success(val imageBitmap: ImageBitmap) : ImageEnhanceState
}