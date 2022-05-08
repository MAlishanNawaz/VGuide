package com.application.app.modules.iphone13promax7.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promax7.`data`.model.Iphone13ProMax7Model
import org.koin.core.KoinComponent

class Iphone13ProMax7VM : ViewModel(), KoinComponent {
  val iphone13ProMax7Model: MutableLiveData<Iphone13ProMax7Model> =
      MutableLiveData(Iphone13ProMax7Model())

  var navArguments: Bundle? = null
}
