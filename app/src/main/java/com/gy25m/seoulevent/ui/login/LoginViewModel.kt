package com.gy25m.seoulevent.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gy25m.seoulevent.model.User
import com.gy25m.seoulevent.usecase.LoginUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val loginUsecase: LoginUsecase) : ViewModel() {

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
        //loginUsecase.saveData()
    }


}