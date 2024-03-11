package player;

import java.util.Scanner;

public class Player {
    String name;
    String emailId;
    String contactNumber;
    String address;
    int age;

    public void setDetails(String name, String emailId, String contactNumber, String address, int age) {
        this.name = name;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.address = address;
        this.age = age;
    }

    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameAndContactAge(String name, String contactNumber, int age) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.age = age;
    }

    public void setNameAndEmail(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public void getNameAndAge() {
        System.out.println("Player name " + this.name);
        System.out.println("Player age " + this.age);
    }

    public void getDetails() {
        System.out.println("Player name " + this.name);
        System.out.println("Player emailId " + this.emailId);
        System.out.println("Player contactNumber " + this.contactNumber);
        System.out.println("Player address " + this.address);
        System.out.println("Player age " + this.age);
    }

    public void setPlayerDetailsFromUserInput(Player p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player Details :)");
        System.out.println("Enter player name : ");
        String name = sc.nextLine();
        System.out.println("Enter player contactNumber : ");
        String contactNumber = sc.nextLine();
        System.out.println("Enter player Address : ");
        String address = sc.nextLine();
        System.out.println("Enter player emailId : ");
        String emailId = sc.nextLine();
        System.out.println("Enter player age : ");
        int age = sc.nextInt();

        p.setDetails(name, emailId, contactNumber, address, age);

    }

    public String getName() {
        return this.name;
    }
}
