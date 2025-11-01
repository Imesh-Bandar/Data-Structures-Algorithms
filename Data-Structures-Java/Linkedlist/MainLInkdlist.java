public class MainLInkdlist {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertMiddle(44, 55); // Insert 55 after 44
        theList.insertAtPosition(2, 33); // Insert 33 at position 2
        theList.insertMiddle(85, 0);

        theList.displayList();

        Link f = theList.find(44);
        if (f != null) {
            System.out.print("Found link with key " + f.iData + "\n");
        } else {
            System.out.print("Can't find link\n");
        }

        Link d = theList.delete(66);
        if (d != null) {
            System.out.print("Deleted link with key " + d.iData + "\n");
        } else {
            System.out.print("Can't delete link\n");
        }

        theList.displayList();
    }
}
