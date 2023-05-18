package com.example.newspagedarkmode

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class RVAdapter: RecyclerView.Adapter<RVAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

            private val differCallback = object : DiffUtil.ItemCallback<ResponseModel>()
    ):

    class MyViewHolder(val view: View): RecyclerView.ViewHolder(view), Parcelable {
        constructor(parcel: Parcel) : this(TODO("view")) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {

        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<MyViewHolder> {
            override fun createFromParcel(parcel: Parcel): MyViewHolder {
                return MyViewHolder(parcel)
            }

            override fun newArray(size: Int): Array<MyViewHolder?> {
                return arrayOfNulls(size)
            }
        }
    }


}