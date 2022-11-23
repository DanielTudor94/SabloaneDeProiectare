package TestSP;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Element{
    private String name;

    private List<Element> continut;

    public Playlist() {
        continut = new ArrayList<>();
    }

    public Playlist(String name) {
        this.name = name;
        continut = new ArrayList<>();

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPlaylist(this);
        for (Element element : continut) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        continut.add(element);
    }
}
