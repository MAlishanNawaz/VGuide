package com.application.app.modules.iphone13promax6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMax6Binding
import com.application.app.modules.iphone13promax6.`data`.viewmodel.Iphone13ProMax6VM
import kotlin.String
import kotlin.Unit

class Iphone13ProMax6Activity :
    BaseActivity<ActivityIphone13ProMax6Binding>(R.layout.activity_iphone_13_pro_max_6) {
  private val viewModel: Iphone13ProMax6VM by viewModels<Iphone13ProMax6VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMax6VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX6ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMax6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
