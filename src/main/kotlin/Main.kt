fun main() {
    val musicLover = true
    val discontMusicLover = 1
    val amount = 20000
    val discont0 = 0
    val discontMin = 100
    val amountMin = 1000
    val discontMax = 5
    val amountMax = 10000

    println("Ваша сумма покупки составляет: $amount")
    val diskont = if (amount <= amountMin) {
        println("У вас нет скидки за покупку")
        discont0
    } else {
        if (amount > amountMin && amount <= amountMax) {
            println("Ваша скидка $discontMin руб.")
            discontMin
        } else {
            println("Ваша скидка $discontMax%")
            discontMax * amount / 100
        }
    }

    val amountResult = if (musicLover) {
        println("Скидка как меломану: $discontMusicLover%")
        amount - diskont - (amount - diskont) * discontMusicLover / 100
    } else {
        amount - diskont
    }
    println("Итого к оплате $amountResult руб.")
}