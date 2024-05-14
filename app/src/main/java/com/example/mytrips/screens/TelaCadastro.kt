package com.example.mytrips.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mytrips.R
import com.example.mytrips.model.Usuario
import com.example.mytrips.repository.UsuarioRepository
import com.example.mytrips.ui.theme.MyTripsTheme
import kotlin.math.log

@Composable
fun TelaCadastro(controleDeNavegacao: NavHostController) {
    var usernameState = remember {
        mutableStateOf("")
    }

    var telefoneState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var checkboxState = remember {
        mutableStateOf(false)
    }

    var erroState = remember {
        mutableStateOf(false)
    }

    var mensagemErroState = remember {
        mutableStateOf("")
    }

    val ur = UsuarioRepository(LocalContext.current)

    MyTripsTheme {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                    shape = RoundedCornerShape(bottomStart = 20.dp),
                    modifier = Modifier
                        .height(40.dp)
                        .width(150.dp)
                ) {

                }
            }
            Column(
                modifier = Modifier
                    .padding(start = 18.dp, end = 18.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(0.dp))
                    Text(
                        text = "Sign Up",
                        color = Color(0xFFCF06F0),
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Black
                    )
                    Text(
                        text = "Create a new account",
                        color = Color(0xFFA09C9C),
                    )
                    Spacer(modifier = Modifier.height(26.dp))
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                ) {
                    //Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = mensagemErroState.value,
                        color = Color.Red
                    )
                    OutlinedTextField(
                        isError = erroState.value,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFCF06F0)
                        ),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.iconprofile),
                                contentDescription = "Ícone de perfil",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(20.dp)
                                    .width(20.dp)
                            )
                        },
                        shape = RoundedCornerShape(16.dp),
                        value = usernameState.value,
                        onValueChange = {
                            Log.i(
                                "USERNAME",
                                "VALOR: $it"
                            )
                            usernameState.value = it
                        },
                        label = {
                            Text(text = "Username")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        isError = erroState.value,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFCF06F0)
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.iconphone),
                                contentDescription = "Ícone de celular",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(16.dp)
                            )
                        },
                        shape = RoundedCornerShape(16.dp),
                        value = telefoneState.value,
                        onValueChange = {
                            Log.i(
                                "TELEFONE",
                                "VALOR: $it"
                            )
                            telefoneState.value = it
                        },
                        label = {
                            Text(text = "Phone")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        isError = erroState.value,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFCF06F0)
                        ),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.iconemail),
                                contentDescription = "Ícone de carta",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(18.dp)
                                    .width(20.dp)
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        shape = RoundedCornerShape(16.dp),
                        value = emailState.value,
                        onValueChange = {
                            Log.i(
                                "EMAIL",
                                "VALOR: $it"
                            )
                            emailState.value = it
                        },
                        label = {
                            Text(text = "E-mail")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        isError = erroState.value,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFCF06F0)
                        ),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.iconsenha),
                                contentDescription = "Ícone de cadeado",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(20.dp)
                            )
                        },
                        visualTransformation = PasswordVisualTransformation(),
                        shape = RoundedCornerShape(16.dp),
                        value = senhaState.value,
                        onValueChange = {
                            Log.i(
                                "SENHA",
                                "VALOR: $it"
                            )
                            senhaState.value = it
                        },
                        label = {
                            Text(text = "Password")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxState.value,
                            onCheckedChange = {
                                checkboxState.value = it
                            },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Color(0xFFCF06F0),
                                checkedColor = Color(0xFFCF06F0)
                            )
                        )
                        Text(text = "Over 18?")
                    }
                    Button(
                        onClick = {
                            if (usernameState.value != "" &&
                                telefoneState.value != "" &&
                                emailState.value != "" &&
                                senhaState.value != ""
                            ){
                                val usuario = Usuario(
                                    nome = usernameState.value,
                                    telefone = telefoneState.value,
                                    email = emailState.value,
                                    senha = senhaState.value,
                                    isMaior = checkboxState.value
                                )
                                ur.salvar(usuario)
                                mensagemErroState.value="Usuário cadastrado com sucesso!"
                                controleDeNavegacao.navigate("usuarios")
                            }else{
                                erroState.value=true
                                mensagemErroState.value="Campos obrigatórios não preenchidos!"
                            }
                        },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "CREATE ACCOUNT",
                            fontWeight = FontWeight.Black,
                            fontSize = 16.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(14.dp))
                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Already have an account?",
                        fontSize = 13.sp,
                        color = Color(0xFFA09C9C)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Sign in",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFFCF06F0),
                        modifier = Modifier.clickable {
                            controleDeNavegacao.navigate("login")
                        }
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                    shape = RoundedCornerShape(topEnd = 20.dp),
                    modifier = Modifier
                        .height(40.dp)
                        .width(150.dp)
                ) {

                }
            }
        }
    }

}