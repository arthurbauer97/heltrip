package org.example.project.ui.unlogged

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import heltrip.composeapp.generated.resources.Res
import heltrip.composeapp.generated.resources.img_helptrip_login
import heltrip.composeapp.generated.resources.olhoaberto
import heltrip.composeapp.generated.resources.olhofechado
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginScreen(
    onLogin: () -> Unit
) {
    var showPassword by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Scaffold {
        Column(
            Modifier
                .padding(horizontal = 20.dp)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .height(300.dp),
                painter = painterResource(Res.drawable.img_helptrip_login),
                contentDescription = "Descrição da imagem"
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = email,
                singleLine = true,
                label = {
                    Text("Email")
                },
                onValueChange = { email = it }
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                label = {
                    Text("Senha")
                },
                singleLine = true,
                trailingIcon = {
                    IconButton(
                        onClick = { showPassword = !showPassword },
                        content = {
                            Icon(
                                modifier = Modifier
                                    .size(20.dp),
                                painter = if (showPassword) painterResource(Res.drawable.olhoaberto)
                                else painterResource(Res.drawable.olhofechado),
                                contentDescription = null
                            )
                        }
                    )
                },
                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                value = password, onValueChange = { password = it })

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                onClick = {
                    onLogin()
                }) {
                Text("Entrar")
            }
            Text("ou")
            ElevatedButton(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                onClick = {
                   TODO()
                }) {
                Text("Criar conta")
            }
        }
    }
}