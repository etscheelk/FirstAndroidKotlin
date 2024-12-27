package com.example.emptyactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.emptyactivity.ui.theme.EmptyActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmptyActivityTheme {
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
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(24.dp).background(Color.Red, shape = CircleShape),
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            letterSpacing = TextUnit(0.5f, TextUnitType.Em)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EmptyActivityTheme {
        Greeting("Ethan")
    }
}

/**
 * Can be named anything and it will pop up in the preview
 */
@Preview(showBackground = true, name = "bruce_wayne_test", showSystemUi = true)
@Composable
fun AnotherGreetingPreview() {
    EmptyActivityTheme {
        Greeting("Bruce Wayne")
    }
}
