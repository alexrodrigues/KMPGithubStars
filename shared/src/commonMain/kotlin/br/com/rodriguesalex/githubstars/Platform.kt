package br.com.rodriguesalex.githubstars

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform