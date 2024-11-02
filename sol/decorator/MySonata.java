package decorator;

public class MySonata implements Car{
    @Override
    public void assemble() {
        System.out.print("소나타 기본 스펙");
    }
}
