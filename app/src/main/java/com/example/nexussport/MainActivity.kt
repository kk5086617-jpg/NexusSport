package com.example.nexussport

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nexussport.ui.theme.NexusSportTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NexusSportTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "О прыэт!",
        modifier = modifier
    )
    Image(
        painter = painterResource(id = R.drawable.before_after),
        contentDescription = "До после"
    )
    Icon(
        painter = painterResource(id = R.drawable.nexus_sport),
        contentDescription = "sport",
        tint = androidx.compose.ui.graphics.Color.Unspecified
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NexusSportTheme {
        Greeting("Roman")
    }
}