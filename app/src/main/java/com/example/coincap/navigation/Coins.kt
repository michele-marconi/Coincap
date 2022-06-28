package com.example.coincap.navigation

sealed class Coins(val route: String) {
    object Home : Coins("home")
    class Details(id: Int) : Coins("details/$id")
}