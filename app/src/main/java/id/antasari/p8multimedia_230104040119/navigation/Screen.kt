package id.antasari.p8multimedia_230104040119.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Recorder : Screen("recorder")
    object Player : Screen("player")
    object Video : Screen("video")
    object Gallery : Screen("gallery")
}
