package com.example.loginapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapp.R

@Composable
fun welcome(navController: NavController)
{
    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,)
    {
        Text(text ="Choose Course ", fontSize = 28.sp, fontWeight = FontWeight.Bold )

        Spacer(modifier = Modifier.height(4.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.data), contentDescription ="data science" , modifier = Modifier.size(75.dp).clickable {
                //exposysdata.in/registration.php
            })

            Text(text ="Data Science", fontSize = 12.sp, fontWeight = FontWeight.Bold )

            Image(painter = painterResource(id = R.drawable.iot), contentDescription ="login" , modifier = Modifier.size(75.dp).clickable {
                //exposysdata.in/registration.php
            })

            Text(text ="IOT", fontSize = 12.sp, fontWeight = FontWeight.Bold )



        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.dm), contentDescription ="login" , modifier = Modifier.size(75.dp).clickable {
                //exposysdata.in/registration.php
            })

            Text(text ="Digital Marketing", fontSize = 12.sp, fontWeight = FontWeight.Bold )

            Image(painter = painterResource(id = R.drawable.cs), contentDescription ="login" , modifier = Modifier.size(75.dp).clickable {
                //exposysdata.in/registration.php
            })

            Text(text ="Cyber Security", fontSize = 12.sp, fontWeight = FontWeight.Bold )
        }




        Row(
            modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Image(painter = painterResource(id = R.drawable.full), contentDescription ="login" , modifier = Modifier.size(75.dp).clickable { //exposysdata.in/registration.php
                 })

            Text(text ="Full_Stack Developer", fontSize = 12.sp, fontWeight = FontWeight.Bold )

            Image(painter = painterResource(id = R.drawable.softwa), contentDescription ="login" , modifier = Modifier.size(75.dp).clickable { //exposysdata.in/registration.php
                 })

            Text(text ="Software_  Engineering", fontSize = 12.sp, fontWeight = FontWeight.Bold )

        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        )
          {
               Image(painter = painterResource(id = R.drawable.ux),
                   contentDescription ="UI/UX" ,
                   modifier = Modifier.size(75.dp).clickable { //exposysdata.in/registration.php
                   })

               Text(text ="UI/UX", fontSize = 12.sp, fontWeight = FontWeight.Bold )

               Image(painter = painterResource(id = R.drawable.cont),
                contentDescription ="login" ,
                modifier = Modifier.size(75.dp).clickable {
                        //exposysdata.in/registration.php
                })

                Text(text ="Content Writer", fontSize = 12.sp, fontWeight = FontWeight.Bold )
        }




          }



    }


