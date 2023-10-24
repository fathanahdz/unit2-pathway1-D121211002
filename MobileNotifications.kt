fun main(){
    val morningNotification = 51
    val eveningNotifications = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotifications)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages<100){
        val summary = numberOfMessages
        println("You have $summary notifications")
    }else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}