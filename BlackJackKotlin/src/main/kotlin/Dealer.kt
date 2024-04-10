package org.example
import Card
public class Dealer {
    // dealer should have 52 cards and a method called dealCard
    // that returns a card
    private val deck = mutableListOf<Card>()
    init {
        // recall that Card is an enum going from ACE to KING
        for (card in Card.entries) {
            // add four times
            deck.add(card)
            deck.add(card)
            deck.add(card)
            deck.add(card)
        }
        deck.shuffle()
    }
    fun dealCard(): Card {
        return deck.removeAt(0)
    }
}