package com.example.mytrips.repository

import android.content.Context
import androidx.compose.runtime.Composable
import com.example.mytrips.dao.MyTripsDb
import com.example.mytrips.model.Viagem

class ViagemRepository(context: Context) {

    private val db = MyTripsDb.getBancoDeDados(context).myTripsDao()

    fun salvar(viagem: Viagem): Long{
        return db.salvarViagem(viagem)
    }

    @Composable
    fun listarTodasAsViagens(): List<Viagem>{
        return db.listarTodasAsViagens()
    }

}
