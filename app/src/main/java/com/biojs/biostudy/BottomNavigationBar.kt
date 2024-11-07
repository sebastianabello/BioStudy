package com.biojs.biostudy

import android.content.Intent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavigationBar(currentScreen: String) {
    val context = LocalContext.current
    val items = listOf("Home", "Profile", "Support", "Settings")
    val icons = listOf(
        painterResource(id = R.drawable.home),
        painterResource(id = R.drawable.profile),
        painterResource(id = R.drawable.support),
        painterResource(id = R.drawable.settings)
    )

    BottomAppBar(
        cutoutShape = CircleShape,
        backgroundColor = Color(android.graphics.Color.parseColor("#fafbfd")),
        elevation = 3.dp
    ) {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                selected = (currentScreen == item),
                onClick = {
                    when (item) {
                        "Home" -> context.startActivity(Intent(context, MainActivity::class.java))
                        "Profile" -> context.startActivity(Intent(context, ProfileActivity::class.java))
                        "Support" -> context.startActivity(Intent(context, SupportActivity::class.java))
                        "Settings" -> context.startActivity(Intent(context, SettingsActivity::class.java))
                    }
                },
                icon = {
                    Icon(
                        painter = icons[index],
                        contentDescription = item,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                },
                label = {
                    Text(
                        text = item,
                        modifier = Modifier.padding(top = 14.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp
                    )
                },
                alwaysShowLabel = true
            )
        }
    }
}