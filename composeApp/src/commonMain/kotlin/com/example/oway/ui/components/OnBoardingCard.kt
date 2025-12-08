package com.example.oway.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oway.ui.screens.onboarding_screens.OnBoardingPage


@Composable
fun OnBoardingCard(
    page: OnBoardingPage
) {



    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(Modifier.height(100.dp))
        Image(
            painter = page.image,
            contentDescription = null,
            modifier = Modifier.width(350.dp).height(220.dp),
            contentScale = ContentScale.FillBounds
        )
        Spacer(Modifier.height(40.dp))

        Box(
            modifier = Modifier.width(280.dp)
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = page.title,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp
                )
                Spacer(Modifier.height(16.dp))

                Text(
                    page.description,
                    color = Color(0xFFA0A0A0),
                    textAlign = TextAlign.Center,

                )
            }
        }

    }

}
