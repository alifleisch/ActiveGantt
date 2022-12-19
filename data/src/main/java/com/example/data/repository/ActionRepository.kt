package com.example.data.repository

import com.example.data.db.ActionDao
import com.example.domain.models.Action
import javax.inject.Inject

class ActionRepository @Inject constructor(
    val actionDao: ActionDao
){
    suspend fun addAction(action : Action){
        actionDao.insertAction(action)
    }

}
