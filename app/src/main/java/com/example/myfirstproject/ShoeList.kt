package com.example.myfirstproject

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.activity.OnBackPressedDispatcher
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myfirstproject.databinding.DatashapeBinding
import com.example.myfirstproject.databinding.FragmentShoeListBinding

class ShoeList : Fragment()  {

   private val viewModel:ProjectViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        findNavController().popBackStack(R.id.shoeList,false)
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_list, container, false
        )
        binding.lifecycleOwner=this
    viewModel.shoeList.observe(viewLifecycleOwner){
         binding.Container.removeAllViews()

        Log.i("ShoeList","ShoeListAcess")
         for(Data in it){
         val binding1:DatashapeBinding=DataBindingUtil.inflate(
             layoutInflater,R.layout.datashape,container,false
         )
             binding1.shoename1.text=Data.shoename
             binding1.shoecolor1.text=Data.color
             binding1.shoecountry1.text=Data.company
             binding1.shoesize1.text=Data.size.toString()


             binding.Container.addView(binding1.root)

         }
     }
        binding.trybtn.setOnClickListener { view:View->
            Navigation.findNavController(view).navigate(R.id.action_shoeList_to_detail)

        }
        setHasOptionsMenu(true)

        // This callback will only be called when MyFragment is at least Started.


        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
      //  return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
        //        || super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.Login->
                findNavController().navigate(ShoeListDirections.actionShoeListToLogin2())
        }
        return super.onOptionsItemSelected(item)
    }



 //   override fun onOptionsItemSelected(item: MenuItem): Boolean {
   //     return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
     //           || super.onOptionsItemSelected(item)
   // }

}