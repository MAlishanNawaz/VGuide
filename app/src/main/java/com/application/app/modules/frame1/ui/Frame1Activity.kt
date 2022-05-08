package com.application.app.modules.frame1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFrame1Binding
import com.application.app.modules.frame1.`data`.viewmodel.Frame1VM
import com.application.app.modules.frame2.ui.Frame2Activity
import com.application.app.modules.soundcloud.ui.SoundCloudActivity
import kotlin.String
import kotlin.Unit

class Frame1Activity : BaseActivity<ActivityFrame1Binding>(R.layout.activity_frame_1) {
  private val viewModel: Frame1VM by viewModels<Frame1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVector11.setOnClickListener {
      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup2882.setOnClickListener {
      val destIntent = SoundCloudActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME1ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
