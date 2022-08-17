package com.example.settingnavigation.screens

import androidx.activity.OnBackPressedCallback
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun ContactScreen( navController: NavController){

    Column {
        TopBarContact(navController = navController)
    }
}

@Composable
fun TopBarContact(navController: NavController){
    Column {
        TopAppBar(
            title = {
                Text(
                    text = "Contact",
                    fontSize = 18.sp,
                    color = Color.Blue
                )
            },
            backgroundColor = Color.Red,
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(Screen.Setting.route)
                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        )
    }
}

//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "Contact",
//            color = Color.Red,
//            fontSize = MaterialTheme.typography.h3.fontSize,
//            fontWeight = FontWeight.Bold
//        )
//    }