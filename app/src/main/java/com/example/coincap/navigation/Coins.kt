package com.example.coincap.navigation

sealed class Coins(val route: String) {
    object Home : Coins("home")
    class Details(id: String) : Coins("details/$id")
}