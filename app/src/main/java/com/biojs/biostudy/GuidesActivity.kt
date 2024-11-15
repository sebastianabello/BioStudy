package com.biojs.biostudy
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.biojs.biostudy.ui.theme.BioStudyTheme

class GuidesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BioStudyTheme {
                Scaffold(
                    bottomBar = { BottomNavBar() },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Text(
                        text = "Guides",
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

