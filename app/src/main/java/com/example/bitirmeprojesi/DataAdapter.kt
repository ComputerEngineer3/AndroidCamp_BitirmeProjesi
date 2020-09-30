package com.example.bitirmeprojesi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import kotlinx.android.synthetic.main.item_image.view.*

class DataAdapter(private val dataList :MutableList<DataClass>, private val onClick: (DataClass) -> Unit) :RecyclerView.Adapter<DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(parent.inflate(R.layout.item_image))
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val data = dataList[position]
        holder.bind(data, onClick)

    }

    override fun getItemCount(): Int = dataList.size
}


class DataViewHolder(view :View) : RecyclerView.ViewHolder(view) {
    fun bind(data : DataClass, onClick: (DataClass) -> Unit) {
        //view.imageViewBanner.load(data.banner)
       ///// itemView.textView.text = data.name

        itemView.imageViewBanner.load(data.banner)

        itemView.setOnClickListener {
            onClick(data)
        }

    }
}

/*fun ViewGroup.inflate(layoutId :Int) :View{
    val layoutInflater = LayoutInflater.from(context)
    return layoutInflater.inflate(layoutId, this, false)
}*/