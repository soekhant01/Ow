package com.example.oway.ui.screens.auth_screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.maxLength
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun OTPScreen() {
    OtpTextfield()
}

@Composable
fun Digit(
    number: Char, showCursor: Boolean
) {
    Box(
        Modifier.size(48.dp).border(1.5.dp, Color.Gray)
    ) {
        Text(
            text = number.toString(), fontSize = 24.sp, modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun OtpTextfield() {
    Column {
        val state = rememberTextFieldState()
        BasicTextField(
            state = state,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            lineLimits = TextFieldLineLimits.SingleLine,
            inputTransformation = InputTransformation.maxLength(6),
            decorator = { innerTextField ->
                val text = state.text
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    repeat(6) {
                        Digit(
                            number = text.getOrNull(it) ?: ' ',
                            showCursor = false
                        )
                    }
                }

            })
    }
}

@Preview
@Composable
fun OtpPreview() {
    OTPScreen()
}