package com.biojs.biostudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.biojs.biostudy.ui.theme.BioStudyTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BioStudyTheme {
                Scaffold(
                    bottomBar = { BottomNavBar() },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Text(
                        text = "Profile",
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}
