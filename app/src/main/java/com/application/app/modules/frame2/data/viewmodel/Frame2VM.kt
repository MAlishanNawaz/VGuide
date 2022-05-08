package com.application.app.modules.frame2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.frame2.`data`.model.Frame2Model
import org.koin.core.KoinComponent

class Frame2VM : ViewModel(), KoinComponent {
  val frame2Model: MutableLiveData<Frame2Model> = MutableLiveData(Frame2Model())

  var navArguments: Bundle? = null
}
