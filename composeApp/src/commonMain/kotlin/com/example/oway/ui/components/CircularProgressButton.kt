package com.example.oway.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.sp

@Composable
fun CircularProgressButton(
    isLast: Boolean,
    progress: Float,
    onClick: () -> Unit,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    Box(
        modifier = Modifier.size(90.dp)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = { onClick() }),
        contentAlignment = Alignment.Center
    ) {
//        outer progress ring
        CircularProgressIndicator(
            progress = { progress },
            modifier = Modifier.fillMaxSize(),
            strokeWidth = 6.dp,
            color = Color(0xFF0CAF60)
        )

//        inner progress circle
        Box(
            modifier = Modifier.size(70.dp).background(Color.White, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            if (isLast)
                Text("Go", fontSize = 20.sp, color = Color.Black)
            else
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.size(30.dp)
                )

        }


    }


}