package com.application.app.modules.soundcloud2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySoundCloud2Binding
import com.application.app.modules.soundcloud.ui.SoundCloudActivity
import com.application.app.modules.soundcloud2.`data`.viewmodel.SoundCloud2VM
import kotlin.String
import kotlin.Unit

class SoundCloud2Activity : BaseActivity<ActivitySoundCloud2Binding>(R.layout.activity_sound_cloud2)
    {
  private val viewModel: SoundCloud2VM by viewModels<SoundCloud2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.soundCloud2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVector12.setOnClickListener {
      val destIntent = SoundCloudActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SOUND_CLOUD2ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SoundCloud2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
