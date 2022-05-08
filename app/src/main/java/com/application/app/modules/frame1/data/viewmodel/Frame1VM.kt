package com.application.app.modules.frame1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.frame1.`data`.model.Frame1Model
import org.koin.core.KoinComponent

class Frame1VM : ViewModel(), KoinComponent {
  val frame1Model: MutableLiveData<Frame1Model> = MutableLiveData(Frame1Model())

  var navArguments: Bundle? = null
}
