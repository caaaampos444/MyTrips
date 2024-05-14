package com.example.mytrips.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mytrips.model.Usuario

@Database(entities = [Usuario::class], version = 1)
abstract class MyTripsDb : RoomDatabase() {

    abstract fun myTripsDao(): MyTripsDao

    companion object {
        private lateinit var instancia: MyTripsDb

        fun getBancoDeDados(context: Context): MyTripsDb {
            instancia = Room
                .databaseBuilder(
                    context,
                    MyTripsDb::class.java,
                    "db_mytrips"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }
}