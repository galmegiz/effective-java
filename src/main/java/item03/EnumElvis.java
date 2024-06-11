package item03;

// relfection으로도 생성 불가
public enum EnumElvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("leave!!!");
    }

    public static void main(String[] args) {
        EnumElvis elvis = EnumElvis.INSTANCE;

    }
}
