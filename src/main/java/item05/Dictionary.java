package item05;

import java.util.List;

public interface Dictionary {
    public boolean contains(String word);
    public List<String> closeWordsTo(String typo);
}
