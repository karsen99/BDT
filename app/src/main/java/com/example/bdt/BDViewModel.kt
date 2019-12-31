package com.example.bdt

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BDViewModel(application: Application):AndroidViewModel(application) {

    private val bdRepositary: BDRepositary

    val allBD: LiveData<List<BD>>

    init {
        val bdDao = BDDatabase.getInstance(application).bdDao()
        bdRepositary = BDRepositary(bdDao)
        allBD = bdRepositary.allBD

    }

    //out in launch must be suspend method
    fun insertBD(bd: BD) = viewModelScope.launch{
        bdRepositary.insertBD(bd)

    }
}