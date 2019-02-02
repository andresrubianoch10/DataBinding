import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static boolean isPalindrome(String word) {
        // Please write your code here.
        char[] newArray = word.toCharArray();
        int i1 = 0;
        int i2 = newArray.length - 1;

        while (i2 > i1) {
            if (newArray[i1] != newArray[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(MainClass.isPalindrome(word));
    }
}

//    public static void main(String[] args) {
//        ContactManager manager = new ContactManager();
//
//        Contact contact1 = new Contact("Name 1", "email 1", "3024245135");
//        manager.addContact(contact1);
//
//        Contact contact2 = new Contact("Name 2", "email 2", "3202212311");
//        manager.addContact(contact2);
//
//        Contact contact3 = new Contact("Name 3", "email 3", "3192212211");
//        manager.addContact(contact3);
//
//        System.out.println(manager.searchContact("Name 3").getPhoneNumber());
//
//        List<Contact> contactList = new ArrayList<>();
//        contactList.add(contact1);
//        contactList.add(contact2);
//        contactList.add(contact3);
//
//        Collections.sort(contactList);
//
////        System.out.println("Enter your address: ");
////        Scanner scanner = new Scanner(System.in);
////        String address = scanner.nextLine();
//        for (Contact contact : contactList) {
//            System.out.println(contact.toString());
//        }
//    }
//}
