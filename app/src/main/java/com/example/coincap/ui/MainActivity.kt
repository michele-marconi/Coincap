package com.example.coincap.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.coincap.navigation.Coins
import com.example.coincap.ui.theme.CoincapTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoincapTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = Coins.Home.route) {
                    composable(Coins.Home.route) {
                        Home(navController)
                    }
                    composable(
                        "coins/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val id = backStackEntry.arguments?.getInt("id")!!
                        Details(
                            navController,
                            id
                        )
                    }
                }
            }
        }
    }
}