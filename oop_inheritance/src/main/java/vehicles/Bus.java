package vehicles;

public class Bus extends Transport{
    private boolean hasDoubleDeck;

    public Bus(String name, int maxPassengers, boolean hasDoubleDeck) {
        super(name, maxPassengers);
        this.hasDoubleDeck = hasDoubleDeck;
    }

    public boolean isHasDoubleDeck() {
        return hasDoubleDeck;
    }

    @Override
    public String getCapacityInfo() {
        return  "Transport: " + name + " can carry " + maxPassengers +
                " passengers has double decks: " + hasDoubleDeck;
    }
}
