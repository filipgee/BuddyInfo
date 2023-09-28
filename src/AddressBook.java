import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
    //HELLO added on github

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy); //hello
        addressBook.removeBuddy(buddy);
        System.out.println("New text for new branch");
    }
}
