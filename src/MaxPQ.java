public class MaxPQ implements  PQInterface{

    private Processor[] heap; //with start from position 1
    private int size;

    private  static final int DEFAULT_CAPACITY=5;
    private static final int AUTOGROW_SIZE=5;


    public MaxPQ(){
        this.heap=new Processor[DEFAULT_CAPACITY];
        this.size=0;
    }



    private  void resize(){
        Processor[] newHeap=new Processor[heap.length + AUTOGROW_SIZE];

        for(int =0; )
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int size(){
        return size;
    }

    public void insert(Processor x){//Inserts the Processor x in the heap
            if(size== heap.length-1){
                resize();
            }//Checks if there is available space ,if not it resizes the heap

            heap[++size]=x;//inserts the element in the heap

            swim(size);//lets the newly added element swim
    }

    public Processor max(){

    }

    public Processor getmax(){

    }

    //function that helps swim the items to the top
    private void swim(int i){
        if(i==1){
            return;
        }//if i is root then do nothing

        int parent=i/2;//finds the parent of the element

        //compare parent child with parent i
        while(i!=1 && heap[i].compareTo(heap[parent])){
            swap(i,parent);
            i=parent;
            parent=i/2;
        }


    }

    private void swap(int i,int j){
        Processor temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }//function that helps swap two elements



}