package br.com.rodriguesalex.githubstars.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rodriguesalex.githubstars.GithubStarsApi
import br.com.rodriguesalex.githubstars.githubStarsApi

class MainActivity : ComponentActivity() {

    private val reposApi: GithubStarsApi = githubStarsApi()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // todo: to see how we can save these items from the platform

        val items = reposApi.fetchRepos()

        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    LazyColumn {
                        itemsIndexed(items, { _, it -> it.title }) { idx, item ->
                            CreateCard(
                                title = item.title,
                                description = item.description
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CreateCard(title: String, description: String) {
    Card(
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .wrapContentHeight()
            .padding(16.dp),
        content = {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = title, fontSize = 24.sp)
                Text(text = description, fontSize = 16.sp, color = Color.Gray,)
            }
        }
    )
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
    }
}