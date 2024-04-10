package org.example

class AdventurousPlayer : Player {
    constructor(dealer: Dealer, name: String) : super(dealer, name)
    override fun shouldIStay() = value() >= 17
}