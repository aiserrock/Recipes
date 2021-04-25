package com.akvelon.foodrecipes.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.akvelon.foodrecipes.util.Constants.Companion.RECIPES_TABLE
import com.akvelon.foodrecipes.models.FoodRecipe

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}