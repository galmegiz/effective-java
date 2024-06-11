package item05;

import java.util.List;
import java.util.Objects;

// OCP의 원칙, 클라이언트 코드는 변경하지 않고 기능을 바꿀 수 있다.
public class SpellChecker {
    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory){
        dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
