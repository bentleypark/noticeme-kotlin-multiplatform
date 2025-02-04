package com.project.noticeme.di

import org.kodein.di.DI
import org.kodein.di.DIAware

object AppDI : DIAware {
    override val di = DI {
        import(appModule)
    }
}