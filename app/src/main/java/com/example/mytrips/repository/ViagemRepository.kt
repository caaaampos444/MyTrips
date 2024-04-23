package com.example.mytrips.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.mytrips.R
import com.example.mytrips.model.Viagem
import java.time.LocalDate

class ViagemRepository {

    @Composable
    fun listarTodasAsViagens(): List<Viagem>{
        val londres=Viagem()
        londres.id=1
        londres.destino="Londres"
        londres.descricao="Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. Seu centro abriga as sedes imponentes do Parlamento, a famosa torre do relógio do Big Ben e a Abadia de Westminster, local de coroação dos monarcas britânicos."
        londres.dataChegada= LocalDate.of(2019,2, 18)
        londres.dataPartida= LocalDate.of(2019,2,21)
        londres.imagem= painterResource(id = R.drawable.backgroundlondon)

        val porto=Viagem()
        porto.id=2
        porto.destino="Porto"
        porto.descricao="O Porto é uma cidade portuguesa e capital da sub-região da Área Metropolitana do Porto e da região do Norte, pertencendo ao distrito do Porto."
        porto.dataChegada= LocalDate.of(2022,5,15)
        porto.dataPartida= LocalDate.of(2022,5,22)
        porto.imagem= painterResource(id = R.drawable.backgroundporto)

        val miranteDoParanapanema=Viagem()
        miranteDoParanapanema.id=3
        miranteDoParanapanema.destino="Mirante do Paranapanema"
        miranteDoParanapanema.descricao="Mirante do Paranapanema é um município brasileiro localizado no Oeste Paulista. Também conhecido como Pontal do Paranapanema, Mirante fica nas imediações da divisa do estado de São Paulo com o Paraná e tem sua vasta área rodeada de Assentamentos."
        miranteDoParanapanema.dataChegada= LocalDate.of(2021,11,29)
        miranteDoParanapanema.dataPartida= LocalDate.of(2021,12,4)
        miranteDoParanapanema.imagem= painterResource(id = R.drawable.mirantebackground)

        return listOf(londres, porto, miranteDoParanapanema)
    }

}