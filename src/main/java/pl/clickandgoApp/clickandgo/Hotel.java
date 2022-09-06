package pl.clickandgoApp.clickandgo;

import java.util.Objects;

public class Hotel {

    private final String id;
    private final String name;
    private final int stars;
    private final String description;
    private final String cityId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return stars == hotel.stars && Objects.equals(id, hotel.id) && Objects.equals(name, hotel.name) && Objects.equals(description, hotel.description) && Objects.equals(cityId, hotel.cityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stars, description, cityId);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }

    public String getCityId() {
        return cityId;
    }

    public Hotel(String id, String name, int stars, String description, String cityId) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.description = description;
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                ", description='" + description + '\'' +
                ", cityId='" + cityId + '\'' +
                '}';
    }
}
