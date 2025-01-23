public class MaxPQ implements  PQInterface{

    private Processor[] heap;
    private int size;

    private  static final int DEFAULT_CAPACITY=5;
    private static final int AUTOGROW_SIZE=5;


    public MaxPQ(){
        this.heap=new Processor[DEFAULT_CAPACITY];
        this.size=0;
    }



    private  void resize(){
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int size(){

    }

    public void insert(Processor){

    }

    public Processor max(){

    }

    public Processor getmax(){

    }
}