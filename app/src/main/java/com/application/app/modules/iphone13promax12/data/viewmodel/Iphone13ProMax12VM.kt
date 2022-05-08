package com.application.app.modules.iphone13promax12.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promax12.`data`.model.Iphone13ProMax12Model
import org.koin.core.KoinComponent

class Iphone13ProMax12VM : ViewModel(), KoinComponent {
  val iphone13ProMax12Model: MutableLiveData<Iphone13ProMax12Model> =
      MutableLiveData(Iphone13ProMax12Model())

  var navArguments: Bundle? = null
}
