package pl.clickandgoApp.clickandgo;

import java.util.Objects;

public class City {

    private final String id;
    private final String name;
    private final String countryId;

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", countryId='" + countryId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) && Objects.equals(name, city.name) && Objects.equals(countryId, city.countryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countryId);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountryId() {
        return countryId;
    }

    public City(String id, String name, String countryId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
    }
}
