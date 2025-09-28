package com.kwame.montclairpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kwame.montclairpage.ui.theme.MontclairPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MontclairPageTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Welcoming(
                        welcomingMessage = stringResource(R.string.welcoming_message),
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun Welcoming(welcomingMessage: String, modifier: Modifier = Modifier) {

        val image = painterResource(R.drawable.montclair_logo_red)

    // State to control the start of the animation
    var startAnimation by remember { mutableStateOf(false) }

    // Animate alpha for fade-in effect
    // It will animate from targetValue's initial state (when startAnimation is false, so potentially 0f if we set it)
    // to the new targetValue (when startAnimation becomes true, so 1f)
    val alphaAnim by animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(durationMillis = 1000), // Adjust duration as needed (e.g., 1 second)
        label = "FadeInAlpha"
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
    }

        Column (verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(16.dp)
        )
            Text(
                text = welcomingMessage,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp)
            )
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomingPreview() {
    MontclairPageTheme {
        Welcoming(stringResource(R.string.welcoming_message))
    }
}