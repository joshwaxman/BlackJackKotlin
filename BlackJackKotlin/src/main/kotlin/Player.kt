package org.example
// a Player has-a Hand, and a Dealer
// the Dealer is injected into the Player in the constructor
import Card
// player should be comparable
//
//abstract class HittingStrategy(val player : Player) {
//    abstract fun shouldIHit() : Boolean
//}
//
//class ConservativeHittingStrategy : HittingStrategy {
//    constructor(player: Player) : super(player)
//    override fun shouldIHit(): Boolean {
//        return player.value() < 11
//    }
//}
//
//class AdventurousHittingStrategy : HittingStrategy {
//    constructor(player: Player) : super(player)
//    override fun shouldIHit(): Boolean {
//        return player.value() < 17
//    }
//}
//
//class MiddleGroundHittingStrategy : HittingStrategy {
//    constructor(player: Player) : super(player)
//    override fun shouldIHit(): Boolean {
//        return player.value() < 15
//    }
//}

abstract class Player(val dealer : Dealer, val name: String) : Comparable<Player> {
    override fun compareTo(other: Player): Int {
        // recall that > 21 means busted, so a player less than 21 should win
        return hand.value - other.hand.value
    }
    val hand = Hand()
    // var hittingStrategy: HittingStrategy = ConservativeHittingStrategy(this)
    fun clear() {
        hand.clear()
    }
    fun addCard(card: Card) {
        hand.addCard(card)
    }
    fun showHand() {
        println(hand)
    }
    fun showFirstCard() {
        println(hand.firstCard)
    }
    fun value() = hand.value

    fun isBlackjack() = hand.value == 21
    fun isHittable() = hand.value < 21
    abstract fun shouldIStay() : Boolean // = ! hittingStrategy.shouldIHit()

    fun isFiveCardCharlie() = hand.size == 5
    fun isBusted() = hand.value > 21
    fun hit() {
        addCard(dealer.dealCard())
    }

    fun stay() {
        // do nothing
    }
//    fun setHittingStrategy(hittingStrategy: HittingStrategy) {
//        this.hittingStrategy = hittingStrategy
//    }
}