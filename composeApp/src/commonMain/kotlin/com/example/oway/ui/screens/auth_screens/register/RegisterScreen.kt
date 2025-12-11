package com.example.oway.ui.screens.auth_screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oway.ui.components.FilledButton
import com.example.oway.ui.components.OutlineButton
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import oway.composeapp.generated.resources.Res
import oway.composeapp.generated.resources.gmail

@Composable
fun RegisterScreen() {
    RegisterCard()
}

@Composable
fun RegisterCard(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf(" ") }
    var password by remember { mutableStateOf(" ") }
    Column(
        modifier = modifier.statusBarsPadding().fillMaxSize(),

        ) {
        Text(
            modifier = Modifier.padding(start = 30.dp),
            text = "Sign up with your email",
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        )

        Spacer(modifier.height(32.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp)
        )
        Spacer(modifier.height(16.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp)

        )
        Spacer(modifier.height(24.dp))
        FilledButton(
            text = "Sign Up",
            modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp),
            color = Color(0xFF008955)
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Spacer(
                modifier = Modifier.height(3.dp).background(Color(0xFFA0A0A0)).weight(1f)
            )

            Text(
                "OR",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 3.dp, end = 3.dp)
            )

            Spacer(
                modifier = Modifier.height(3.dp).background(Color(0xFFA0A0A0)).weight(1f)
            )
        }

        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp)

        ) {
            Image(
                painterResource(Res.drawable.gmail),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = "Sign Up with Gmail"
            )
        }


        Spacer(modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "Already have an account? "
            )
            Text(
                modifier = Modifier.clickable {},
                text = "Sign in",
                color = Color(0xFF008955)
            )
        }
    }
}

@Composable
@Preview
fun RegisterCardPreview() {
    RegisterCard()
}