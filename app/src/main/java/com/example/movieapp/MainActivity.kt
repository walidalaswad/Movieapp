package com.example.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieapp.ui.theme.MovieappTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import com.example.movieapp.navigation.MovieNavigation
import com.example.movieapp.screens.home.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background)
                {
                    MovieNavigation()
                }
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit){


    MovieappTheme() {
        content()
    }

}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        HomeScreen()
    }
}

