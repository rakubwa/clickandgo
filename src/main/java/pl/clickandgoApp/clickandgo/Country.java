package pl.clickandgoApp.clickandgo;


import java.util.Objects;

public class Country {

    private final String id;
    private final String name;
    private final String continentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) && Objects.equals(name, country.name) && Objects.equals(continentId, country.continentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, continentId);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContinentId() {
        return continentId;
    }

    public Country(String id, String name, String continentId) {
        this.id = id;
        this.name = name;
        this.continentId = continentId;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", continentId='" + continentId + '\'' +
                '}';
    }
}
