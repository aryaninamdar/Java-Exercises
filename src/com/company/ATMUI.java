package com.company;
import java.util.*;

public class ATMUI {
    public static void main(String[] args) {
        ATMUI atmui = new ATMUI();
        atmui.execution();
    }

    public void execution() {
        List<Member> members = new ArrayList<>();
        Member member1 = new Member("Aryan Inamdar", "Bank Of America", 7869341, 7869, 0);
        Member member2 = new Member("Jay Inamdar", "Bank Of America", 5039542, 5039, 0);
        Member member3 = new Member("Jasmina Desai", "Bank Of America", 6874209, 6874, 0);
        Member member4 = new Member("Aditya Verma", "Wells Fargo", 1403769, 1403, 0);
        Member member5 = new Member("Yash Khot", "Wells Fargo", 4370286, 4370, 0);
        Member member6 = new Member("Likith Gadde", "Wells Fargo", 3257904, 3257, 0);
        Member member7 = new Member("Samagra Pandey", "Chase", 5603417, 5603, 0);
        Member member8 = new Member("Aniket Kamat", "Chase", 3934027, 3934, 0);
        Member member9 = new Member("Shayan Halder", "Chase", 8926301, 8926, 0);
        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        members.add(member5);
        members.add(member6);
        members.add(member7);
        members.add(member8);
        members.add(member9);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String nameInput = scan.next();
        for (Member member : members) {
            if (member.getName().contains(nameInput)) {
                AccountValidator accountValidator = new AccountValidator();
                accountValidator.validateAccountDetails(members, member);
                Transaction transaction = new Transaction();
                transaction.makeTransaction(member);
            }
            else {
                System.out.println("Invalid name entered.");
                System.exit(0);
            }
        }
    }
}
