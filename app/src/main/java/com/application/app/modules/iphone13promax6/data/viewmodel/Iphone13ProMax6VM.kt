package com.application.app.modules.iphone13promax6.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promax6.`data`.model.Iphone13ProMax6Model
import org.koin.core.KoinComponent

class Iphone13ProMax6VM : ViewModel(), KoinComponent {
  val iphone13ProMax6Model: MutableLiveData<Iphone13ProMax6Model> =
      MutableLiveData(Iphone13ProMax6Model())

  var navArguments: Bundle? = null
}
