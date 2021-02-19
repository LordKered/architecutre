package com.bullet.demo.presentation.ui.location

import com.bullet.architecture.core.ui.view.BaseView
import com.bullet.demo.presentation.ui.location.model.LocationModel

interface LocationView : BaseView {
    fun attachLocationModel(model: LocationModel)
}