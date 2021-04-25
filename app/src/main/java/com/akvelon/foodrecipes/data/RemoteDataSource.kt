package com.akvelon.foodrecipes.data

import com.akvelon.foodrecipes.data.network.FoodRecipesAPI
import com.akvelon.foodrecipes.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

/**
 * How it works???
 * Помечая аннтоацией @Inject я говорю Hilt, какие зависимости я буду
 * внедрять в класс
 * В данном случае внедряю FoodRecipesAPI класс как зависимость,
 * Хилт метнется в NetworkModule(это такая сумка, где мы обьясняем Hilt
 * как предоставлять зависимости классам) и там найдет метод provideApiService
 * который возвращает нужный нам тип FoodRecipesAPI
 * Теперь Хилт знает как предоставить эту зависимость и создаст все необходимое сам и
 * будет контролировать все сам
 * **/
class RemoteDataSource @Inject constructor(
    private val foodRecipesAPI: FoodRecipesAPI
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesAPI.getRecipes(queries)
    }
}
