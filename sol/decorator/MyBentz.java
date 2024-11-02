package decorator;

public class MyBentz implements Car {


    @Override
    public void assemble() {
        System.out.print("벤츠 기본 스펙");
    }
}
