package command

interface Command {
    fun execute()
    fun undo()
}

class PlayCommand(
    private val player: MusicPlayer,
    private val trackName: String
) : Command {
    override fun execute() {
        player.play(trackName)
    }

    override fun undo() {
        player.pause()
    }
}

class PauseCommand(
    private val player: MusicPlayer
) : Command {
    private var previousTrack: String = ""
    private var wasPlaying: Boolean = false

    override fun execute() {
        previousTrack = player.getCurrentTrack()
        wasPlaying = player.isPlaying()
        player.pause()
    }

    override fun undo() {
        if (wasPlaying && previousTrack.isNotEmpty()) {
            player.play(previousTrack)
        }
    }
}

class VolumeCommand(
    private val player: MusicPlayer,
    private val volume: Int
) : Command {
    private var previousVolume = 50

    override fun execute() {
        player.setVolume(volume)
    }

    override fun undo() {
        player.setVolume(previousVolume)
    }
}
