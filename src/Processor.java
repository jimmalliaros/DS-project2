import java.util.List;
import java.util.ArrayList;

public class Processor implements Comparable<Processor>{
    private int id; // id of the Processor
    private List<Job> processedJobs; // list of the jobs

    Processor(int id ){
        this.id=id;
        processedJobs=new ArrayList<Job>();
    }//constructor

    void setId(int id){this.id=id;}//setting the id of the Processor

    int getId(){return id;}//returning the id of the Processor

    void addJob(Job my_job){
        processedJobs.add(my_job);
    }//adding a job to the list

    double getTotalProcessingTime(){
        if(processedJobs.isEmpty()){
            return 0.0;
        }

        else {
            double total_time = 0.0;

            for (Job job : processedJobs) {
                total_time += job.getTime();
            }

            return total_time;
        }



    }//returns the total time of all the jobs that have been processed by this Processor

    public int compareTo(Processor processor){
        if(getTotalProcessingTime()>processor.getTotalProcessingTime()){
            return 1;
        }
        else if (getTotalProcessingTime()<processor.getTotalProcessingTime()) {
            return -1;
        }
        else{
            if(id>processor.getId()){
                return 1;
            }

            else{
                return -1;
            }
        }
    }//implementing the compareTo to method 






}