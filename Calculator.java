public class Calculator {

  private double result;

  public Calculator() {
    // constructor
  }

  public Calculator(double result) {
    this.result = result;
  }

  public void add(double ... params) {
    for (double param : params) {
      this.result += param;
    }
  }

  public void  sub(double ... params) {
    for (double param : params) {
      this.result -= param;
    }
  }

  public void  mul(double ... params) {
    for (double param : params) {
      this.result *= param;
    }
  }

  public double getResult() {
    return result;
  }

  public void cleanResult() {
    result = 0.0;
  }
}
