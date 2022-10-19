package com.example.myfirstproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myfirstproject.databinding.FragmentDetailBinding
import com.example.myfirstproject.ProjectViewModel
import com.example.myfirstproject.Data

class Detail : Fragment() {
    private  val ViewModel:ProjectViewModel by  activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        findNavController().popBackStack(R.id.detail,false)
        val binding: FragmentDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detail, container, false
        )
       binding.obj= ViewModel

        binding.lifecycleOwner=this
        binding.saveBtn.setOnClickListener { view: View ->

                ViewModel.add()
            Log.i("ShoeList","onClick")
               Toast.makeText(activity,"Enter Successefully",Toast.LENGTH_SHORT).show()
            Navigation.findNavController(view).navigate(R.id.action_detail_to_shoeList)
        }
        binding.cancel.setOnClickListener { view:View->

            Navigation.findNavController(view).navigate(R.id.action_detail_to_shoeList)
        }

        return binding.root


    }
}