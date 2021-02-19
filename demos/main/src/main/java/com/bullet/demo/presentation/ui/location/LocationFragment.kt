package com.bullet.demo.presentation.ui.location

import android.os.Bundle
import android.view.View
import com.bullet.architecture.R
import com.bullet.architecture.core.controller.BaseViewModel
import com.bullet.architecture.core.ui.fragment.BaseFragment
import com.bullet.architecture.databinding.FragmentLocationBinding
import com.bullet.architecture.databinding.FragmentSplashBinding
import com.bullet.demo.presentation.ui.location.model.LocationModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LocationFragment : BaseFragment<FragmentLocationBinding>(
    contentLayoutID = R.layout.fragment_location
), LocationView {
    private val viewModel by viewModel<LocationViewModel>()

    override fun getViewModel(): BaseViewModel = viewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.presenter = viewModel
    }

    override fun setObservers() {
        super.setObservers()
        viewModel.locationModel.observe(viewLifecycleOwner, ::attachLocationModel)
    }

    override fun attachLocationModel(model: LocationModel) {
        binding.model = model
    }
}