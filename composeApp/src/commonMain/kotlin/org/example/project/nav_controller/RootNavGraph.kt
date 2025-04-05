package org.example.project.nav_controller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import org.example.project.ui.logged.LoggedScreen
import org.example.project.ui.unlogged.CreateAccountScreen
import org.example.project.ui.unlogged.LoginScreen

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.UNLOGGED
    ) {
        navigation(
            route = Graph.UNLOGGED,
            startDestination = UnloggedScreen.Login.route
        ) {
            composable(route = UnloggedScreen.Login.route) {
                LoginScreen(
                    onLogin = {
                        navController.popBackStack()
                        navController.navigate(Graph.LOGGED)
                    }
                )
            }

            composable(route = UnloggedScreen.CreateAccount.route) {
                CreateAccountScreen()
            }
        }

        composable(route = Graph.LOGGED) {
            LoggedScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val LOGGED = "logged_graph"
    const val UNLOGGED = "unlogged_graph"
}

sealed class UnloggedScreen(val route: String) {
    object Login : UnloggedScreen(route = "LOGIN")
    object CreateAccount : UnloggedScreen(route = "CREATE_ACCOUNT")
}
