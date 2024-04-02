package com.example.mytrips.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mytrips.R
import com.example.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {

    var emailState = remember{
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var erroState = remember {
        mutableStateOf(false)
    }

    var mensagemErroState = remember {
        mutableStateOf("")
    }

    MyTripsTheme {
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ){
            Row (
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                    shape = RoundedCornerShape(bottomStart = 20.dp),
                    modifier = Modifier
                        .height(40.dp)
                        .width(150.dp)

                ) {

                }
            }
            Column (
                modifier = Modifier
                    .padding(18.dp)
            ){
                Text(
                    color = Color(0xFFCF06F0),
                    text = "Login",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    color = Color(0xFFA09C9C),
                    fontSize = 14.sp,
                    text = "Please sign in to continue"
                )
                Spacer(modifier = Modifier.height(88.dp))
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
                                .height(20.dp)
                                .width(24.dp)
                        )
                    },
                    label = {
                        Text(text = "E-mail")
                    },
                    shape = RoundedCornerShape(16.dp),
                    value = emailState.value,
                    onValueChange = {
                        Log.i(
                            "EMAIL",
                            "VALOR: $it"
                        )
                        emailState.value=it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(24.dp))
                OutlinedTextField(
                    isError = erroState.value,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFCF06F0),
                        unfocusedBorderColor = Color(0xFFCF06F0)
                    ),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.iconsenha),
                            contentDescription = "Ícone de carta",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .height(24.dp)
                                .width(20.dp)
                        )
                    },
                    shape = RoundedCornerShape(16.dp),
                    value = senhaState.value,
                    label = {
                        Text(text = "Password")
                    },
                    onValueChange = {
                        Log.i(
                            "SENHA",
                            "VALOR: $it"
                        )
                        senhaState.value=it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = mensagemErroState.value,
                    color = Color.Red,
                    modifier = Modifier.padding(start = 4.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Row (
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Button(
                        onClick = {
                                  if (emailState.value=="admin"&&senhaState.value=="admin"){
                                      controleDeNavegacao.navigate("home")
                                  }else{
                                      erroState.value=true
                                      mensagemErroState.value="Usuário ou senha incorretos!"
                                  }
                        },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                        modifier = Modifier
                            .height(50.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "SIGN IN",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.iconseta),
                                contentDescription = "Seta apontando para a direita",
                                contentScale = ContentScale.FillWidth,
                                alignment = Alignment.Center,
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(16.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row (
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "Don't have an account?",
                        color = Color(0xFFA09C9C),
                        fontSize = 14.sp,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Sign up",
                        color = Color(0xFFCF06F0),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {
                            controleDeNavegacao.navigate("cadastro")
                        }
                    )
                }
            }
            Row (
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