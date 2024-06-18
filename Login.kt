package com.codewithomkar.travel.screen



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
//import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.codewithomkar.travel.R


@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.img5), // replace with your image resource
                contentDescription = "Login page",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(540.dp)
                    .clip(RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 45.dp))
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth()
//                    .height(30.dp)
                    .padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(4.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth()
//                    .height(30.dp)
                    .padding(bottom = 5.dp),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(4.dp))

            Button(
                colors = ButtonDefaults.outlinedButtonColors(
                    colorResource(id = R.color.primaryColor),
                    contentColor = colorResource(id = R.color.white)
                ),
                onClick = { /* Handle login click */ },
                modifier = Modifier.fillMaxWidth()
                    .height(40.dp)
            ) {
                Text("Login")
            }


            Spacer(modifier = Modifier.height(1.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, bottom = 16.dp),
//                .background(Color.LightGray),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "New User ? ",
                    color = Color.Blue,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(end = 4.dp) // Adjust padding here
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward),
                    contentDescription = "Right Arrow",
                    tint = Color.Blue, // Tint the icon to match the text color
                    modifier = Modifier.size(24.dp) // Adjust the size of the icon
                )

            }
        }
    }
}