package com.adeeva.chores.prophetsstory.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adeeva.chores.prophetsstory.model.ResponseMain
import com.adeeva.chores.prophetsstory.network.RepositoryMain

class ViewModelMain: ViewModel() {

    val repository = RepositoryMain()

    val responGetData = MutableLiveData<List<ResponseMain>>()
    var isError = MutableLiveData<Throwable>()
    var isLoading = MutableLiveData<Boolean>()

    fun getDataView(){
        isLoading.value = true

        repository.getData({
            isLoading.value = false
            responGetData.value = it
        },{
            isLoading.value = false
            isError.value = it
        })
    }

}