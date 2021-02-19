package com.bullet.demo.presentation.di

import com.bullet.architecture.core.di.defaultDomainModule
import com.bullet.architecture.core.di.defaultPresentation

val appModule = defaultDomainModule + mvvm + useCase + defaultPresentation