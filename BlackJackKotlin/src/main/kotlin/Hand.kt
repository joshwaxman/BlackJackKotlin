package org.example

import Card

// we will have at least two cards in our hand
// we will have at most five cards in our hand because if you don't
// bust and have five cards, you win!
// we will have a total value of our hand
class Hand {
    val firstCard: Card
        get() = cards[0]

    private val cards = mutableListOf<Card>()
    val size: Int
        get() = cards.size
    val value: Int
        get() {
            var value = 0
            var aces = 0
            for (card in cards) {
                if (card == Card.ACE) {
                    aces++
                }
                // card is an enum, I want to convert it to an int
                // and add to value

                value += card.value
            }
            // if we have aces and we are bust, we can convert
            // recall
            while (value > 21 && aces > 0) {
                value -= 10
                aces--
            }
            return value
        }
    fun addCard(card: Card) {
        cards.add(card)
    }
    fun clear() {
        cards.clear()
    }
    override fun toString(): String {
        return cards.joinToString(", ")
    }
}