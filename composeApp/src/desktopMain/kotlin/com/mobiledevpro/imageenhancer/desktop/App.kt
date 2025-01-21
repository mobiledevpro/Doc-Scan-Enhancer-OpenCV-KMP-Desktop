package com.mobiledevpro.imageenhancer.desktop

import androidx.compose.runtime.*
import androidx.compose.ui.window.application
import com.mobiledevpro.imageenhance.di.featureImageEnhanceModule
import com.mobiledevpro.imageenhance.view.ImageEnhanceScreen
import com.mobiledevpro.imageenhance.view.ImageEnhanceViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.*
import org.koin.compose.scope.rememberKoinScope
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.qualifier.TypeQualifier
import org.koin.core.scope.Scope
import org.koin.dsl.module
import org.koin.ext.getFullName
import org.koin.java.KoinJavaComponent

@Composable
@Preview
fun App() {
    KoinApplication(application = {
        modules(featureImageEnhanceModule)
    }) {
        val imageEnhanceViewModel: ImageEnhanceViewModel = koinViewModel()

        AppTheme {
            ImageEnhanceScreen(
                uiState = imageEnhanceViewModel.uiState
            )
        }
    }
}

/*
inline fun <reified T> koinScope(): Scope {

    val scopeId = T::class.getFullName() + "@" + T::class.hashCode()
    val qualifier = TypeQualifier(T::class)

    return KoinJavaComponent.getKoin().getOrCreateScope(scopeId, qualifier)
}
*/