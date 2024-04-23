import java.util.ArrayList;
public class StepTracker
{
private int minSteps, totalSteps, totalDays, activeDays;

 public void StepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  totalDays = 0;
  activeDays = 0;
 }

 public void addDailySteps(int numSteps){
  totalSteps = totalSteps + numSteps;
  totalDays++;
  if(numSteps >= minSteps){
   activeDays++;
  }
 }

 public int activeDays(){
  return activeDays;
 }

 public double averageSteps(){
  if(totalDays == 0){
   return 0.0;
  } else{
     return (double)totalSteps/totalDays;
  }
 }
 
} 
