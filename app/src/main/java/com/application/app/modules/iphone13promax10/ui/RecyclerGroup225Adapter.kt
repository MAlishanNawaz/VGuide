package com.application.app.modules.iphone13promax10.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIphone13ProMax11Binding
import com.application.app.modules.iphone13promax10.`data`.model.Iphone13ProMax11RowModel
import kotlin.Int
import kotlin.collections.List

class RecyclerGroup225Adapter(
  var list: List<Iphone13ProMax11RowModel>
) : RecyclerView.Adapter<RecyclerGroup225Adapter.RowIphone13ProMax11VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone13ProMax11VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_13_pro_max_11,parent,false)
    return RowIphone13ProMax11VH(view)
  }

  override fun onBindViewHolder(holder: RowIphone13ProMax11VH, position: Int) {
    val iphone13ProMax11RowModel = Iphone13ProMax11RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone13ProMax11RowModel = list[position]
    holder.binding.iphone13ProMax11RowModel = iphone13ProMax11RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone13ProMax11RowModel>) {
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
      item: Iphone13ProMax11RowModel
    ) {
    }
  }

  inner class RowIphone13ProMax11VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowIphone13ProMax11Binding = RowIphone13ProMax11Binding.bind(itemView)
  }
}
