package com.example.graduproject.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.graduproject.screens.BottomBarScreen
import com.example.graduproject.screens.HomeScreen
import com.example.graduproject.screens.LoginScreen
import com.example.graduproject.screens.SignupScreen

@Composable
fun BottomNavGragh(navController: NavHostController){
    NavHost(navController = navController,
            startDestination =BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Login.route){
            LoginScreen()
        }
        composable(route = BottomBarScreen.Signup.route){
            SignupScreen()
        }
    }
}