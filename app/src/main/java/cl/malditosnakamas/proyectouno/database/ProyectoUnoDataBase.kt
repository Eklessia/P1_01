package cl.malditosnakamas.proyectouno.database

import androidx.room.Database
import androidx.room.RoomDatabase
import cl.malditosnakamas.persistenciadedatos.personajes.data.local.database.RegistroDao
import cl.malditosnakamas.persistenciadedatos.personajes.data.local.database.RegistroEntity

@Database(entities = [RegistroEntity::class], version = 1)
abstract class ProyectoUnoDataBase : RoomDatabase() {
    abstract fun registroDao(): RegistroDao
}