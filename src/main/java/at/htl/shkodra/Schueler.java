package at.htl.shkodra;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import java.util.List;

public record Schueler(String name, int jahrgang, String gruppe) {

    public static void main(String[] args) {
        List<Schueler> liste = List.of(
                new Schueler("Ana Hoxha", 5, "5as"),
                new Schueler("Blerta Krasniqi", 5, "5aw"),
                new Schueler("Dritan Berisha", 5, "5an")
        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(liste));

        System.out.println(StringUtils.reverse("Shkodra"));
    }
}