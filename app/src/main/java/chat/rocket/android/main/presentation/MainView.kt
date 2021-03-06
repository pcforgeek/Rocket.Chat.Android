package chat.rocket.android.main.presentation

import chat.rocket.android.core.behaviours.MessageView
import chat.rocket.android.main.viewmodel.NavHeaderViewModel
import chat.rocket.android.server.domain.model.Account

interface MainView : MessageView {
    fun setupNavHeader(model: NavHeaderViewModel, accounts: List<Account>)
    fun closeServerSelection()
}