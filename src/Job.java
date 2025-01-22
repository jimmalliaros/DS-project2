public class Job{
    int id; //id of the Job
    int time; //time that takes for the job to be completed

    Job(int Job_id,int time){
        this.id=id;
        this.time=time;
    }//constructor

    void setIdd(int id){this.id=id;} //setting the value of the id

    void setTime(int time){this.time=time;}//setting the value of the time

    int getId(){return id;} //returning the value of the id

    int getTime(){return time;}//returning the value of the time

    String toString(){
        return "Id: "  + id.toString() + " time: " + time.toString();
    }//returning the characteristics of the job



}
