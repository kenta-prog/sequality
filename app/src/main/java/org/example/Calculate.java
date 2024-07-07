package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public String sum_and(int x, int y) {
    double ave = (double) (x + y) / 2;
    return "Sum of " + x + " and " + y + " is " + (x + y) + ".Average is " + ave + ".";
  }

  public String sum_to(int x, int y) {
    int sum = 0;
    double ave;
    for (int i = x; i <= y; i++)
      sum += i;
    ave = (double) sum / (y - x + 1);
    return "Sum of " + x + " to " + y + " is " + sum + ".Average is " + ave + ".";
  }

  public String odd_even(int x, int y) {
    int odd = 0;
    int even = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0)
        even += i;
      else
        odd += i;
    }
    return "Sum of odd of " + x + " to " + y + " is " + odd + ".Sum of even is " + even + ".";
  }
}
