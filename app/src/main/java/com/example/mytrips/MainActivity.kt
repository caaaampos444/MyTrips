package com.example.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaLogin()
                    TelaCadastro()
                }
            }
        }
    }
}

@Composable
fun TelaLogin() {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
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
                shape = RoundedCornerShape(16.dp),
                value = "teste@email.com",
                label = {
                        Text(text = "E-mail")
                },
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
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
                value = "*************",
                label = {
                    Text(text = "Password")
                },
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ){
                Button(
                    onClick = { /*TODO*/ },
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
                    fontWeight = FontWeight.Bold
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

@Composable
fun TelaCadastro() {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ){
        Row (
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
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
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
                OutlinedTextField(
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
                    value = "Susanna Hoffs",
                    label = {
                        Text(text = "Username")
                    },
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFCF06F0),
                        unfocusedBorderColor = Color(0xFFCF06F0)
                    ),
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
                    value = "99999-0987",
                    label = {
                        Text(text = "Phone")
                    },
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                )
                OutlinedTextField(
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
                    shape = RoundedCornerShape(16.dp),
                    value = "susanna@email.com",
                    label = {
                        Text(text = "E-mail")
                    },
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                )
                OutlinedTextField(
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
                    shape = RoundedCornerShape(16.dp),
                    value = "*************",
                    label = {
                        Text(text = "Password")
                    },
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        colors = CheckboxDefaults.colors(
                            uncheckedColor = Color(0xFFCF06F0),
                            checkedColor = Color(0xFFCF06F0)
                        )
                    )
                    Text(text = "Over 18?")
                }
                Button(
                    onClick = { /*TODO*/ },
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
                    color = Color(0xFFCF06F0)
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    MyTripsTheme {
        TelaLogin()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    MyTripsTheme {
        TelaCadastro()
    }
}