package com.ozkan.mediumobject

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = "PageA"
    ){
        composable(route = "PageA") {
            PageA(navController = navController)
        }

        composable(route = "PageB") {

            val objBook =
            navController.previousBackStackEntry?.savedStateHandle?.get<Book>("bookItem")

            PageB(book = objBook!!,navController)
        }
    }
}