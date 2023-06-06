package cat.barcelonactiva.itacademy.Collections.Ex1_1;

import java.util.Objects;

public class Month {
    private final String name;

    public Month(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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
        Month other = (Month) obj;
        return name.equals(other.name);
    }
}
