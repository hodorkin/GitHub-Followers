package com.pet.githubfollowerscompose.naviagtion

sealed class Screen(val route: String) {
    data object SearchScreen : Screen("search_screen")
    data object FollowersScreen : Screen("followers_screen")
}