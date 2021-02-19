package com.bullet.demo.presentation.ui.main

import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.bullet.architecture.R
import com.bullet.architecture.core.ui.activity.BaseActivity
import com.bullet.architecture.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(
    contentLayoutID = R.layout.activity_main
) {
    override val navController: NavController by lazy { findNavController(R.id.mainHostNavFragment) }
}