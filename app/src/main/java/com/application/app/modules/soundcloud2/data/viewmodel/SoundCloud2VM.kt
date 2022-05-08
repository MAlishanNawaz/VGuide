package com.application.app.modules.soundcloud2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.soundcloud2.`data`.model.SoundCloud2Model
import org.koin.core.KoinComponent

class SoundCloud2VM : ViewModel(), KoinComponent {
  val soundCloud2Model: MutableLiveData<SoundCloud2Model> = MutableLiveData(SoundCloud2Model())

  var navArguments: Bundle? = null
}
