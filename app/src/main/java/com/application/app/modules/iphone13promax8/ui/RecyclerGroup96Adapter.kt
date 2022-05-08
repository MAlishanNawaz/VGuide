package com.application.app.modules.iphone13promax8.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIphone13ProMax9Binding
import com.application.app.modules.iphone13promax8.`data`.model.Iphone13ProMax9RowModel
import kotlin.Int
import kotlin.collections.List

class RecyclerGroup96Adapter(
  var list: List<Iphone13ProMax9RowModel>
) : RecyclerView.Adapter<RecyclerGroup96Adapter.RowIphone13ProMax9VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone13ProMax9VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_13_pro_max_9,parent,false)
    return RowIphone13ProMax9VH(view)
  }

  override fun onBindViewHolder(holder: RowIphone13ProMax9VH, position: Int) {
    val iphone13ProMax9RowModel = Iphone13ProMax9RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone13ProMax9RowModel = list[position]
    holder.binding.iphone13ProMax9RowModel = iphone13ProMax9RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone13ProMax9RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Iphone13ProMax9RowModel
    ) {
    }
  }

  inner class RowIphone13ProMax9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowIphone13ProMax9Binding = RowIphone13ProMax9Binding.bind(itemView)
  }
}
