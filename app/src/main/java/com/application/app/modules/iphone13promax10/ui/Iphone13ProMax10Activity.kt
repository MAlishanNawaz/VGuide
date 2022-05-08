package com.application.app.modules.iphone13promax10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMax10Binding
import com.application.app.modules.iphone13promax10.`data`.model.Iphone13ProMax11RowModel
import com.application.app.modules.iphone13promax10.`data`.viewmodel.Iphone13ProMax10VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMax10Activity :
    BaseActivity<ActivityIphone13ProMax10Binding>(R.layout.activity_iphone_13_pro_max_10) {
  private val viewModel: Iphone13ProMax10VM by viewModels<Iphone13ProMax10VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup225Adapter =
    RecyclerGroup225Adapter(viewModel.recyclerGroup225List.value?:mutableListOf())
    binding.recyclerGroup225.adapter = recyclerGroup225Adapter
    recyclerGroup225Adapter.setOnItemClickListener(
    object : RecyclerGroup225Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone13ProMax11RowModel) {
        onClickRecyclerGroup225(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup225List.observe(this) {
      recyclerGroup225Adapter.updateData(it)
    }
    binding.iphone13ProMax10VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGroup225(
    view: View,
    position: Int,
    item: Iphone13ProMax11RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX10ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMax10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
