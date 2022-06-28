package com.example.coincap.ui.details

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import me.bytebeats.views.charts.line.LineChart
import me.bytebeats.views.charts.line.LineChartData
import me.bytebeats.views.charts.line.render.line.SolidLineDrawer
import me.bytebeats.views.charts.line.render.point.FilledCircularPointDrawer
import me.bytebeats.views.charts.line.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.line.render.yaxis.SimpleYAxisDrawer
import me.bytebeats.views.charts.simpleChartAnimation

@Composable
fun LineChartView() {
    LineChart(
        lineChartData = LineChartData(
            points = listOf(
                LineChartData.Point(10f, "Line 1"),
                LineChartData.Point(14f, "Line 2"),
                LineChartData.Point(30f, "Line 3")
            )
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp)
            .height(200.dp),
        animation = simpleChartAnimation(),
        pointDrawer = FilledCircularPointDrawer(color = Color.White),
        lineDrawer = SolidLineDrawer(color = Color.White),
        xAxisDrawer = SimpleXAxisDrawer(drawLabelEvery = 10),
        yAxisDrawer = SimpleYAxisDrawer(drawLabelEvery = 10),
        horizontalOffset = 5f
    )
}