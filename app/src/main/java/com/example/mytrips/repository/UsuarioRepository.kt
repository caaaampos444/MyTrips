package com.example.mytrips.repository

import android.content.Context
import com.example.mytrips.dao.MyTripsDb
import com.example.mytrips.model.Usuario

class UsuarioRepository(context: Context) {

    private val db = MyTripsDb.getBancoDeDados(context).myTripsDao()

    fun salvar(usuario: Usuario): Long{
        return db.salvar(usuario)
    }

    fun listarTodosOsUsuarios():List<Usuario>{
        return db.listarTodosOsUsuarios()
    }

//    fun buscarUsuarioLogado(email: String, senha: String): String{
//        return db.buscarUsuarioLogado(email, senha)
//    }

}