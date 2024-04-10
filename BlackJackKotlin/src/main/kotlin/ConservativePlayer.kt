package org.example

class ConservativePlayer : Player {
    constructor(dealer: Dealer, name: String) : super(dealer, name)
    override fun shouldIStay() = value() >= 11
}