package com.example.pertemuan2basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan2basiccompose.ui.theme.Pertemuan2BasicComposeTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan2BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Layout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Layout(modifier: Modifier = Modifier)
    {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Login",
            style = TextStyle(fontSize = 50.sp,
                fontWeight = FontWeight.Bold))

            Text(text = "Assalamualaikum",
                style = TextStyle(fontSize = 20.sp,
                    fontWeight = FontWeight.Normal))

            Image(painter = painterResource(id = R.drawable.ada),
                contentDescription = null, modifier = Modifier.padding(top = 30.dp).size(250.dp))

            Text(text = "Nama :",style = TextStyle(fontSize = 20.sp,
                fontWeight = FontWeight.Bold, ), modifier = Modifier.padding(top = 20.dp))

            Text(text = "Ahmad Nur Hidayatullah",color = Color.Red





