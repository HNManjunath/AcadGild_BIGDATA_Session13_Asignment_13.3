package com
import scala.io.StdIn;
class BabylonianSquareRoot {
  /**
   * below Method to return square root of number for the number we passed
   */
  def findSquareRoot(number: Double): Double = {
    var root: Double = 0.0;
    var x = number;
    //Initializing y = 1 as given in problem statement
    var y: Double = 1;
    //e decides the accuracy level
    var e: Double = 0.000001;
    while (x - y > e) {
      //Get the approximation for root using average of x and y
      x = (x + y) / 2;
      //Set y = n/x as given in problem statement
      y = number / x;
    }
    root = x;
    //Rounding off the result to six decimal places
    return BigDecimal(root).setScale(6, BigDecimal.RoundingMode.HALF_UP).toDouble;
  }
}

object mainObj {
  def main(args: Array[String]) {
    var babylon = new BabylonianSquareRoot();
    println("Enter the number to get babylonian square root\n");
    val number = StdIn.readDouble();    //getting user input and pass it to findsquarerootmethod
    //to determine square root of number using babylonian method
    println(" Square root of " + number + " is: "
      + babylon.findSquareRoot(number));
  }
}