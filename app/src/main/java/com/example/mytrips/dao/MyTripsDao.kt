package com.example.mytrips.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.mytrips.model.Usuario
import com.example.mytrips.model.Viagem

@Dao
interface MyTripsDao {

    @Insert
    fun salvarUsuario(usuario: Usuario): Long

    @Update
    fun atualizarUsuario(usuario: Usuario): Int

    @Delete
    fun deletarUsuario(usuario: Usuario)

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodosOsUsuarios(): List<Usuario>

    @Query("SELECT * FROM tbl_usuarios WHERE nome = :nome ORDER BY nome ASC")
    fun buscarUsuarioPeloNome(nome: String): List<Usuario>

    @Query("SELECT * FROM tbl_usuarios WHERE email = :email AND senha = :senha")
    fun buscarUsuarioLogado(email: String, senha: String): List<Usuario>

    @Query("SELECT * FROM tbl_viagens ORDER BY destino ASC")
    fun listarTodasAsViagens(): List<Viagem>

    @Insert
    fun salvarViagem(viagem: Viagem): Long

}
