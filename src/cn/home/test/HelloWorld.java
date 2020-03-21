package cn.home.test;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        String selectBookByname = "SELECT * FROM a_book WHERE name LIKE {%book.name%}";
    }
}
