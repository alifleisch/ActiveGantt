package com.example.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.domain.models.Action


@Database(entities = [Action::class], version = 1)
abstract class ActionDatabase : RoomDatabase() {
    abstract fun actionDao(): ActionDao
}