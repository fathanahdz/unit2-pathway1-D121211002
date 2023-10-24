fun main(){
    val song = Song()
    song.songDescription(song.title, song.artist, song.yearPublished)
    song.popularity(song.playCount)
}

class Song(){
    val title = "Oceans and Engines"
    val artist = "Nicole Zefanya"
    val yearPublished = "2022"
    val playCount = 85732057
    var popularity = "popular"

    fun popularity(playCount: Int){
        if (playCount<1000) {
            popularity = "unpopular" 
        }
        println("This song is $popularity")
    }

    fun songDescription(title:String, artist: String, yearPublished: String){
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}