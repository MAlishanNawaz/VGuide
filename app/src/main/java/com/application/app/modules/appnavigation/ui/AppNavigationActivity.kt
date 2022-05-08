package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.frame1.ui.Frame1Activity
import com.application.app.modules.frame2.ui.Frame2Activity
import com.application.app.modules.iphone13promax10.ui.Iphone13ProMax10Activity
import com.application.app.modules.iphone13promax12.ui.Iphone13ProMax12Activity
import com.application.app.modules.iphone13promax6.ui.Iphone13ProMax6Activity
import com.application.app.modules.iphone13promax7.ui.Iphone13ProMax7Activity
import com.application.app.modules.iphone13promax8.ui.Iphone13ProMax8Activity
import com.application.app.modules.soundcloud.ui.SoundCloudActivity
import com.application.app.modules.soundcloud1.ui.SoundCloud1Activity
import com.application.app.modules.soundcloud2.ui.SoundCloud2Activity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSoundCloud1.setOnClickListener {
      val destIntent = SoundCloud1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMax8.setOnClickListener {
      val destIntent = Iphone13ProMax8Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMax9.setOnClickListener {
      val destIntent = Iphone13ProMax10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSoundCloud.setOnClickListener {
      val destIntent = SoundCloudActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFrame1.setOnClickListener {
      val destIntent = Frame1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMax6.setOnClickListener {
      val destIntent = Iphone13ProMax6Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSoundCloud2.setOnClickListener {
      val destIntent = SoundCloud2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMax7.setOnClickListener {
      val destIntent = Iphone13ProMax7Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFrame2.setOnClickListener {
      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMax10.setOnClickListener {
      val destIntent = Iphone13ProMax12Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
