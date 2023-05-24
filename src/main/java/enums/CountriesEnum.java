package enums;

import lombok.Getter;

@Getter
public enum CountriesEnum {

    DUB("Ireland", "Dublin"),
    NPL("Italy", "Naples");

    private final String countryName;
    private final String airportName;

    CountriesEnum(String countryName, String airportName) {
        this.countryName = countryName;
        this.airportName = airportName;
    }
}
