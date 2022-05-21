package com.priyanka.basicsexamplewithimageandeffects

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.priyanka.basicsexamplewithimageandeffects.ui.theme.BasicsExampleWithImageAndEffectsTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsExampleWithImageAndEffectsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val painter = painterResource(id = R.drawable.image)
                    val title = "PRiyanka"
                    val desc = "the Great Priyanka, She is the Best...!"
                    ImageCard(painter,title,desc)
                }
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription : String,
    title : String,
    modifier: Modifier = Modifier
) {
    Card(modifier.fillMaxWidth(),
    shape = RoundedCornerShape(15.dp),
    elevation = 5.dp){
        Box(Modifier.height(200.dp)){
            Image(painter = painter,
                contentDescription = contentDescription,
            contentScale = ContentScale.Crop)
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                ),
                contentAlignment =  Alignment.BottomStart){
                Text(text = title,
                    style = androidx.compose.ui.text.TextStyle(Color.White,16.sp))
            }
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    BasicsExampleWithImageAndEffectsTheme {
//        Greeting("Android")
//    }
//}