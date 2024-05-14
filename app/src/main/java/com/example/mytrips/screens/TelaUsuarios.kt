package com.example.mytrips.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mytrips.repository.UsuarioRepository

@Composable
fun TelaUsuarios(controladorDeNavegacao: NavHostController) {

    val ur=UsuarioRepository(context = LocalContext.current)
    val contatos=ur.listarTodosOsUsuarios()

    Column {
        LazyColumn {
            items(contatos) {
                Card(
                ) {
                    Row {
                        Column(
                        ) {
                            Text(text = it.nome)
                            Text(text = it.email)
                            Text(text = it.senha)
                            Text(text = it.telefone)
                            Checkbox(checked = it.isMaior, onCheckedChange = {})
                        }
                    }
                }
            }
        }
    }
}