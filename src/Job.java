public class Job{
    int id;
    int time;

    Job(int Job_id,int time){
        this.id=id;
        this.time=time;
    }

    void setIdd(int id){this.id=id;}

    void setTime(int time){this.time=time;}

    int getId(){return id;}

    int getTime(){return time;}

    String toString(){
        return "Id: "  + id.toString() + " time: " + time.toString();
    }

    

}
