package com.example.settingnavigation.screens

sealed class Screen(val route: String){
    object Setting: Screen(route = "setting_screen")
    object Contact: Screen(route = "contact_screen")
    object Feedback: Screen(route = "feedback_screen")
}