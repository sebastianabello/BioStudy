package com.biojs.biostudy

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Intro()
        }

    }

    @Preview
    @Composable
    fun Intro() {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .background(Color.White)
        ) {
            val (img, img2, img3) = createRefs()

            Image(painter = painterResource(id = R.drawable)),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(img) {
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                }
        }

    }
}

