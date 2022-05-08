package com.application.app.modules.soundcloud.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class SoundCloudModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt88: String? = MyApp.getInstance().resources.getString(R.string.lbl_882)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt70: String? = MyApp.getInstance().resources.getString(R.string.lbl_702)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt81: String? = MyApp.getInstance().resources.getString(R.string.lbl_81)

)
