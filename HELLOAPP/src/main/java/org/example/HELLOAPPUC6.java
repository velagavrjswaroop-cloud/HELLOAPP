package org.example;

public class HELLOAPPUC6 {
        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Hello World");
            } else {
                String result = "";

                for (String name : args) {
                    result += name + ", ";
                }

                result = result.substring(0, result.length() - 2);
                System.out.println("Hello " + result);
            }
        }
}
