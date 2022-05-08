package com.application.app.modules.iphone13promax7.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMax7Binding
import com.application.app.modules.iphone13promax7.`data`.viewmodel.Iphone13ProMax7VM
import com.application.app.modules.iphone13promax8.ui.Iphone13ProMax8Activity
import kotlin.String
import kotlin.Unit

class Iphone13ProMax7Activity :
    BaseActivity<ActivityIphone13ProMax7Binding>(R.layout.activity_iphone_13_pro_max_7) {
  private val viewModel: Iphone13ProMax7VM by viewModels<Iphone13ProMax7VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMax7VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup2882.setOnClickListener {
      val destIntent = Iphone13ProMax8Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX7ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMax7Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
