package pt.ipmaia.dariorecipes.data

import pt.ipmaia.dariorecipes.data.network.FoodRecipesApi
import pt.ipmaia.dariorecipes.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}