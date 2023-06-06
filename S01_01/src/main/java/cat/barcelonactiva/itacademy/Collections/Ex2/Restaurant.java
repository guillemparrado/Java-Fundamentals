package cat.barcelonactiva.itacademy.Collections.Ex2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private final String name;
    private final int points;

    public Restaurant(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restaurant other = (Restaurant) obj;
        return name.equals(other.name) && points == other.points;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "name=" + name + ", points=" + points + '}';
    }

    @Override
    public int compareTo(Restaurant o) {
        int nameCompare = name.compareTo(o.name);
        return nameCompare != 0 ? nameCompare : points - o.points;
    }
}
