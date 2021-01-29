package com.bullet.architecture.core.di

import com.bullet.architecture.data.network.configuration.Configuration
import com.bullet.architecture.data.network.configuration.interceptor.provider.DefaultInterceptorProvider
import com.bullet.architecture.data.network.configuration.interceptor.provider.InterceptorProvider
import com.bullet.architecture.domain.component.device.UserAgentProvider
import com.bullet.architecture.domain.component.logger.Logger
import org.koin.dsl.module

val defaultInterceptor = module {
    single<InterceptorProvider> {
        DefaultInterceptorProvider(
            configuration = get<Configuration>(),
            userAgentProvider = get<UserAgentProvider>(),
            logger = get<Logger>()
        )
    }
}