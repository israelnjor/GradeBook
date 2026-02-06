import java.util.Scanner;

public class GradeBook {  

  private boolean validateScore(double score) {
    return 0 <= score && score <= 100;
  }

  private char calculateLetterGrade(double score) {
    if (score >= 90) return 'A';
    else if (score >= 80) return 'B';
    else if (score >= 70) return 'C';
    else if (score >= 60) return 'D';
    else if (score >= 50) return 'E';
    else return 'F';
  }

  private void displayGradeMessage(char grade) {
    switch(grade) {
      case 'A': System.out.println("Grade: " + grade + "\nExcellent!"); return;
      case 'B': System.out.println("Grade: " + grade + "\nGood job!"); return;
      case 'C': System.out.println("Grade: " + grade + "\nFair Effort!"); return;
      case 'D': System.out.println("Grade: " + grade + "\nYou can do better"); return;
      case 'E': System.out.println("Grade: " + grade + "\nPoor Performance");
      case 'F': System.out.println("Grade: " + grade + "\nFAILLED. Try again, but this Time with GOD"); return;
      default: System.out.println("Oops. Unknown Result"); break;
    }       
  }
  public void executeGradeResult(double score) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your scores here: ");
    score = input.nextDouble();

   //  validateScore(score) {
      if (!validateScore(score)) {
         System.out.println("Invalid input. Try again.");
         return;
      }
    
    
    char grade = calculateLetterGrade(score);

    displayGradeMessage(grade);
   }

  public static void main(String[] args) {
    GradeBook Israel = new GradeBook();
    Israel.executeGradeResult(99);
  }
}
