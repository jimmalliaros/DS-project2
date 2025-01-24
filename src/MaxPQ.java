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

        for(int i =1; i<=size; i++ ){
			newHeap[i]=heap[i];
		}
		
		heap=newHeap;
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

    //We get the item with maximum priority without removing it.
    public Processor max(){
        if(isEmpty()){
            return null;
        }

        return heap[1];
    }

    public Processor getmax(){
            if(isEmpty()){
                return null;
            }

            //We replace the root with the element with the smallest priority
            Processor root=heap[1];
            heap[1]=heap[size];
            size--;

            //We sink the new root element
            sink(1);

            return root;



    }

    //function that helps swim the items to the top
    private void swim(int i){
        if(i==1){
            return;
        }//if i is root then do nothing

        int parent=i/2;//finds the parent of the element

        //compare parent child with parent i
        while(i!=1 && heap[i].compareTo(heap[parent])>0){
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

    private void sink(int i){
        int left=2*i;
        int right=left+1; //we determine the children

        if(left>size){
            return;
        }//if 2*i then the node is a leaf and we do nothing

        while(left<=size){
            int max=left;
            if(right<=size){
                if(heap[left].compareTo(heap[right])<0){
                    max=right;//if the right child has bigger priority then
                    //max is right
                }

            }
            if(heap[i].compareTo(heap[i])>=0){
                return;
            }//if parent bigger than child then stop.Else swap the two elements

            else{
                swap(i,max);
                i=max;
                left=i*2;
                right=left+1;
            }


        }
    }

}