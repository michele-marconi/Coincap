package com.example.coincap.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coincap.apiservice.RemoteDataSource
import com.example.coincap.apiservice.ResponseApi
import com.example.coincap.data.details.CoinDetails
import com.example.coincap.data.history.PricesHistory
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val webService: RemoteDataSource,
) : ViewModel() {

    private val _coinDetails: MutableLiveData<CoinDetails> = MutableLiveData()
    val coinDetails: LiveData<CoinDetails> = _coinDetails
    private val _coinHistory: MutableLiveData<PricesHistory> = MutableLiveData()
    val coinHistory: LiveData<PricesHistory> = _coinHistory

    fun loadCoinDetails(id: String) = viewModelScope.launch(
        Dispatchers.IO
    ) {
        when (val coinDetails = webService.getCoinDetails(id)) {
            is ResponseApi.Success ->
                _coinDetails.postValue(coinDetails.item)
            else -> {}
        }
    }

    fun loadChartHistory(id: String, vs_currency: String, from: String, to: String) =
        viewModelScope.launch(
            Dispatchers.IO
        ) {
            when (val coinHistory = webService.getCoinHistory(id, vs_currency, from, to)) {
                is ResponseApi.Success ->
                    _coinHistory.postValue(coinHistory.item)
                else -> {}
            }
        }


}
