package at.csdc25bb.mad.safmeetup.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import at.csdc25bb.mad.safmeetup.components.DashboardProfileBottomBar

@Composable
fun DashboardScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = { DashboardProfileBottomBar(navController, true) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            Text("This is your Dashboard!")
        }
    }
}