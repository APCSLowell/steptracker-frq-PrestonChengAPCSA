import java.util.ArrayList;
public class StepTracker
{
private int minSteps, totalSteps, totalDays, actDays;

 public void StepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  totalDays = 0;
  actDays = 0;
 }

 public void addDailySteps(int numSteps){
  totalSteps = totalSteps + numSteps;
  totalDays++;
  if(numSteps >= minSteps){
   actDays++;
  }
 }

 public int activeDays(){
  return actDays;
 }

 public double averageSteps(){
  if(totalDays == 0){
   return 0.0;
  } else{
     return (double)totalSteps/totalDays;
  }
 }
 
} 
