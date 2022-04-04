package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.detail.DetailScreen
import com.example.movieapp.screens.home.HomeScreen
@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name){
        composable(MovieScreens.HomeScreen.name){ HomeScreen(navController = navController)}
        composable(MovieScreens.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument("movie"){
                type = NavType.StringType
            })
        ){ backStackEntry ->

            DetailScreen(navController = navController, movieId = backStackEntry.arguments?.getString("movie") )
        }
    }

}

