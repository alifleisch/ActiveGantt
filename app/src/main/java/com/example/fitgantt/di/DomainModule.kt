package com.example.fitgantt.di

import com.example.domain.usecases.GetActivitiesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetActivitiesUseCase(): GetActivitiesUseCase{
        return GetActivitiesUseCase()
    }
}