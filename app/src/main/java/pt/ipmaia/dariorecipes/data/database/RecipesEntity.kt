package pt.ipmaia.dariorecipes.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import pt.ipmaia.dariorecipes.models.FoodRecipe
import pt.ipmaia.dariorecipes.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
)  {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}