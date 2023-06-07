package cat.barcelonactiva.itacademy.Generics.Ex1_1;

import java.util.ArrayList;
import java.util.List;

public class NoGenericMethods {
    List<String> team;

    public NoGenericMethods(String s1, String s2, String s3) {
        team = new ArrayList<>();
        team.add(s1);
        team.add(s2);
        team.add(s3);
    }

    public List<String> getTeam() {
        return team;
    }

    public void setTeam(List<String> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "team=" + team +
                '}';
    }
}
