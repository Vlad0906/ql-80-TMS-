package additionalTask;

import java.io.Serializable;
import java.util.List;

public class Terminal implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> elements;

    public Terminal(List<String> elements) {
        this.elements = elements;
    }

    public List<String> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "parameters=" + elements +
                '}';
    }
}
