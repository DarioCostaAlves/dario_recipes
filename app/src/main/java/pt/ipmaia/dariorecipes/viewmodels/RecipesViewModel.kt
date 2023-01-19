package pt.ipmaia.dariorecipes.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import pt.ipmaia.dariorecipes.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import pt.ipmaia.dariorecipes.util.Constants.Companion.QUERY_API_KEY
import pt.ipmaia.dariorecipes.util.Constants.Companion.QUERY_DIET
import pt.ipmaia.dariorecipes.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import pt.ipmaia.dariorecipes.util.Constants.Companion.QUERY_NUMBER
import pt.ipmaia.dariorecipes.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = "64347a6c8e9040e2a9c72bd5ffdd49a2"
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }

}