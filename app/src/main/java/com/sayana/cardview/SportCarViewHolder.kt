package com.sayana.cardview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportCarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val brandTextView:TextView=itemView.findViewById(R.id.brand_text_view)
    private val speedTextView:TextView=itemView.findViewById(R.id.speed_text_view)
    private val driftTextView:TextView=itemView.findViewById(R.id.drift_text_view)
    private val colorTextView:TextView=itemView.findViewById(R.id.color_text_view)

    fun bind(sportCar: Car.SportCar) {
        brandTextView.text = "Brand: ${sportCar.brand}"
        speedTextView.text = "Speed: ${sportCar.speed} km/h"
        driftTextView.text = "Drift lvl: ${sportCar.driftLevel}"
        colorTextView.text = "Color: ${sportCar.color}"
    }

}