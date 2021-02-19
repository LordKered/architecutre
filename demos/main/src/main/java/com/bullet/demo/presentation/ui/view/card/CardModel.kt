package com.bullet.demo.presentation.ui.view.card

import com.bullet.architecture.core.ui.view.model.IconProvider
import com.bullet.architecture.core.ui.view.model.TextProvider

data class CardModel(
    val icon: IconProvider,
    val title: TextProvider,
    val description: TextProvider,
    val buttonTitle: TextProvider
)
