import java.text.Normalizer;

public class Main {
    public static String removeAccent(String s) {
        String str = Normalizer.normalize(s, Normalizer.Form.NFD);
        str = str.replaceAll("\\p{M}", "");
        return str;
    }
    public static void main(String[] args) {
        String input = "Xin chào mọi người";
        String output = removeAccent(input);
        System.out.println(output);
    }
        }
