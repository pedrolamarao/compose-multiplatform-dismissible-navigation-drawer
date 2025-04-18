package br.dev.pedrolamarao.sample

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication(
    state = WindowState(size = DpSize(1200.dp,800.dp)),
    title = "Sample",
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
//    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    MaterialTheme {
        Box (
            modifier = Modifier.fillMaxSize().border(1.dp,Color.Red)
        ) {
            DismissibleNavigationDrawer(
                drawerContent = {
                    DismissibleDrawerSheet(drawerState) {
                        NavigationDrawerItem(
                            label = { Text("Location") },
                            selected = true,
                            onClick = {},
                        )
                    }
                },
                drawerState = drawerState,
                content = {
                    Row (
                        modifier = Modifier.fillMaxSize().padding(4.dp).border(1.dp,Color.Blue),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(Icons.Default.Done,"Done")
                    }
                }
            )
        }
    }
}
