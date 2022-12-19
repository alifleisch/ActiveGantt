package com.example.domain.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate


@Entity(tableName = "action_table")
data class Action(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "content")
    var content: String? = "",

    @ColumnInfo(name = "state")
    var state: ActionState = ActionState.TODO,

    @ColumnInfo(name = "date")
    var date: LocalDate,

    )


enum class ActionState {
    DONE,
    UNREACHED,
    NOT_DONE,
    TODO
}