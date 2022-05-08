package com.application.app.modules.frame2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFrame2Binding
import com.application.app.modules.frame1.ui.Frame1Activity
import com.application.app.modules.frame2.`data`.viewmodel.Frame2VM
import kotlin.String
import kotlin.Unit

class Frame2Activity : BaseActivity<ActivityFrame2Binding>(R.layout.activity_frame_2) {
  private val viewModel: Frame2VM by viewModels<Frame2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUnsplashJ9O3Wc2.setOnClickListener {
      val destIntent = Frame1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUnsplashJ9O3Wc1.setOnClickListener {
      val destIntent = Frame1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUnsplashJ9O3Wc.setOnClickListener {
      val destIntent = Frame1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME2ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
