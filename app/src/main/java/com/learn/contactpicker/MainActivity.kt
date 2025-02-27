package com.learn.contactpicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learn.contactpicker.ui.theme.ContactPickerTheme
import com.learn.copick.CoPick

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactPickerTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(
                            top = innerPadding.calculateTopPadding()
                        )

                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    name: String,
    millis: Long = CoPick.instance.getCurrentTimeMillis()
) {
    Column(modifier = modifier) {
        Text(
            text = "Hello $name!"
        )
        Text(
            "Today is ${CoPick.instance.convertMillisToDateTime(millis)}"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ContactPickerTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            innerPadding.calculateTopPadding()
            Greeting(
                name = "Android",
                modifier = Modifier.padding(
                    top = innerPadding.calculateTopPadding()
                )
            )
        }
    }
}
