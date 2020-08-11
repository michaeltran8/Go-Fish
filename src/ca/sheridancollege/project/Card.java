package ca.sheridancollege.project;

public class Card
{

    enum Suit
    {
        CLUBS, DIAMOND, HEART, SPADES;

        private static final Suit[] suit = Suit.values();

        public static Suit getSuit(int i)
        {
            return Suit.suit[i];
        }

    }
    
    enum Value
    {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN,
        KING;

        private static final Value[] values = Value.values();

        public static Value getValue(int i)
        {
            return Value.values[i];
        }
    }

    public Suit getSuit()
    {
        return suits;
    }

    public Value getValue()
    {
        return values;
    }

    private final Suit suits;
    private final Value values;

    public Card(final Suit suit, final Value value)
    {
        this.suits = suit;
        this.values = value;
    }

    @Override
    public String toString()
    {
        return String.format(suits + " " + values);
    }

}
