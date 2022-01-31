package com.lucanicoletti.composemvi

import androidx.lifecycle.ViewModel
import com.lucanicoletti.composemvi.MainViewModel.MainSideEffect
import com.lucanicoletti.composemvi.MainViewModel.MainViewState
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container

class MainViewModel : ContainerHost<MainViewState, MainSideEffect>, ViewModel() {

    override val container = container<MainViewState, MainSideEffect>(MainViewState.Loading)



    sealed class MainViewState {
        object Loading : MainViewState()
    }

    sealed class MainSideEffect {

    }
}