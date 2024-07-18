package com.example.loginapp.ui.theme

import android.graphics.fonts.FontFamily
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapp.R

@Composable

fun loginscreen(navController: NavController)
{
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,)
    {

        Image(painter = painterResource(id = R.drawable.a), contentDescription ="login" , modifier = Modifier.size(200.dp))

        Text(text ="welcome back", fontSize = 28.sp, fontWeight = FontWeight.Bold )

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "login to your Account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email address")
        })

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {  navController.navigate("welcome_user")
            Log.i("Credential"," Email : $email Password :$password")
        }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate("sign")
        }) {
            Text(text = "Sign In")
        }

        Spacer(modifier = Modifier.height(16.dp))


    }



}