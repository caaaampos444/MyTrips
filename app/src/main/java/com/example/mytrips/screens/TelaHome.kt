package com.example.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mytrips.R
import com.example.mytrips.repository.ViagemRepository
import com.example.mytrips.ui.theme.MyTripsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaHome(controleDeNavegacao: NavHostController) {

    val viagens = ViagemRepository().listarTodasAsViagens()

    var pesquisaState = remember {
        mutableStateOf("")
    }

    MyTripsTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF6F6F6))
        ) {
            Surface(
                modifier = Modifier
                    .height(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column (
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(16.dp)
                ){
                    Column (
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Card(
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.profilefoto),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(60.dp)
                                    .width(60.dp)
                            )
                        }
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White
                        )
                    }
                    Column(

                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.locationvector),
                                contentDescription = "",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .height(16.dp)
                                    .width(16.dp)
                            )
                            Text(
                                text = "You're in Paris",
                                color = Color.White
                            )
                        }
                        Text(
                            text = "MyTrips",
                            color = Color.White,
                            fontWeight = FontWeight.Black,
                            fontSize = 30.sp
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(top = 14.dp, start = 20.dp, end = 20.dp, bottom = 14.dp)
            ) {
                Text(text = "Categories")
                Spacer(modifier = Modifier.height(8.dp))
                LazyRow{
                    items(3){
                        Card(
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                            modifier = Modifier
                                .height(80.dp)
                                .width(120.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mountainvector),
                                    contentDescription = "",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .height(40.dp)
                                        .width(60.dp)
                                )
                                Text(
                                    text = "Mountain",
                                    color = Color.White
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Card(
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFEAABF4)),
                            modifier = Modifier
                                .height(80.dp)
                                .width(120.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.skivector),
                                    contentDescription = "",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .height(40.dp)
                                        .width(60.dp)
                                )
                                Text(
                                    text = "Snow",
                                    color = Color.White
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Card(
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFEAABF4)),
                            modifier = Modifier
                                .height(80.dp)
                                .width(120.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.beachvector),
                                    contentDescription = "",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .height(40.dp)
                                        .width(60.dp)
                                )
                                Text(
                                    text = "Beach",
                                    color = Color.White
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = pesquisaState.value,
                    colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                    onValueChange = {
                        pesquisaState.value=it
                    },
                    placeholder = { Text(text = "Search your destiny") },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.lupavector),
                            contentDescription = "",
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        )
                    },
                    shape = RoundedCornerShape(size = 18.dp),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Past Trips")
                Spacer(modifier = Modifier.height(10.dp))
                LazyColumn {
                    items(viagens){
                        Card(
                            elevation = CardDefaults.cardElevation(6.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(4.dp)
                            ) {
                                Image(
                                    painter = if(it.imagem=null) painterResource(id = R.drawable.noimage) else it.imagem!!,
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .height(100.dp)
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "${it.destino}",
                                    color = Color(0xFFCF06F0)
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "${it.desricao}",
                                    color = Color(0xFFA09C9C),
                                    fontSize = 10.sp
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Row(
                                    horizontalArrangement = Arrangement.End,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "18 Feb - 21 Feb",
                                        color = Color(0xFFCF06F0),
                                        fontSize = 10.sp
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(14.dp))
                    }
                }
            }
        }
    }
}