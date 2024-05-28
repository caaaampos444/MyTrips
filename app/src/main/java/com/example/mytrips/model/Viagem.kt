package com.example.mytrips.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_viagens")
data class Viagem(
    @PrimaryKey(autoGenerate = true) var id:Int=0,
    var destino:String="",
    var descricao:String="",
    @ColumnInfo(name = "data_chegada") var dataChegada: String = "",
    @ColumnInfo(name = "data_partida") var dataPartida: String = ""
)
