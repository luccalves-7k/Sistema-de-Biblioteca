package com.example.sistemadebiblioteca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Biblioteca()
        }
    }
}

@Composable
fun Biblioteca() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "📚",
            fontSize = 50.sp
        )

        Text(
            text = "Sistema de Biblioteca",
            fontSize = 26.sp
        )

        Text(
            text = "Encontre e registre seus livros",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Nome do aluno")
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Livro")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {}
        ) {
            Text("Registrar empréstimo")
        }

        Spacer(modifier = Modifier.height(25.dp))

        Card {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = "📖 Livro em destaque",
                    fontSize = 18.sp
                )

                Text(
                    text = "Noites Brancas"
                )

                Text(
                    text = "Indisponivel"
                )
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = false,
                onCheckedChange = {}
            )

            Text(
                text = "Receber notificações"
            )
        }
    }
}