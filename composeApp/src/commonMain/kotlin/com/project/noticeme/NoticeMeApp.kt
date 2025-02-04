package com.project.noticeme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.project.noticeme.di.AppDI
import org.kodein.di.compose.localDI
import org.kodein.di.compose.withDI
import org.kodein.di.instance

@Composable
fun NoticeMeApp() {
    withDI(AppDI.di) {
        val splashViewModel: SplashViewModel by localDI().instance()
        var isSplashFinished by remember { mutableStateOf(false) }

        LaunchedEffect(Unit) {
            splashViewModel.isSplashFinished.collect { isFinished ->
                isSplashFinished = isFinished
            }
        }

        if (isSplashFinished) {
            MainScreen()
        } else {
            SplashScreen { isSplashFinished = true }
        }
    }
}