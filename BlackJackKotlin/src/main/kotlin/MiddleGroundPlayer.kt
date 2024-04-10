package org.example

class MiddleGroundPlayer : Player {
    constructor(dealer: Dealer, name: String) : super(dealer, name)
    override fun shouldIStay() = value() >= 15

}