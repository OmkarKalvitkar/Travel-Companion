package com.codewithomkar.travel.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.codewithomkar.travel.R
import com.codewithomkar.travel.navigation.routes


@Composable
fun Splashscreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.splas),
                contentDescription = "Splashimage",
                modifier = Modifier
                    .padding(bottom = 16.dp)

                )
            Text(
                text = "Journey Beyond Boundaries",
                style = MaterialTheme.typography.subtitle1,
                color = Color.Black,
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            OutlinedButton(
                colors = ButtonDefaults.outlinedButtonColors(colorResource(id = R.color.primaryColor),
                    contentColor = colorResource(id = R.color.white)
                ),
                onClick = {navController.navigate(routes.Login.routes) },
            ) {
                Text(text = "Explore the world")
            }

        }

    }}