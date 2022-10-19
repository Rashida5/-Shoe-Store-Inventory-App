package com.example.myfirstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfirstproject.databinding.FragmentLoginBinding
class Login : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )
        binding.signin.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_login_to_welcome2)
        }

        binding.signup.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_login_to_welcome2)
        }

        return binding.root;
    }
}
