package com.application.app.modules.soundcloud2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class SoundCloud2Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelfi: String? = MyApp.getInstance().resources.getString(R.string.lbl_selfi)

)
