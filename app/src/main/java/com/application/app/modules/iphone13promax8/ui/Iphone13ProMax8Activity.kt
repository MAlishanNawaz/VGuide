package com.application.app.modules.iphone13promax8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMax8Binding
import com.application.app.modules.frame2.ui.Frame2Activity
import com.application.app.modules.iphone13promax8.`data`.model.Iphone13ProMax9RowModel
import com.application.app.modules.iphone13promax8.`data`.viewmodel.Iphone13ProMax8VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMax8Activity :
    BaseActivity<ActivityIphone13ProMax8Binding>(R.layout.activity_iphone_13_pro_max_8) {
  private val viewModel: Iphone13ProMax8VM by viewModels<Iphone13ProMax8VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup96Adapter =
    RecyclerGroup96Adapter(viewModel.recyclerGroup96List.value?:mutableListOf())
    binding.recyclerGroup96.adapter = recyclerGroup96Adapter
    recyclerGroup96Adapter.setOnItemClickListener(
    object : RecyclerGroup96Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone13ProMax9RowModel) {
        onClickRecyclerGroup96(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup96List.observe(this) {
      recyclerGroup96Adapter.updateData(it)
    }
    binding.iphone13ProMax8VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup2916.setOnClickListener {
      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUnsplashxEaAoi.setOnClickListener {
      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGroup96(
    view: View,
    position: Int,
    item: Iphone13ProMax9RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX8ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMax8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
