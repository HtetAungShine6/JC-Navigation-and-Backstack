package com.example.settingnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.settingnavigation.ui.theme.BackgroundColor
import com.example.settingnavigation.ui.theme.SettingNavigationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = BackgroundColor,
                    modifier = Modifier.fillMaxSize()
                ) {
//                    ToolbarApp()
//                    SettingScreen()
                    navController = rememberNavController()
                    SetupNavGraph(navController = navController)
                }
            }
        }
    }
}