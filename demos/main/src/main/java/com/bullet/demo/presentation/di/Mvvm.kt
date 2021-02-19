package com.bullet.demo.presentation.di

import com.bullet.demo.domain.usecase.PreLoadingUseCase
import com.bullet.demo.presentation.ui.location.LocationViewModel
import com.bullet.demo.presentation.ui.splash.SplashViewModel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mvvm = module {
    viewModel<SplashViewModel> { SplashViewModel(preLoadingUseCase = PreLoadingUseCase()) }
    viewModel<LocationViewModel> { LocationViewModel() }
}