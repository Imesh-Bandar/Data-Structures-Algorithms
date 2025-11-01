public class Link {
    //item of the hold data
    public int iData;
    //reference to next link
    public Link next;

    //constructor
    public Link(int data){
        this.iData=data;
    }


    //display the link
    public void displayLink()
    {
        System.out.print(iData);
    }

    
}