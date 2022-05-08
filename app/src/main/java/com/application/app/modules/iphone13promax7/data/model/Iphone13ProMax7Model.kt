package com.application.app.modules.iphone13promax7.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMax7Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtDesignYourDre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_design_your_dre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverPlaces: String? =
      MyApp.getInstance().resources.getString(R.string.msg_discover_places)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)

)
