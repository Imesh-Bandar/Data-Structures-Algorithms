public class LinkedList {
    // reference to first link
    public Link firstLink;

    // constrctor
    public LinkedList() {
        // assign the first link to null
        this.firstLink = null;
    }

    // check list is empty or not
    public boolean isEmpty() {
        if (firstLink == null) {
            return true;
        } else {
            return false;
        }
        // ===||OR||===
        // return(firstLink==null);
    }

    // insert link at the first position
    public void insertFirst(int data) {
        // create a new link
        Link newLink = new Link(data);
        // point it to old first link
        newLink.next = firstLink;
        // point firstlink to new link
        firstLink = newLink;
    }

    //insert middle
    public void insertMiddle(int key, int data) {
        // create a new link
        Link newLink = new Link(data);
        // start from the first link
        Link currentLink = firstLink;
        // navigate through the list to find the key
        while (currentLink.iData != key) {
            // go to next link
            currentLink = currentLink.next;
            // if it is last link
            if (currentLink == null) {
                System.out.println("Key not found. Insertion failed.");
                return;
            }
        }
        // insert new link after the current link
        newLink.next = currentLink.next;
        currentLink.next = newLink;
    }

    //insert anyware by position
    public void insertAtPosition(int position, int data) {
        // create a new link
        Link newLink = new Link(data);
        // if position is 0, insert at the beginning
        if (position == 0) {
            newLink.next = firstLink;
            firstLink = newLink;
            return;
        }
        // start from the first link
        Link currentLink = firstLink;
        // navigate to the position before the desired position
        for (int i = 0; i < position - 1; i++) {
            // if it is last link before reaching the position
            if (currentLink == null) {
                System.out.println("Position out of bounds. Insertion failed.");
                return;
            }
            currentLink = currentLink.next;
        }
        // insert new link at the desired position
        newLink.next = currentLink.next;
        currentLink.next = newLink;
    }

    // display the list
    public void displayList() {
        System.out.print("List (first-->last): ");
        // start from the first link
        Link currentLink = firstLink;
        // navigate through the list
        while (currentLink != null) {
            // display the link
            currentLink.displayLink();
            // go to next link
            currentLink = currentLink.next;
            System.out.print(" ");
        }
        System.out.println();
    }
    // find a link with given key
    public Link find(int key) {
        // start from the first link
        Link currentLink = firstLink;
        // navigate through the list and check key with data
        while (currentLink.iData != key) {
            // go to next link
            currentLink = currentLink.next;
            // if it is last link
            if (currentLink == null) {
                return null;
            }
        }
        // found it
        return currentLink;
    }
    

    // delete a link with given key
    public Link delete(int key) {
        // start from the first link
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        // navigate through the list and check key with data
        while (currentLink.iData != key) {
            // go to next link
            previousLink = currentLink;
            currentLink = currentLink.next;
            // if it is last link
            if (currentLink == null) {
                return null;
            }
        }
        // found it
        // delete it
        if (currentLink == firstLink) {
            // change firstlink to point to next link
            firstLink = firstLink.next;
        } else {
            // bypass the current link
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }

    //insert link
    


    // delete first link
    public Link deleteFirst() {
        // save reference to first link
        Link linkToDelete = firstLink;
        // change firstlink to point to next link
        firstLink = firstLink.next;
        // return the deleted link
        return linkToDelete;
    }
}
