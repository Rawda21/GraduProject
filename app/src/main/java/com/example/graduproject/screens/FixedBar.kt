package com.example.graduproject.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.graduproject.ui.BottomNavGragh
import com.google.android.material.bottomnavigation.BottomNavigationView


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopScreen(){
    val navController = rememberNavController()
//    Scaffold (
//            bottomBar = {BottomBar(navController = navController)}
//    ) {
//        BottomNavGragh(navController = navController)
//    }
}

//@Composable
//fun RowScope.AddItem(screen:BottomBarScreen ,
//                     currentDestination: NavDestination?,
//                     navController: NavHostController) {
//    BottomNavigationView(
//            lable = {
//                Text(text = screen.tittle)
//            },
//            icon ={
//                Icon(imageVector = screen.icon,
//                     contentDescription = "Navigation icon")
//            },
//            selected= currentDestination?.hierarchy?.any() {
//                it.route == screen.route
//            }== true ,
//            onClick ={
//                navController.navigate(screen.route)
//            }
//    )
//}

private fun RowScope.BottomNavigationView(
    lable: () -> Unit,
    icon: () -> Unit,
    selected: Boolean,
    onClick: () -> Unit,
) {
    TODO("Not yet implemented")
}

