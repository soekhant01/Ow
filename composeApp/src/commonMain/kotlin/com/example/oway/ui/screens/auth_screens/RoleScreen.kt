package com.example.oway.ui.screens.auth_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oway.ui.components.FilledButton
import com.example.oway.ui.components.OutlineButton
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import oway.composeapp.generated.resources.Res
import oway.composeapp.generated.resources.welcome

@Composable
fun RoleScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(Res.drawable.welcome),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp, top = 48.dp, end = 16.dp, bottom = 16.dp),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                Modifier.height(8.dp)
            )
            Text(
                text = "Have a better sharing experience",
                color = Color(0xFFA0A0A0)
            )
        }

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            FilledButton(text = "Create an account", modifier = Modifier,
                color = Color(0xFF008955))

            Spacer(Modifier.height(8.dp))

            OutlineButton(text = "Sign in")

        }

    }
}

@Composable
@Preview
fun AuthScreenPreview() {
    RoleScreen()
}