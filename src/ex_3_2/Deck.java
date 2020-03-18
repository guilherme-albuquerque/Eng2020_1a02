package ex_3_2;


import java.util.*;

class Deck {
public Deck( ) {
java.util.List<?> cards = new ArrayList<Card>( );

Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS,

Suit.DIAMONDS};
for(Suit suit: suits) {
for(int i = 2; i <= 14; i++) {
cards.add((Collection<"?">) new Card(suit, i));
}
}


Collections.shuffle(cards, new Random( ));
}
public void print( ) {
for(Object card: card) {
card( );
}
}

    private void card() {
    }

    private List card;


public static Deck getInstance(Deck deck) {
return deck;

}
}

