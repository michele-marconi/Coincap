package com.example.coincap.apiservice


sealed class ResponseApi<out T> {
    data class Success<T>(val item: T) : ResponseApi<T>()
    data class Error(val errorResponse: String) : ResponseApi<Nothing>()
    object Unauthorized : ResponseApi<Nothing>()
}
