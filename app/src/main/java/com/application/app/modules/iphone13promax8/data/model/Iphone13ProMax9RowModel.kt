package com.application.app.modules.iphone13promax8.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMax9RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBarcelona: String? = MyApp.getInstance().resources.getString(R.string.lbl_barcelona)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVianaGrill: String? = MyApp.getInstance().resources.getString(R.string.lbl_viana_grill)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt88: String? = MyApp.getInstance().resources.getString(R.string.lbl_88)

)
