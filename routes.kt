package com.codewithomkar.travel.navigation



sealed class routes (val routes:String){

    object Splash:routes("splash")
    object Login:routes("login")

}