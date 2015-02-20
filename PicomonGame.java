public class PicomonGame {

    public enum Player {
        GYM_LEADER("Gym leader"), TRAINER("Trainer");
        
        private String representation;
        private Player(String representation) {
            this.representation = representation;
        }

        @Override
        public String toString() {
            return representation;
        }
    }

    public class Round {
        public Player winner; // null if tied.
        public PicomonCard gymLeaderCard;
        public PicomonCard trainerCard;
        
        public Round(PicomonCard gymLeaderCard, PicomonCard trainerCard) {
            this.gymLeaderCard = gymLeaderCard;
            this.trainerCard = trainerCard;
        }

        @Override
        public String toString() {
            if (winner == null) {
                return "It's a tie between " + Player.GYM_LEADER + "'s " + gymLeaderCard + " and " +
                        Player.TRAINER + "'s " + trainerCard + "!";
            } else {
                Player loser = winner == Player.GYM_LEADER ? Player.TRAINER : Player.GYM_LEADER;
                PicomonCard winningCard = winner == Player.GYM_LEADER ? gymLeaderCard : trainerCard;
                PicomonCard losingCard = winner == Player.GYM_LEADER ? trainerCard : gymLeaderCard;
                return winner + "'s " + winningCard + " beats " + loser + "'s " + losingCard + "!";
            }
        }
    }

    private PicomonDeck gymLeaderDeck;
    private PicomonDeck trainerDeck;
    private int gymLeaderPosition;
    private int trainerPosition;
    
    public PicomonGame() {
        this(new PicomonDeck(), new PicomonDeck());
    }
    
    public PicomonGame(PicomonDeck gymLeaderDeck, PicomonDeck trainerDeck) {
        if (gymLeaderDeck.getSize() != trainerDeck.getSize()) {
            throw new IllegalArgumentException();
        }

        gymLeaderPosition = 0;
        trainerPosition = 0;
        this.gymLeaderDeck = gymLeaderDeck;
        this.trainerDeck = trainerDeck;
    }
    
    public PicomonDeck getGymLeaderDeck() {
        return gymLeaderDeck;
    }
    
    public PicomonDeck getTrainerDeck() {
        return trainerDeck;
    }

    public boolean isMatchOver() {
        // Implement me!
        if (trainerDeck.getSize() == 0 || gymLeaderDeck.getSize() == 0) {
            return true;
        }
        return false;
    }
    
    public Player getLeader() {
        // Implement me!
        if (trainerDeck.getSize() > gymLeaderDeck.getSize()) {
            return Player.TRAINER;
        }
        if (gymLeaderDeck.getSize() > trainerDeck.getSize()) {
            return Player.GYM_LEADER;
        }
        return null;

    }
    
    public Round playRound() {
        // Implement me!
        Round round = new Round(gymLeaderDeck.cardAt(gymLeaderPosition), trainerDeck.cardAt(trainerPosition));
        if (round.gymLeaderCard.beats(round.trainerCard)) {
            round.winner = Player.GYM_LEADER;
            trainerPosition++;
        } else if (round.trainerCard.beats(round.gymLeaderCard)) {
            round.winner = Player.TRAINER;
            gymLeaderPosition++;
        } else {
                round.winner = null;
                gymLeaderPosition++;
                trainerPosition++;  
        }
        return round;
    }

    public Round[] playMatch() {

        Round[] gameRounds = new Round[ trainerDeck.getSize() * gymLeaderDeck.getSize() ];

        for (int i = 0; !isMatchOver(); i++) {
            gameRounds[i] = playRound();
            System.out.println(gameRounds[i]);
        }
        
    return gameRounds;
     
    }

    public static void main(String[] args) {

        PicomonCard[] cards = new PicomonCard[args.length/2];
            for(int i = 0; i < args.length / 2; i++) {
                cards[i] = new PicomonCard(PicomonElement.valueOf(args[i * 2].toUpperCase()), Integer.parseInt(args[i * 2 + 1]));
            }

            PicomonDeck otherDeck = new PicomonDeck(cards);
            PicomonDeck deck = new PicomonDeck(cards);
            PicomonGame game = new PicomonGame(otherDeck, deck);
            
            if (args.length == 0) {
                PicomonGame newGame = new PicomonGame(deck, otherDeck);
            }

        System.out.println("Gym leader's deck: " + otherDeck);
        System.out.println("Trainer's deck: " + deck);
        otherDeck.shuffle();
        deck.shuffle();
        game.playMatch();
        System.out.println(deck.getSize());
    }
}
