package com.example.translateapp.Model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(application: Application) : AndroidViewModel(application){

    private val compteur: MutableLiveData<Int>( 0 )

     fun getCompteur() = compteur


}