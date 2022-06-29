package com.example.coincap.ui.details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

@Composable
fun LinkText(url: String) {

    val mUriHandler = LocalUriHandler.current

    val mAnnotatedLinkString = buildAnnotatedString {
        val mStr = "Go to project site"
        append(mStr)
        addStyle(
            style = SpanStyle(
                fontSize = 18.sp,
                color = Color.Green,
                textDecoration = TextDecoration.Underline
            ), start = 0, end = mStr.length
        )

        addStringAnnotation(
            tag = "URL",
            annotation = url,
            start = 0,
            end = length
        )
    }

    Column(
        Modifier.wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ClickableText(
            text = mAnnotatedLinkString,
            onClick = {
                mAnnotatedLinkString
                    .getStringAnnotations("URL", it, it)
                    .firstOrNull()?.let { stringAnnotation ->
                        mUriHandler.openUri(stringAnnotation.item)
                    }
            }
        )
    }
}