package com.gy25m.lastdance.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gy25m.lastdance.model.User
import com.gy25m.lastdance.usecase.LoginUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val loginUsecase: LoginUsecase) : ViewModel() {

    var content: MutableLiveData<List<User>> = MutableLiveData(listOf())


    fun btnClick() {
        var cc = loginUsecase.useCaseGetApi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                content.value = it
            }, {})

    }

    fun saveData() {
        loginUsecase.saveData()
    }


}