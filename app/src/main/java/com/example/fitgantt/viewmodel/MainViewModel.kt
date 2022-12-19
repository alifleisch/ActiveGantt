package com.example.fitgantt.viewmodel

import androidx.lifecycle.ViewModel
import com.example.domain.usecases.GetActivitiesUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(var getActivitiesUseCase: GetActivitiesUseCase)
    :ViewModel(){

}