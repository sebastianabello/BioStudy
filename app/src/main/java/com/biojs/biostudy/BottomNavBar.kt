package com.biojs.biostudy

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun BottomNavBar() {
    val bottomMenuItemsList = prepareBottomMenu()
    val context = LocalContext.current
    var selectedItem by remember { mutableStateOf("Home") }

    BottomAppBar(
        cutoutShape = CircleShape,
        backgroundColor = Color(android.graphics.Color.parseColor("#fafbfd")),
        elevation = 3.dp
    ) {
        bottomMenuItemsList.forEachIndexed { index, bottomMenuItem ->
            if (index == 2) {
                BottomNavigationItem(
                    selected = false,
                    onClick = {},
                    icon = {},
                    enabled = false
                )
            }
            BottomNavigationItem(
                selected = (selectedItem == bottomMenuItem.label),
                onClick = {
                    selectedItem = bottomMenuItem.label
                    Toast.makeText(context, bottomMenuItem.label, Toast.LENGTH_SHORT).show()
                    navigateToScreen(context, bottomMenuItem.label)
                },
                icon = {
                    Icon(
                        painter = bottomMenuItem.icon,
                        tint = Color.Gray,
                        contentDescription = bottomMenuItem.label,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                },
                label = {
                    Text(
                        text = bottomMenuItem.label,
                        modifier = Modifier.padding(top = 14.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp
                    )
                },
                alwaysShowLabel = true,
                enabled = true
            )
        }
    }
}

fun navigateToScreen(context: Context, label: String) {
    val intent = when (label) {
        "Home" -> Intent(context, MainActivity::class.java)
        "Profile" -> Intent(context, ProfileActivity::class.java)
        "Support" -> Intent(context, SupportActivity::class.java)
        "Settings" -> Intent(context, SettingsActivity::class.java)
        "Notes" -> Intent(context, NotesActivity::class.java)
        else -> null
    }
    intent?.let { context.startActivity(it) }
}

data class BottomMenuItem(val label: String, val icon: Painter)

@Composable
fun prepareBottomMenu(): List<BottomMenuItem> {
    val bottomMenuItemList = arrayListOf<BottomMenuItem>()

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Home",
            icon = painterResource(id = R.drawable.home)
        )
    )

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Profile",
            icon = painterResource(id = R.drawable.profile)
        )
    )

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Support",
            icon = painterResource(id = R.drawable.support)
        )
    )

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Settings",
            icon = painterResource(id = R.drawable.settings)
        )
    )

    return bottomMenuItemList
}