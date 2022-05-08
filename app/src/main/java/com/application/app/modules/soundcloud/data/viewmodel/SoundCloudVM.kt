package com.application.app.modules.soundcloud.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.soundcloud.`data`.model.SoundCloudModel
import org.koin.core.KoinComponent

class SoundCloudVM : ViewModel(), KoinComponent {
  val soundCloudModel: MutableLiveData<SoundCloudModel> = MutableLiveData(SoundCloudModel())

  var navArguments: Bundle? = null
}
