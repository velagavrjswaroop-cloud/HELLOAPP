package org.example;

public class HELLOAPPUC5 {
        public static void main(String[] args) {
            String finalNames;

            if (args.length > 0) {
                StringBuilder nameBuilder = new StringBuilder();
                boolean first = true;


                for (String name : args) {
                    // If it's not the first name, add a comma before appending the name
                    if (!first) {
                        nameBuilder.append(", ");
                    }
                    nameBuilder.append(name);
                    first = false; // After the first iteration, this stays false
                }
                finalNames = nameBuilder.toString();
            } else {
                finalNames = "World";
            }

            System.out.println("Hello, " + finalNames + "!");
        }
}
