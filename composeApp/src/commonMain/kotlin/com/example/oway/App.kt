package com.example.oway

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.oway.ui.screens.AuthScreen
import com.example.oway.ui.theme.OwayAppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import oway.composeapp.generated.resources.Res
import oway.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    OwayAppTheme{
        Scaffold {
            AuthScreen()
        }
    }
}