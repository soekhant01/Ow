package com.example.oway

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform