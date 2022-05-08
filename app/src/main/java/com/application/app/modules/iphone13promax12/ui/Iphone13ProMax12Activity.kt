package com.application.app.modules.iphone13promax12.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMax12Binding
import com.application.app.modules.iphone13promax12.`data`.viewmodel.Iphone13ProMax12VM
import kotlin.String
import kotlin.Unit

class Iphone13ProMax12Activity :
    BaseActivity<ActivityIphone13ProMax12Binding>(R.layout.activity_iphone_13_pro_max_12) {
  private val viewModel: Iphone13ProMax12VM by viewModels<Iphone13ProMax12VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMax12VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX12ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMax12Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
