package com

object FibRecursion {
  def fibonacci(userInput: Int): Int = {
    if (userInput == 1 || userInput == 2) {
      return 1;
    } else {
      return fibonacci(userInput - 1) + fibonacci(userInput - 2);
    }
  }

  def main(args: Array[String]) {
    // Taking input from user
    print("Enter a Number to find the Nth number in the fibonacci sequence : ");
    val userInput = scala.io.StdIn.readInt();

    println("Nth no. of " + userInput + " using 'RECURRSION' loop is : "
      + fibonacci(userInput));
  }
}