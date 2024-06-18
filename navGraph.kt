package com.codewithomkar.travel.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codewithomkar.travel.screen.LoginScreen
import com.codewithomkar.travel.screen.Splashscreen


@Composable

fun navGraph(navController: NavHostController){

    NavHost(navController = navController, startDestination = routes.Splash.routes ){

        composable(routes.Splash.routes){
            Splashscreen(navController)
        }

        composable(routes.Login.routes){
            LoginScreen(navController)
        }
    }
}