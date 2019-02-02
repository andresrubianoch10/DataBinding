class ContactManager {

    private Contact[] myFriends;
    private int friendsCount;

    public ContactManager() {
        friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact) {
        if (contact == null) return;
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {

        for (Contact contact : myFriends) {
            if (contact.getName().equals(searchName)) {
                return contact;
            }
        }

        return null;
    }
}
