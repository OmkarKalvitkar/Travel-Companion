package com.codewithomkar.travellapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codewithomkar.travellapp.R

@Composable
fun SplashScreen() {
    // Ensure resources are properly accessed and not null
    val splashImage = painterResource(id = R.drawable.splash)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = splashImage,
                contentDescription = "SplashImage"
            )

            Text(
                text = "Journey Beyond Boundaries",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Button(
                onClick = {
                    // Handle button click
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary, // Background color
                    contentColor = MaterialTheme.colorScheme.onPrimary // Text color
                )
            ) {
                Text("Click Me")
            }
        }
    }
}


