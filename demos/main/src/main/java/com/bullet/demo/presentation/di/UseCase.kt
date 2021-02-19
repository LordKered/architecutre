package com.bullet.demo.presentation.di

import com.bullet.demo.domain.usecase.PreLoadingUseCase
import org.koin.dsl.module

val useCase = module {
    factory<PreLoadingUseCase> { PreLoadingUseCase() }
}