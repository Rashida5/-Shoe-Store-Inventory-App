package com.example.myfirstproject
import android.util.Log
import android.widget.Toast
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import com.example.myfirstproject.Data
class ProjectViewModel : ViewModel() {
   // var data :Data?=null
 //   var data :Data?=null
    var data:Data?=null
  //  private val _shoeList= MutableLiveData<MutableList<MutableList<Data>>()
    private val _shoeList=MutableLiveData<MutableList<Data>>((mutableListOf()))
    val shoeList: LiveData<MutableList<Data>>
        get()=_shoeList

    init{
        data=Data("Nike",5,"DD","Red")

    }


    val edittext = MutableLiveData<String>()
    fun add(){
    Log.i("ShoeList", "add")

        data?.let { _shoeList.value!!.add(it.copy()) }

        Log.i("ShoeList","add")
    }

}
