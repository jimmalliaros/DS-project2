import java.io.*;
import java.util.*;

public class Greedy{
    public static void main(String[] args) throws FileNotFoundException{
        String path="practise.txt";
        Scanner filescanner =new Scanner(new File(path));

        Processor P1=new Processor(1);
        Processor P2=new Processor(2);
        Processor P3=new Processor(3);
        PQInterface max_queue=new MaxPQ();
        int processors=0;
        int jobs=0;

        int flag=1;

        while(filescanner.hasNextLine()){
            String my_line=filescanner.nextLine();
            Scanner linescanner=new Scanner(my_line);
            int counter=0;
            if(flag==1){

                processors=Integer.parseInt(linescanner.nextLine());
                System.out.println(processors);
                flag++;
            }


            else if(flag==2){
                jobs=Integer.parseInt(linescanner.nextLine());
                System.out.println(jobs);
                flag++;
            }

            else{
                int pointer=1;
                Job job;
                int id;
                double time;
                while(linescanner.hasNext()){
                    String next =linescanner.next();
                    if(pointer==1){
                       id=Integer.parseInt(next);
                        pointer++;
                    }

                    else{
                        time=Double.parseDouble(next);
                    }
                }

                job=new Job(id,time);

            }
        }
    }
}