import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import ui.ChatListScreen
import ui.ChatModel

@Composable
fun App() {
    val sampleChats = listOf(
        ChatModel(1, "Whogram Dev", "Сборка через GitHub Actions настроена!", "20:10"),
        ChatModel(2, "Избранное", "Токены и конфиги для TDLib", "19:45"),
        ChatModel(3, "Telegram News", "Обновление кросс-платформенного клиента", "Вчера")
    )
    MaterialTheme {
        ChatListScreen(chats = sampleChats, onChatClick = {})
    }
}
