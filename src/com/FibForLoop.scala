package com

object FibForLoop {
  def fibonacci(userInput: Int): Unit = {
    var temp1, temp2 = 1;
    var result = 0;
    
    for(i <- 3 to userInput){
      result = temp1 + temp2;
      temp1 = temp2;
      temp2 = result;
      i + userInput;
    }
    
    println("Nth no. of " + userInput + " using 'FOR' loop is : " + result);
  }

  def main(args: Array[String]) {

	  // Taking input from user
    print("Enter a Number to find the Nth number in the fibonacci sequence : ");
    val userInput = scala.io.StdIn.readInt();
    
    if(userInput == 1){
      println("Nth no. of" + userInput + " using 'FOR' loop is : 1");
    } else if(userInput == 2){
      println("Nth no. of" + userInput + " using 'FOR' loop is : 1");
    } else if(userInput > 2){
        fibonacci(userInput);
    }
  }
}