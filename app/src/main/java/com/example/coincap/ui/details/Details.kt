package com.example.coincap.ui.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.distinctUntilChanged
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.coincap.R
import com.example.coincap.ui.home.CoinSource
import com.example.coincap.ui.theme.CoincapTheme
import com.example.coincap.ui.theme.Purple500
import com.example.coincap.utils.SEVEN_DAYS_TO_MILLISEC
import com.skydoves.landscapist.glide.GlideImage
import kotlinx.coroutines.launch


@Composable
fun Details(
    navController: NavController,
    id: String,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    Scaffold(
        backgroundColor = Purple500
    ) {
        Detail(id, viewModel)
    }
}

@Composable
fun Detail(id: String, viewModel: DetailsViewModel) {
    val scope = rememberCoroutineScope()
    val item by viewModel.coinDetails.distinctUntilChanged().observeAsState()
    val coinHistory by viewModel.coinHistory.distinctUntilChanged().observeAsState()

    LaunchedEffect(Unit) {
        viewModel.loadCoinDetails(id)
        viewModel.loadChartHistory(
            id = id,
            vs_currency = CoinSource.VS_CURRENCY,
            from = (System.currentTimeMillis() / 1000 - SEVEN_DAYS_TO_MILLISEC).toString(),
            to = (System.currentTimeMillis() / 1000).toString()
        )
    }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(
            modifier = Modifier.size(60.dp),
            contentScale = ContentScale.FillBounds,
            imageModel = item?.image?.large,
            placeHolder = painterResource(R.drawable.ic_launcher_foreground),
            error = painterResource(R.drawable.ic_launcher_background)
        )

        Text(
            text = item?.name ?: "",
            style = MaterialTheme.typography.h4,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier.padding(16.dp),
            text = item?.description?.en ?: "",
            overflow = TextOverflow.Ellipsis,
            maxLines = 10
        )

        LinkText(url = item?.links?.homepage?.first() ?: "")
        LineChart(coinHistory)

    }
}


@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    CoincapTheme {
        val navController = rememberNavController()
        Details(navController, "1")
    }
}