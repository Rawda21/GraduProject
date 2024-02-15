package com.example.graduproject.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(val route:String, val tittle:String, val icon:ImageVector){
    object Home:BottomBarScreen(
            route = "Home" ,
            tittle = "Home" ,
            icon =Icons.Filled.Home)
    object Login:BottomBarScreen(
            route = "Login" ,
            tittle = "Login" ,
            icon =Icons.Filled.ExitToApp)
    object Signup:BottomBarScreen(
            route = "Signup" ,
            tittle = "Signup" ,
            icon =Icons.Filled.AccountCircle)
}
//val navigationItem = listOf(
//        BottomBarScreen.Home,
//        BottomBarScreen.Login,
//        BottomBarScreen.Signup
//)