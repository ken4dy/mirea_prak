package prak2.Poker;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int id = 0;
    private List<Card> hand = new ArrayList<>();
    private int cardsCount = 0;

    Player(int id)
    {
        this.id = id;
    }

    public boolean AddCard(Card card)
    {
        if(hand.size() < 6)
        {
            hand.add(card);
            cardsCount++;
            return true;
        }
        return false;
    }

    public String GiveAwayCards()
    {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n");
        stringBuffer.append("Игрок: " + id+"\n");
        for (Card card: hand)
        {
            stringBuffer.append("Масть: "+card.GetColor() +" Название: "+ card.GetName() + "\n");
        }
        return stringBuffer.toString();
    }
}
