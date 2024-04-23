package com.example.mytrips.model

import androidx.compose.ui.graphics.painter.Painter

data class Categoria(
    var id:Int=0,
    var nome:String="",
    var imagem: Painter?=null,
    var habilitado: Boolean=false
)
