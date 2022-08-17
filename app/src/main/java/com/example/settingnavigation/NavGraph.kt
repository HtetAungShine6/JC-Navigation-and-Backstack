package com.example.settingnavigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.settingnavigation.screens.ContactScreen
import com.example.settingnavigation.screens.FeedbackScreen
import com.example.settingnavigation.screens.Screen
import com.example.settingnavigation.screens.SettingScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Setting.route
    ){
        composable(
            route = Screen.Setting.route
        ){
            SettingScreen( navController = navController )
        }
        composable(
            route = Screen.Contact.route
        ){
            ContactScreen(navController = navController)
        }
        composable(
            route = Screen.Feedback.route
        ){
            FeedbackScreen(navController = navController)
        }
    }
}