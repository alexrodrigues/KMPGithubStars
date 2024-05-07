package br.com.rodriguesalex.githubstars

class AndroidPlatform : GithubStarsApi {
    override fun fetchRepos(): List<GithubItem> = listOf(
        GithubItem(
            id = "22458259",
            title = "Alamofire",
            description = "Elegant HTTP Networking in Swift"
        ),
        GithubItem(
            id = "50447720",
            title = "swift-algorithm-club",
            description = "Algorithms and data structures in Swift, with explanations!"
        ),
        GithubItem(
            id = "32578467",
            title = "Charts",
            description = "Beautiful charts for iOS/tvOS/OSX! The Apple side of the crossplatform MPAndroidChart."
        ),
        GithubItem(
            id = "33486016",
            title = "Kingfisher",
            description = "A lightweight, pure-Swift library for downloading and caching images from the web."
        ),
        GithubItem(
            id = "20965586",
            title = "SwiftyJSON",
            description = "The better way to deal with JSON data in Swift."
        ),
        GithubItem(
            id = "74697963",
            title = "Hero",
            description =  "Elegant transition library for iOS & tvOS"
        ),
    )

}

actual fun githubStarsApi(): GithubStarsApi = AndroidPlatform()