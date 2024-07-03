package item14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PhoneNumber implements Comparable<PhoneNumber>{
    private int areaCode;
    private int prefix;
    private int lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt((PhoneNumber pn) -> pn.prefix);

    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNum=" + lineNum +
                '}';
    }

    public static void main(String[] args) {
        List<PhoneNumber> numbers = new ArrayList<>();
        numbers.add(new PhoneNumber(123, 456, 789));
        numbers.add(new PhoneNumber(456, 456, 789));
        numbers.add(new PhoneNumber(789, 456, 789));

        numbers.sort((pn1, pn2) -> {
            System.out.println(pn1.areaCode);
            System.out.println(pn2.areaCode);
            System.out.println();
            if(pn1.areaCode < pn2.areaCode) return -1;
            else return 1;
        });

        System.out.println(numbers);
    }
}
