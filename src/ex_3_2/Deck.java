package ex_3_2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

class Deck {
public Deck( ) {
java.util.List<?> cards = new ArrayList<Card>( );

Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS,

Suit.DIAMONDS};
for(Suit suit: suits) {
for(int i = 2; i <= 14; i++) {
cards.add((Collection<?>) new Card(suit, i));
}
}


Collections.shuffle(cards, new Random( ));
}
public void print( ) {
for(Card card: card) {
card.print( );
}
}
private List card;


public static Deck getInstance(Deck deck) {
return deck;

}
}

