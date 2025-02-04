package com.project.noticeme.di

import com.project.noticeme.SplashViewModel
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

val appModule = DI.Module("appModule") {
    bind<SplashViewModel>() with singleton { SplashViewModel() }
}