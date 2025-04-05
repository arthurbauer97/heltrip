package org.example.project.nav_controller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.example.project.commons.BottomBarScreen
import org.example.project.ui.logged.HomeScreen
import org.example.project.ui.logged.ProfileScreen

@Composable
fun LoggedNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.LOGGED,
        startDestination = BottomBarScreen.HOME.route
    ) {
        composable(route = BottomBarScreen.HOME.route) { HomeScreen() }
        composable(route = BottomBarScreen.PROFILE.route) { ProfileScreen() }
    }
}