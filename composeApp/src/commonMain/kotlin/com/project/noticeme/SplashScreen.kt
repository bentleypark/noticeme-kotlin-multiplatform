package com.project.noticeme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.bentleypark.compose_statusbar.ConfigureStatusBar
import kotlinx.coroutines.delay
import noticeme.composeapp.generated.resources.Res
import noticeme.composeapp.generated.resources.splash_logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun SplashScreen(onSplashComplete: () -> Unit) {
    ConfigureStatusBar(color = GreenOrange)

    LaunchedEffect(Unit) {
        delay(2000) // 2초 후 이동
        onSplashComplete()
    }

    Box(
        Modifier
            .fillMaxSize()
            .background(GreenOrange),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(Res.drawable.splash_logo),
            contentDescription = null,
            modifier = Modifier.wrapContentSize()
        )
    }
}