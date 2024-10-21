package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroeAdapter(val heroeList : List<Heroe>, val onClick : (Heroe)->Unit) : RecyclerView.Adapter<HeroeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item,parent,false)
        return HeroeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroeList.count()
    }

    override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
        val heroe = heroeList[position]
        holder.heroeName.text = heroe.name
        holder.heroePrice.text = heroe.computedPrice
        holder.heroeRating.text = heroe.rating.toString()
        Picasso.get().load(heroe.image).into(holder.heroeImage)
        holder.itemView.setOnClickListener {
            onClick(heroe)
        }
    }
}

class HeroeViewHolder(view: View): ViewHolder(view){
    val heroeImage : ImageView = view.findViewById(R.id.heroe_image)
    val heroeName : TextView = view.findViewById(R.id.heroe_name)
    val heroePrice : TextView = view.findViewById(R.id.heroe_price)
    val heroeRating : TextView = view.findViewById(R.id.heroe_rating)
}