package com.example.coincap.ui.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.example.coincap.data.CoinItem
import com.example.coincap.navigation.Coins
import com.example.coincap.ui.theme.CoincapTheme
import com.example.coincap.ui.theme.Purple500
import kotlinx.coroutines.flow.Flow

@Composable
fun Home(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    Scaffold(
        backgroundColor = Purple500
    ) {
        CoinsList(coinsList = viewModel.coins, navController)
    }
}

@Composable
fun CoinsList(
    coinsList: Flow<PagingData<CoinItem>>,
    navController: NavController
) {
    val coinsListItems: LazyPagingItems<CoinItem> = coinsList.collectAsLazyPagingItems()

    LazyColumn(modifier = Modifier.padding(start = 8.dp, end = 8.dp)) {
        items(coinsListItems) { item ->
            item?.let {
                CoinListItem(coinData = item, onClick = {
                    navController.navigate(
                            Coins.Details(
                                item.id
                            ).route
                        )
                })
            }
        }
        coinsListItems.apply {
            when {
                loadState.refresh is LoadState.Loading -> {
                }
                loadState.append is LoadState.Loading -> {
                }
                loadState.append is LoadState.Error -> {
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    CoincapTheme {
        val navController = rememberNavController()
        Home(navController)
    }
}