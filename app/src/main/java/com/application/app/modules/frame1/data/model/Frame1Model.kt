package com.application.app.modules.frame1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Frame1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBarcelona: String? = MyApp.getInstance().resources.getString(R.string.lbl_barcelona)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMistyRockReso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_misty_rock_reso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt95: String? = MyApp.getInstance().resources.getString(R.string.lbl_95)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEaNonTemporE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ea_non_tempor_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
