package command

class MusicPlayer {
    private var isPlaying = false
    private var volume = 50
    private var currentTrack = ""

    fun play(trackName: String) {
        currentTrack = trackName
        isPlaying = true
        println("재생 중: $trackName")
    }

    fun pause() {
        isPlaying = false
        println("일시정지됨: $currentTrack")
    }

    fun setVolume(volume: Int) {
        this.volume = volume.coerceIn(0, 100)
        println("볼륨 설정: ${this.volume}")
    }

    fun getStatus(): String {
        return "현재 곡: $currentTrack, 재생 중: $isPlaying, 볼륨: $volume"
    }

    fun getCurrentTrack(): String = currentTrack
    fun isPlaying(): Boolean = isPlaying
}