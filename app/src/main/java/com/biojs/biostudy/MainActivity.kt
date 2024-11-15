package com.biojs.biostudy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyUi()
        }
    }
}

@Composable
fun MyUi() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        bottomBar = { BottomNavBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                contentColor = Color.White,
                backgroundColor = Color(android.graphics.Color.parseColor("#d6d7da"))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notes),
                    contentDescription = "add",
                    tint = Color(android.graphics.Color.parseColor("#727376")),
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                )
            }
        },
        scaffoldState = scaffoldState,
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#fafbfd")))
                .padding(28.dp)
                .verticalScroll(rememberScrollState())
                .padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NameProfile()
            Title()
            Buttons()
        }
    }
}

@Composable
fun Buttons() {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .padding(top = 80.dp)
            .fillMaxWidth(),
    ) {
        Column(
            Modifier
                .weight(0.4f)
                .height(120.dp)
                .padding(end = 12.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#87b1e3")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(top = 16.dp)
                .clickable {
                    context.startActivity(Intent(context, GuidesActivity::class.java))
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn1), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                "Guides",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 6.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        Column(
            Modifier
                .weight(0.4f)
                .height(120.dp)
                .padding(start = 12.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#ff8a8a")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(top = 16.dp)
                .clickable {
                    context.startActivity(Intent(context, GuidesActivity::class.java))
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn2), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                "Videos",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 6.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }

    Row(
        modifier = Modifier
            .padding(top = 24.dp)
            .fillMaxWidth()
    ) {
        Column(
            Modifier
                .weight(0.4f)
                .height(120.dp)
                .padding(end = 12.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#98d2b0")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn3), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                "Case Studies",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 6.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        Column(
            Modifier
                .weight(0.4f)
                .height(120.dp)
                .padding(start = 12.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#ffc673")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn4), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                "Protocols",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 6.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }

    Row(
        modifier = Modifier
            .padding(top = 24.dp)
            .fillMaxWidth()
    ) {
        Column(
            Modifier
                .weight(0.4f)
                .height(120.dp)
                .padding(end = 12.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#b89ebc")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn5), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                "Assessments",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 6.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        Column(
            Modifier
                .weight(0.4f)
                .height(120.dp)
                .padding(start = 12.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#94abc1")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn6),
                contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                "Virtual Labs",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 6.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

@Composable
fun Title() {
    Text(
        "What do you want to\n remember about?",
        color = Color.Black,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 26.dp)
    )
}

@Composable
fun NameProfile() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.user),
            contentDescription = null,
            modifier = Modifier
                .height(55.dp)
                .width(55.dp)
                .clickable {}
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
                .height(40.dp)
                .align(alignment = Alignment.CenterVertically)
        ) {
            Text(
                text = "Hi, User Welcome back!",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
            )
        }
    }
}

@Preview
@Composable
fun PreviewMyUi() {
    MyUi()
}