public class Inspections{
  private Date date;
  private int score;
  private String violation;
  private String risk; 
    
  public Inspection(Date date, int score, String violation, String risk){
    if (date == null || score < 0 || score > 100){
      throw new IllegalArgumentException("Please enter a valid date");
    }

    this.date = date;
    this.score = score;
    this.violation = violation;
    this.risk = risk;
  }

  public void setDate(Date newDate){
    this.date = newDate;
  }

  public void setScore(int newScore){
    this.score = newScore; 
  }

  public void setViolation(String newViolation){
    this.violation = newViolation;
  }

  public void setRisk(String newRisk){
    this.risk = newRisk;
  }
  
  public int getScore(){
    return score;
  }

  public String getViolation(){
    return violation;
  }

   public String getRisk(){
     return risk;
   }

   public Date getDate(){
     return date;
   }
}