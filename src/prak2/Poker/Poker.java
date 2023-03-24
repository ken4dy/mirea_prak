package prak2.Poker;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
    private ArrayList<Card> cardsInPokerHand = new ArrayList<Card>();
    private ArrayList<Player> playersProfiles = new ArrayList<Player>();
    private int playersAtTheTable = 0;

    Poker(int howManyPlayers)
    {
        playersAtTheTable = howManyPlayers;
    }

    public void StartGame()
    {
        CreatePlayersProfiles(playersAtTheTable);
        GenerateNewPokerHand();
        SpreadCards();

        for (Player player : playersProfiles)
        {
            System.out.println(player.GiveAwayCards());
        }
    }

    private void CreatePlayersProfiles(int howManyPlayers)
    {
        playersProfiles.clear();

        for (int counter = 1; counter <= howManyPlayers; counter++)
        {
            Player playerProfile = new Player(counter);
            playersProfiles.add(playerProfile);
        }
    }

    private void SpreadCards()
    {
        int fullHands = 0;
        boolean cardAdded = false;

        Random random = new Random();

        while(fullHands < playersAtTheTable)
        {
            for (Player player : playersProfiles)
            {
                if(cardsInPokerHand.size() <= 1)
                    GenerateNewPokerHand();

                int cardId = random.nextInt(cardsInPokerHand.size()-1);
                Card card = cardsInPokerHand.get(cardId);
                cardAdded = player.AddCard(card);

                if(cardAdded == false)
                    fullHands++;

                cardsInPokerHand.remove(cardId);
            }
        }
    }

    private void GenerateNewPokerHand()
    {
        for(CardColor cardColor : CardColor.values())
        {
            ArrayList<Card> newCards = CreateCards(cardColor);
            cardsInPokerHand = SummCards(newCards, cardsInPokerHand);
        }
    }

    private ArrayList<Card> CreateCards(CardColor cardColor)
    {
        ArrayList<Card> cards = new ArrayList<>();

        for (int counter = 0; counter < CardName.values().length; counter++)
        {
            Card card = new Card(cardColor,CardName.values()[counter]);
            cards.add(card);
        }

        return cards;
    }

    private ArrayList<Card> SummCards(ArrayList<Card> firstArray, ArrayList<Card> secondArray)
    {
        ArrayList<Card> newArrayOfCards = new ArrayList<Card>();

        for (Card card: firstArray)
        {
            newArrayOfCards.add(card);
        }

        for (Card card: secondArray)
        {
            newArrayOfCards.add(card);
        }

        return newArrayOfCards;
    }
}