package com.example.coincap.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.coincap.apiservice.RemoteDataSource
import com.example.coincap.data.CoinItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val webService: RemoteDataSource,
) : ViewModel() {

    val coins: Flow<PagingData<CoinItem>> = Pager(PagingConfig(pageSize = 6)) {
        CoinSource(webService)
    }.flow.cachedIn(viewModelScope)


}
