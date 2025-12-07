package com.example.oway.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.oway.ui.screens.onboarding_screens.OnBoardingPage

@Composable
fun OnBoardingCard(
    page: OnBoardingPage
) {

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = page.image,
            contentDescription = null,
        )
        Spacer(Modifier.height(32.dp))
        Text(
            text = page.title
        )
        Spacer(Modifier.height(16.dp))

        Text(
            page.description
        )

    }

}
