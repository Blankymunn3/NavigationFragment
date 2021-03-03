package com.blankymunn3.navigationfragment.activity

import android.os.Bundle
import androidx.navigation.ui.NavigationUI
import androidx.navigation.findNavController
import com.blankymunn3.navigationfragment.BaseActivity
import com.blankymunn3.navigationfragment.R
import com.blankymunn3.navigationfragment.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        binding.lifecycleOwner = this
        binding.bottomNavigationMain.inflateMenu(R.menu.menu_main)
        val navController = findNavController(R.id.nav_host_fragment_container)
        NavigationUI.setupWithNavController(binding.bottomNavigationMain, navController)
    }
}