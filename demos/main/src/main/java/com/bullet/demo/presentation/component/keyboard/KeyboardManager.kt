package com.bullet.demo.presentation.component.keyboard

import com.bullet.architecture.domain.manager.Manager

interface KeyboardManager : Manager {
    fun onStart()

    fun onStop()

    fun addListener(keyboardListener: KeyboardListener)

    fun removeListener(keyboardListener: KeyboardListener)
}