package com.example.coincap.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coincap.apiservice.RemoteDataSource
import com.example.coincap.apiservice.ResponseApi
import com.example.coincap.data.details.CoinDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import timber.log.Timber

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val webService: RemoteDataSource,
) : ViewModel() {

    private val _coinDetails: MutableLiveData<CoinDetails> = MutableLiveData()
    val coinDetails: LiveData<CoinDetails> = _coinDetails

    suspend fun loadCoinDetails(id: String) {
        when (val coinDetails = webService.getCoinDetails(id)) {
            is ResponseApi.Success ->
                _coinDetails.postValue(coinDetails.item)
            else -> {}
        }
    }

}
