package com.example.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.domain.models.Action

@Dao
interface ActionDao {

    @Insert
    suspend fun insertAction(action: Action)

    @Query("SELECT * FROM action_table")
    fun getAllActions(): List<Action>

/**
    @Query("SELECT * FROM action_table WHERE name = name")
    fun getAllActionsForName(name: String): List<Action>
   */

    @Update
    suspend fun updateAction(action: Action)

    @Delete
    suspend fun deleteAction(action: Action)
}