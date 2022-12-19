package com.example.data.di

import android.content.Context
import androidx.room.Room
import com.example.data.db.ActionDao
import com.example.data.db.ActionDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideActionDatabase(@ApplicationContext context: Context): ActionDatabase {
        return Room.databaseBuilder(
            context,
            ActionDatabase::class.java, "action_database"
        ).build()
    }

    @Provides
    fun provideActionDao(db: ActionDatabase): ActionDao {
        return db.actionDao()
    }
}
