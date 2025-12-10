package com.example.oway.ui.screens.auth_screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.maxLength
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.ContentType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.contentType
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.trace
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun OTPScreen() {
}

@Composable
fun OtpInput(
    modifier: Modifier = Modifier, numberCharacter: Int, shape: Shape, onDone: (String) -> Unit
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val otpState = rememberTextFieldState()
        BasicTextField(
            state = otpState,
            modifier = Modifier.semantics {
                contentType = ContentType.SmsOtpCode
            },
            inputTransformation = InputTransformation.maxLength(4),
            lineLimits = TextFieldLineLimits.SingleLine,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            decorator = {
                val otp = otpState.text.toString()
                onDone(otp)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    repeat(numberCharacter) { index ->

                        OtpCharacter(
                            shape = shape,
                            char = otp.getOrElse(index) { ' ' },
                            focus = index == otp.length
                        )

                    }
                }
            }


        )
    }
}

@Composable
fun OtpCharacter(
    modifier: Modifier = Modifier, char: Char, focus: Boolean, shape: Shape
) {

    val boxStroke by animateDpAsState(
        targetValue = if (focus) 2.5.dp else 1.5.dp
    )

    val colorStroke by animateColorAsState(
        targetValue = if (focus) Color.Green.copy(0.8f) else Color.LightGray.copy(0.8f)
    )
    Box(
        modifier = Modifier.size(50.dp).clip(shape).border(boxStroke, colorStroke, shape)
    ) {
        Text(
            text = char.toString(), fontWeight = FontWeight.SemiBold, color = Color.Black
        )
        )
    }
}


@Preview
@Composable
fun OtpPreview() {
}