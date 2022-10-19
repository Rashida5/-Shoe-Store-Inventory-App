package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.example.myfirstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  //  lateinit var viewModel: ProjectViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
      val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

       setSupportActionBar(binding.Toolbar)
     //  val navController=this.findNavController(R.id.nav_host_fragment)
     val navHostFragment= supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
      val navController = navHostFragment.navController
     val config=AppBarConfiguration(navController.graph)
      binding.Toolbar.setupWithNavController(navController,config)
      val intent=Intent().apply {  }



    }


}