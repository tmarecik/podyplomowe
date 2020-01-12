package laboratorium17;

public enum GeographicalDirections {

    NORTH("północ", "north", "N"),
    SOUTH("południe", "south", "S"),
    EAST("wschód", "south", "S"),
    WEST("zachód", "west", "W"),
    NORTH_EAST("północny-wschód", "north-east", "NE"),
    SOUTH_EAST("polódniowy-wschód", "south-east", "SE"),
    NORTH_WEST("północny-zachód", "north-west", "NW"),
    SOUTH_WEST("połódniowy-wschód", "south-east", "SE");

    String polishName;
    String englishName;
    String shourtcut;

    GeographicalDirections(String polishName, String englishName, String shourtcut) {
        this.polishName = polishName;
        this.englishName = englishName;
        this.shourtcut = shourtcut;
    }

    public String getPolishName() {
        return "Polska nazwa kierunku: "  + polishName;
    }

    public String getEnglishName() {
        return "Angielska nazwa kierunku: "  + englishName;
    }

    public String getShourtcut() {
        return "Nazwa skrócona kierunku: "  + shourtcut;
    }
}
