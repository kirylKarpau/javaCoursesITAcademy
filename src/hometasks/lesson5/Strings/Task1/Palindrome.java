package hometasks.lesson5.Strings.Task1;


public class Palindrome {
    public static void main(String[] args) {
        String test = "Sator Arepo Tenet Opera Rotas";
        String b = new StringBuffer(test).reverse().toString().toLowerCase();
        System.out.println(test.toLowerCase().equals(b) ? "String is palindrome" : "String is not palindrome");
    }
}
