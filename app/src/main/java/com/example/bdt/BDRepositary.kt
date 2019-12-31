package com.example.bdt

import android.app.Application
import androidx.lifecycle.LiveData

class BDRepositary (private val bdDao: BDDao){

    val allBD : LiveData<List<BD>> = bdDao.getAllDB()

   suspend fun insertBD(bd: BD){
       bdDao.insertBD(bd)
   }
}
