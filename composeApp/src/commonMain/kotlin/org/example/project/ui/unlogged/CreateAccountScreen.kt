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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import heltrip.composeapp.generated.resources.Res
import heltrip.composeapp.generated.resources.img_heltrip_create_account
import org.jetbrains.compose.resources.painterResource

@Composable
fun CreateAccountScreen() {
    Scaffold {
        IconButton(
            onClick = {
                TODO()
            }
        ) {
            Icon(
                modifier = Modifier
                    .size(32.dp),
                tint = MaterialTheme.colorScheme.primary,
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Voltar"
            )
        }
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.height(200.dp),
                painter = painterResource(Res.drawable.img_heltrip_create_account),
                contentDescription = "Descrição da imagem"
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                singleLine = true,
                label = {
                    Text("Apelido")
                },
                onValueChange = { })

            Spacer(modifier = Modifier.height(18.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                singleLine = true,
                label = {
                    Text("Email")
                },
                onValueChange = { })

            Spacer(modifier = Modifier.height(18.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                singleLine = true,
                label = {
                    Text("Senha")
                },
                onValueChange = { })

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                onClick = {}) {
                Text("Cadastrar")
            }
        }
    }

}