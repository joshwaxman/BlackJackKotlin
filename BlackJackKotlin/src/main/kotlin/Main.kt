package org.example
import Card

fun main() {
    // create two Players and one Dealer
    val d = Dealer()
    val player1 = AdventurousPlayer(d, "Bob")
    val player2 = MiddleGroundPlayer(d, "Alice")
    // player2.setHittingStrategy(AdventurousHittingStrategy(player2))

    val players = mutableListOf(player1, player2)
    // play the game. the dealer will give two cards to each player
    for (player in players) {
        player.hit()
        player.hit()
    }

    // did anyone immediately win?
    if (player1.isBlackjack())
        println("player 1 wins via blackjack")
    if (player2.isBlackjack())
        println("player 2 wins  via blackjack")

    // no one won yet. so let us play
    for (player in players) {
        // should player hit?
        println("player " + player.name + " has a sum of " + player.value())
        while (! player.isBusted() && ! player.shouldIStay()) {
            player.hit()
            println("player " + player.name + " hit")
        }


        if (player.isBusted()) {
            println(player.name + " busted")
            break
        }
    }

    // who wins, is player1 > player2
    if (player1 < player2)
        println(player1.name + " wins")
    else if (player1 > player2)
        println(player2.name + " wins")
    else
        println("tie!")
}