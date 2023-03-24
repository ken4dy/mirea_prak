package prak13.Phone;

public class Phone {
    private String code;
    private String pachka1;
    private String pachka2;
    private String pachka3;

    public Phone() {}

    public String toString1(String code, String pachka1, String pachka2, String pachka3)
    {
        return "+" + code + pachka1 + "-" +pachka2 + "-" + pachka3;
    }

    public String toString2(String code, String pachka1, String pachka2, String pachka3)
    {
        return code + pachka1 + "-" +pachka2 + "-" + pachka3;
    }
}
