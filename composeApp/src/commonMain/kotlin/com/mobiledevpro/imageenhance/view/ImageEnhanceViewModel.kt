package com.mobiledevpro.imageenhance.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobiledevpro.imageenhance.view.state.ImageEnhanceState
import image_enhancer_opencv_desktop_compose_ui.composeapp.generated.resources.Res
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.decodeToImageBitmap

class ImageEnhanceViewModel() : ViewModel() {
    private val _uiState: MutableStateFlow<ImageEnhanceState> = MutableStateFlow(ImageEnhanceState.Loading)
    val uiState: StateFlow<ImageEnhanceState> = _uiState.asStateFlow()

    init {
        observeImage()
    }


    @OptIn(ExperimentalResourceApi::class)
    private fun observeImage() {
        viewModelScope.launch(Dispatchers.IO) {
            Res.readBytes("files/image_01.jpg").decodeToImageBitmap()
                .also { imageBitmap ->
                    _uiState.update {
                        ImageEnhanceState.Success(imageBitmap = imageBitmap)
                    }
                }
        }
    }
}