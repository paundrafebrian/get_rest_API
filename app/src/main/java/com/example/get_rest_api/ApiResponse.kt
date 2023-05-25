package com.example.getrestapi

import com.google.gson.annotations.SerializedName

class ApiResponse (
    @SerializedName("status") val status: String,
    @SerializedName("data") val data: List<Mahasiswa>

    )

data class Mahasiswa (
    @SerializedName("NIM") val nim: String,
    @SerializedName("Nama") val nama: String,
    @SerializedName("Telepon") val telepon: String

    )