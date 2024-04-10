// in the Enum Card, we should have ACE through KING
// This is blackjack so we don't need suits

public enum Card {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
  public int getValue() {
    switch (this) {
      case ACE:
        return 11;
      case TWO:
        return 2;
      case THREE:
        return 3;
      case FOUR:
        return 4;
      case FIVE:
        return 5;
      case SIX:
        return 6;
      case SEVEN:
        return 7;
      case EIGHT:
        return 8;
      case NINE:
        return 9;
      case TEN:
      case JACK:
      case QUEEN:
      case KING:
        return 10;
      default:
        return 0;
    }
  }
}
