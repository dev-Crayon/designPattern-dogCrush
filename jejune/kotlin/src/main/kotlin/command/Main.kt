package command

fun main() {
    val player = MusicPlayer()
    val controller = MusicPlayerController()

    // 커맨드 생성
    val playCommand = PlayCommand(player, "좋은 날 - IU")
    val pauseCommand = PauseCommand(player)
    val volumeUpCommand = VolumeCommand(player, 75)

    // 커맨드 실행
    controller.executeCommand(playCommand)
    println(player.getStatus())

    controller.executeCommand(volumeUpCommand)
    println(player.getStatus())

    controller.executeCommand(pauseCommand)
    println(player.getStatus())

    // Undo 실행
    println("\n--- Undo 실행 ---")
    controller.undoLastCommand()
    println(player.getStatus())
}