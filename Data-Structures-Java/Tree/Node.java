public class Node {
    public int iddata;
    public double dData;
    public Node leftChilNode;
    public Node rightChilNode;

    public Node(int id,double dData) {
        this.iddata = id;
        this.dData = dData;
        this.leftChilNode = null;
        this.rightChilNode = null;    
    }

    // display node data
    public void displayNode() {
        System.out.print("{");
        System.out.print(iddata);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

}
