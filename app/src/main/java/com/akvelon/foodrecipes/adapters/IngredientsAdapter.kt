package com.akvelon.foodrecipes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.akvelon.foodrecipes.R
import com.akvelon.foodrecipes.models.ExtendedIngredient
import com.akvelon.foodrecipes.util.Constants.Companion.BASE_IMAGE_URL
import com.akvelon.foodrecipes.util.RecipesDiffUtil
import kotlinx.android.synthetic.main.ingredients_row_layout.view.*
import java.util.*

class IngredientsAdapter : RecyclerView.Adapter<IngredientsAdapter.MyViewHolder>() {
    private var ingredientsList = emptyList<ExtendedIngredient>()
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.ingredients_row_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.ingredient_imageView.load(BASE_IMAGE_URL + ingredientsList[position].image){
            crossfade(600)
            error(R.drawable.ic_error_load_pickture)
        }
        holder.itemView.ingredient_name.text = ingredientsList[position].name.capitalize(Locale.ROOT)
        holder.itemView.ingredient_amount.text = ingredientsList[position].amount.toString()
        holder.itemView.ingredient_unit.text = ingredientsList[position].unit
        holder.itemView.ingredient_original.text = ingredientsList[position].original
        holder.itemView.ingredient_consistency.text = ingredientsList[position].consistency
    }

    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    fun setData(newIngredients: List<ExtendedIngredient>){
        val ingredientsDiffUtil = RecipesDiffUtil(ingredientsList, newIngredients)
        val diffUtilResult = DiffUtil.calculateDiff(ingredientsDiffUtil)
        ingredientsList = newIngredients
        diffUtilResult.dispatchUpdatesTo(this)
    }

}