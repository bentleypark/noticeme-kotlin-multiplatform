package com.project.noticeme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform