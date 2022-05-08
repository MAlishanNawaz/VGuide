package com.application.app.modules.soundcloud1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.soundcloud1.`data`.model.SoundCloud1Model
import org.koin.core.KoinComponent

class SoundCloud1VM : ViewModel(), KoinComponent {
  val soundCloud1Model: MutableLiveData<SoundCloud1Model> = MutableLiveData(SoundCloud1Model())

  var navArguments: Bundle? = null
}
