package com.example.myfirstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfirstproject.databinding.FragmentLoginBinding
import com.example.myfirstproject.databinding.FragmentWelcomeBinding
class Welcome : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWelcomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_welcome, container, false
        )
        binding.btnNext.setOnClickListener { view:View->
            Navigation.findNavController(view).navigate(R.id.action_welcome_to_about)
        }
        // Inflate the layout for this fragment
     //   return inflater.inflate(R.layout.fragment_welcome, container, false)
        return binding.root
    }


}