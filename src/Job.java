public class Job{
    int id; //id of the Job
    double time; //time that takes for the job to be completed

    Job(int Job_id,double time){
        this.id=id;
        this.time=time;
    }//constructor

    void setIdd(int id){this.id=id;} //setting the value of the id

    void setTime(double time){this.time=time;}//setting the value of the time

    int getId(){return id;} //returning the value of the id

    double getTime(){return time;}//returning the value of the time

    public String toString(){
        return "Id: "  + Integer.toString(id) + " time: " + Double.toString(time);
    }//returning the characteristics of the job



}
