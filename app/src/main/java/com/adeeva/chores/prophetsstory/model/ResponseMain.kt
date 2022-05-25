package com.adeeva.chores.prophetsstory.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseMain(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("thn_kelahiran")
    val thn_kelahiran: String? = null,

    @field:SerializedName("usia")
    val usia: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("tmp")
    val tmp: String? = null,

    @field:SerializedName("image_url")
    val image_url: String? = null,

    @field:SerializedName("icon_url")
    val icon_url: String? = null,

) : Parcelable

