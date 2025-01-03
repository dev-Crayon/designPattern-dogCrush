package command

class MusicPlayerController {
    private val history = mutableListOf<Command>()

    fun executeCommand(command: Command) {
        command.execute()
        history.add(command)
    }

    fun undoLastCommand() {
        if (history.isNotEmpty()) {
            val command = history.removeAt(history.lastIndex)
            command.undo()
        }
    }
}