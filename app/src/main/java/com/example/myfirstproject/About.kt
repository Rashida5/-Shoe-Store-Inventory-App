package com.example.myfirstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfirstproject.databinding.FragmentAboutBinding


class About : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAboutBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_about, container, false
        )


        binding.button.setOnClickListener { view:View->
       //     Navigation.findNavController(view).navigate(R.id.action_about_to_shoeList)
            Navigation.findNavController(view).navigate(R.id.action_about_to_shoeList)
        }
        return binding.root
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_about, container, false)
    }

}