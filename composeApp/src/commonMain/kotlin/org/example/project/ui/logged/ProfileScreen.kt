package org.example.project.ui.logged

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import heltrip.composeapp.generated.resources.Res
import heltrip.composeapp.generated.resources.man_avatar
import org.jetbrains.compose.resources.painterResource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(innerPadding: PaddingValues) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                windowInsets = WindowInsets(0, 0, 0, 0),
                title = {
                    Text(text = "Profile")
                },
                actions = {
                    IconButton(onClick = {
                        // isDarkMode.value = !isDarkMode.value
                    }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Toggle Dark Mode"
                        )
                    }
                })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(
                    bottom = innerPadding.calculateBottomPadding(),
                    top = padding.calculateTopPadding()
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(Res.drawable.man_avatar),
                    contentDescription = "Imagem do Perfil",
                    modifier = Modifier.size(130.dp).clip(CircleShape)
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.size(30.dp).clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    Icon(
                        modifier = Modifier.size(18.dp),
                        tint = Color.White,
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Voltar"
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Nome do usuário
            Text(
                text = "Raissa Meurer", fontSize = 20.sp, fontWeight = FontWeight.Bold
            )


            Spacer(modifier = Modifier.height(8.dp))

            // Email do usuário
            Text(
                text = "raimeurer@hotmail.com", fontSize = 14.sp, color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 36.dp), onClick = { }) {
                Text(text = "Edit Profile")
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error, contentColor = Color.White
                ), modifier = Modifier.fillMaxWidth().padding(
                    horizontal = 36.dp,
                    vertical = 20.dp
                ), onClick = { }) {
                Text(text = "Logout")
            }
        }
    }
}
