package com.adeeva.chores.prophetsstory.network

import com.adeeva.chores.prophetsstory.model.ResponseMain
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ServiceApi {

    @GET ("api/kisahnabi")
    fun getData(): Flowable<List<ResponseMain>>

}