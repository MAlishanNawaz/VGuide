package com.application.app.modules.frame2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Frame2Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindYourPlac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_plac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchHere: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt80: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt70: String? = MyApp.getInstance().resources.getString(R.string.lbl_70)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt95: String? = MyApp.getInstance().resources.getString(R.string.lbl_952)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt88: String? = MyApp.getInstance().resources.getString(R.string.lbl_882)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt60: String? = MyApp.getInstance().resources.getString(R.string.lbl_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt89: String? = MyApp.getInstance().resources.getString(R.string.lbl_89)

)
