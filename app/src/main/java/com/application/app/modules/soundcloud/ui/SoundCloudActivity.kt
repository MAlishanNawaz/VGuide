package com.application.app.modules.soundcloud.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySoundCloudBinding
import com.application.app.modules.frame1.ui.Frame1Activity
import com.application.app.modules.soundcloud.`data`.viewmodel.SoundCloudVM
import com.application.app.modules.soundcloud1.ui.SoundCloud1Activity
import com.application.app.modules.soundcloud2.ui.SoundCloud2Activity
import kotlin.String
import kotlin.Unit

class SoundCloudActivity : BaseActivity<ActivitySoundCloudBinding>(R.layout.activity_sound_cloud) {
  private val viewModel: SoundCloudVM by viewModels<SoundCloudVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.soundCloudVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUnsplashJ9O3Wc1.setOnClickListener {
      val destIntent = SoundCloud2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUnsplashJ9O3Wc2.setOnClickListener {
      val destIntent = SoundCloud1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUnsplashJ9O3Wc.setOnClickListener {
      val destIntent = Frame1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SOUND_CLOUD_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SoundCloudActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
