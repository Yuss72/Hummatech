package KonsepOOP;

import java.util.Scanner;
class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public boolean isUsernameValid() {
        if (username.isEmpty()) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char karakter = username.charAt(i);

            boolean isUpperCase = (karakter >= 'A' && karakter <= 'Z') ;
            boolean isLowerCase = (karakter >= 'a' && karakter <= 'z') ;
            boolean isNumber = (karakter >= '0' && karakter <= '9') ;

            if (!(isUpperCase || isLowerCase || isNumber)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPasswordValid() {
        return password.length() >= 6;
    }
}

public class Tugas4P {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user1 = new User();

        System.out.print("Silahkan Masukkan Username: ");
        user1.setUsername(input.nextLine());
        System.out.print("Silahkan Masukkan Password: ");
        user1.setPassword(input.nextLine());

        System.out.println("\nUsername: " + user1.getUsername());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Status: " + (user1.isUsernameValid() && user1.isPasswordValid() ? "Sesuai" : "Tidak Sesuai"));
        System.out.println("----------------------");

        User user2 = new User();
        user2.setUsername("QRA");
        user2.setPassword("Assay");

        System.out.println("Username: " + user2.getUsername());
        System.out.println("Password: " + user2.getPassword());
        System.out.println("Status: " + 
            (user2.isUsernameValid() && user2.isPasswordValid() ? "Sesuai" : "Tidak Sesuai"));
    }
}