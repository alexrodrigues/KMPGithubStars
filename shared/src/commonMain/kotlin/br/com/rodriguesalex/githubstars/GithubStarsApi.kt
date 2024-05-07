package br.com.rodriguesalex.githubstars

interface GithubStarsApi {
    fun fetchRepos(): List<GithubItem>
}

expect fun githubStarsApi(): GithubStarsApi