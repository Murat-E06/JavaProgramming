package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "cydeo.school@gmail.com";
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);
        System.out.println("-------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, str1.indexOf(","));//Java is fun
        System.out.println(s1);

        String s2 = str1.substring(str1.indexOf(" J") + 1, str1.lastIndexOf(","));//Java is cool
        System.out.println(s2);

        String s3 = str1.substring(str1.indexOf("I"));//I love Java
        System.out.println(s3);


    }
}
