package com.application.app.modules.iphone13promax8.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promax8.`data`.model.Iphone13ProMax8Model
import com.application.app.modules.iphone13promax8.`data`.model.Iphone13ProMax9RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMax8VM : ViewModel(), KoinComponent {
  val iphone13ProMax8Model: MutableLiveData<Iphone13ProMax8Model> =
      MutableLiveData(Iphone13ProMax8Model())

  var navArguments: Bundle? = null

  val recyclerGroup96List: MutableLiveData<MutableList<Iphone13ProMax9RowModel>> =
      MutableLiveData(mutableListOf())
}
