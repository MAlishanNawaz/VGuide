package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone13ProMax6: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_pro_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone13ProMax7: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_pro_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone13ProMax8: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_pro_m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame1: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame2: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSoundCloud: String? = MyApp.getInstance().resources.getString(R.string.lbl_sound_cloud)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSoundCloud1: String? = MyApp.getInstance().resources.getString(R.string.lbl_sound_cloud)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSoundCloud2: String? = MyApp.getInstance().resources.getString(R.string.lbl_sound_cloud)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone13ProMax9: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_pro_m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone13ProMax10: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_13_pro_m)

)
