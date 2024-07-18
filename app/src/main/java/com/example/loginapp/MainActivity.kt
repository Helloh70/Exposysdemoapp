package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.ui.theme.LoginappTheme
import com.example.loginapp.ui.theme.loginscreen
import com.example.loginapp.ui.theme.signup
import com.example.loginapp.ui.theme.welcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                 val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "Login_screen", builder = {
                composable("Login_screen",){
                        loginscreen(navController)
                }
                composable("sign",){
                    signup(navController)
                }
                composable("welcome_user",){
                    welcome(navController)
                }
            })


        }
    }
}

