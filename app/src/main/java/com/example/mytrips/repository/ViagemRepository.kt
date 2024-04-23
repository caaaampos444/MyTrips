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
        porto.descricao="Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. Seu centro abriga as sedes imponentes do Parlamento, a famosa torre do relógio do Big Ben e a Abadia de Westminster, local de coroação dos monarcas britânicos."
        porto.dataChegada= LocalDate.of(2022,5,15)
        porto.dataPartida= LocalDate.of(2022,5,22)
        porto.imagem= null

        return listOf(londres, porto)
    }

}