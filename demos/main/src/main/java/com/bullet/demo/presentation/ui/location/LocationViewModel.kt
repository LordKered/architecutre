package com.bullet.demo.presentation.ui.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bullet.architecture.core.controller.BaseViewModel
import com.bullet.architecture.core.ui.view.model.TextProvider
import com.bullet.demo.presentation.ui.location.model.LocationModel

class LocationViewModel : BaseViewModel(), LocationPresenter {

    private var locationData = LocationModel()

    private val _locationModel by lazy { MutableLiveData<LocationModel>(locationData) }
    val locationModel: LiveData<LocationModel>
        get() = _locationModel

    override fun onCardActionPressed() {
        showMessage(TextProvider.Text("Still in development"))
    }


}