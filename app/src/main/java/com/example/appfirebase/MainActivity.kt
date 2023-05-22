package com.example.appfirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appfirebase.ui.theme.AppFirebaseTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFirebaseTheme {
                App()
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun App() {
    val Nome = remember { mutableStateOf("") }
    val Endereco = remember { mutableStateOf("") }
    val Bairro = remember { mutableStateOf("") }
    val Cep = remember { mutableStateOf("") }
    val Cidade = remember { mutableStateOf("") }
    val Estado = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = Nome.value,
            onValueChange = { Nome.value = it },
            label = { Text("Nome") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = Endereco.value,
            onValueChange = { Endereco.value = it },
            label = { Text("Endereço") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = Bairro.value,
            onValueChange = { Bairro.value = it },
            label = { Text("Bairro") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = Cep.value,
            onValueChange = { Cep.value = it },
            label = { Text("CEP") },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = Cidade.value,
            onValueChange = { Cidade.value = it },
            label = { Text("Cidade") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = Estado.value,
            onValueChange = { Estado.value = it },
            label = { Text("Estado") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {

            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Cadastrar")
        }
    }
}