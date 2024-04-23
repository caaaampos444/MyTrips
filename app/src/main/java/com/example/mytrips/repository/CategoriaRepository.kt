package com.example.mytrips.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.mytrips.R
import com.example.mytrips.model.Categoria

class CategoriaRepository {

    @Composable
    fun listarTodasAsCategorias(): List<Categoria> {
        val montanha=Categoria()
        montanha.id=1
        montanha.nome="Mountain"
        montanha.habilitado=true
        montanha.imagem= painterResource(id = R.drawable.mountainvector)

        val neve=Categoria()
        neve.id=2
        neve.nome="Snow"
        neve.habilitado=false
        neve.imagem= painterResource(id = R.drawable.skivector)

        val praia=Categoria()
        praia.id=3
        praia.nome="Beach"
        praia.habilitado=false
        praia.imagem= painterResource(id = R.drawable.beachvector)

        return listOf(montanha, neve, praia)
    }

}