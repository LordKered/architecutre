package com.bullet.demo.presentation.ui.splash

import com.bullet.architecture.R
import com.bullet.architecture.core.controller.BaseViewModel
import com.bullet.architecture.core.ui.fragment.BaseFragment
import com.bullet.architecture.databinding.FragmentSplashBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment<FragmentSplashBinding>(
    contentLayoutID = R.layout.fragment_splash
), SplashView {
    private val viewModel by viewModel<SplashViewModel>()

    override fun getViewModel(): BaseViewModel = viewModel

}