package item13;

public class Stack implements Cloneable{
    private Object[] elements;
    private int size = 0;

    public Stack() {
        this.elements = new Object[100];
    }

    // 단순하게 이렇게 복사할 경우 내부의 elements를 동일하게 참조한다.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Stack result = (Stack) super.clone();
        return result;
    }
}
