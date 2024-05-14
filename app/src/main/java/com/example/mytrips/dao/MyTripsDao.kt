package com.example.mytrips.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.mytrips.model.Usuario

@Dao
interface MyTripsDao {

    @Insert
    fun salvar(usuario: Usuario): Long

    @Update
    fun atualizar(usuario: Usuario): Int

    @Delete
    fun deletar(usuario: Usuario)

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodosOsUsuarios(): List<Usuario>

    @Query("SELECT * FROM tbl_usuarios WHERE nome = :nome ORDER BY nome ASC")
    fun buscarUsuarioPeloNome(nome: String): List<Usuario>

    @Query("SELECT * FROM tbl_usuarios WHERE email = :email AND senha = :senha")
    fun buscarUsuarioLogado(email: String, senha: String): List<Usuario>

}