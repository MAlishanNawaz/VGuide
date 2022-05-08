package com.application.app.modules.iphone13promax10.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promax10.`data`.model.Iphone13ProMax10Model
import com.application.app.modules.iphone13promax10.`data`.model.Iphone13ProMax11RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMax10VM : ViewModel(), KoinComponent {
  val iphone13ProMax10Model: MutableLiveData<Iphone13ProMax10Model> =
      MutableLiveData(Iphone13ProMax10Model())

  var navArguments: Bundle? = null

  val recyclerGroup225List: MutableLiveData<MutableList<Iphone13ProMax11RowModel>> =
      MutableLiveData(mutableListOf())
}
