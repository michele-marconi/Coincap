package com.example.coincap.ui.details

import android.graphics.PointF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.coincap.data.history.PricesHistory

@Composable
fun LineChart(coinHistory: PricesHistory?) {
    val history = mutableListOf<Double>()

    coinHistory?.prices?.forEach { record ->
        history.add(record[1])
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(360.dp)
            .padding(16.dp),
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .wrapContentSize(align = Alignment.BottomStart)
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                val distance = size.width / (history.size + 1)
                var currentX = 0F
                val maxValue = history.maxOrNull() ?: 0
                val points = mutableListOf<PointF>()

                history.forEachIndexed { index, data ->
                    if (history.size >= index + 2) {
                        val y0 = (maxValue.toDouble() - data) * (size.height / maxValue.toDouble())
                        val x0 = currentX + distance
                        points.add(PointF(x0, y0.toFloat()))
                        currentX += distance
                    }
                }

                for (i in 0 until points.size - 1) {
                    drawLine(
                        start = Offset(points[i].x, points[i].y),
                        end = Offset(points[i + 1].x, points[i + 1].y),
                        color = Color.Cyan,
                        strokeWidth = 4f
                    )
                }
            }
        }
    }
}