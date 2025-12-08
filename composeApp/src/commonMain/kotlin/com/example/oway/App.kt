package com.example.oway

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import com.example.oway.ui.screens.auth_screens.OTPScreen
import com.example.oway.ui.screens.onboarding_screens.OnBoardingScreen
import com.example.oway.ui.theme.OwayAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    OwayAppTheme{
        Scaffold {
            OnBoardingScreen()
        }
    }
}