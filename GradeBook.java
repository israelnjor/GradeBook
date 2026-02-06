import java.util Scanner;

public class GradeBook {

  Scanner input = new Scanner(System.in);
  double score = input.nextDouble("Enter your scores here ");

  private boolean validateScore(double score) {
    return 0 <= score && score <= 100;
  }

  private char calculateLetterGrade(double score) {
    if (score > 90) return 'A';
    else if (score > 80) return 'B';
    else if (score > 70) return 'C';
    else if (score > 60) return 'D';
    else if (score > 50) return 'E';
    else return 'F'
  }
}
