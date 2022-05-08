package com.application.app.modules.soundcloud1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySoundCloud1Binding
import com.application.app.modules.soundcloud.ui.SoundCloudActivity
import com.application.app.modules.soundcloud1.`data`.viewmodel.SoundCloud1VM
import kotlin.String
import kotlin.Unit

class SoundCloud1Activity : BaseActivity<ActivitySoundCloud1Binding>(R.layout.activity_sound_cloud1)
    {
  private val viewModel: SoundCloud1VM by viewModels<SoundCloud1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.soundCloud1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVector11.setOnClickListener {
      val destIntent = SoundCloudActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SOUND_CLOUD1ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SoundCloud1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
