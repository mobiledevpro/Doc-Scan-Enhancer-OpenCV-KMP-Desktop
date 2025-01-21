package com.mobiledevpro.imageenhance.di

import com.mobiledevpro.imageenhance.view.ImageEnhanceViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val featureImageEnhanceModule = module {
    //TODO: scope doesn't work here , cannot figure out why
    /*scope<ImageEnhanceViewModel> {

    }*/
    singleOf(::ImageEnhanceViewModel)
}