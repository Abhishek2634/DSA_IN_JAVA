package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    public static class job{
        int idx;
        int deadline;
        int profit;
        public job(int i ,int d,int p){
            this.idx = i;
            this.deadline = d;
            this.profit = p;
        }
    }
    public static void main(String[] args) {
        //Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.it is also given that every job takes a single unit of time,so the minimum possible deadline for any job is 1.Maxmize the total profit, if only one job can be scheduled at a time.
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs  = new ArrayList<>();
        for(int i = 0; i < jobInfo.length;i++){
            jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1]));
        }


        Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit); // objects are sorted descending in terms of profit.
        ArrayList <Integer> ls = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                time++;
                ls.add(curr.idx);
            }
        }
        for(int i = 0; i < ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}
