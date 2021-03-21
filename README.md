# Team09 Spring Boot Project.
By Mehmet Ali Seçgin and Fothul Karim Forhan
___
There's two calculators.

Calculator 1 will do:
* SumOfOdd
* Min
* PowerOf4

Calculator 2 will do:

* Odds
* SumOfOdd
* AverageOfPositives
___
## How to use
>#### Calculator 1
>>Simply, go to
>>- __[localhost:8080/calculator/calculate1?input=1,-2,5](localhost:8080/calculator/calculate1?input=1,-2,5)__
>>to calculate the **sum of odd numbers**, **the minimum number**, 
and **power of 4** of the numbers in the list that you put 
in address bar.

 Returns

{

 "min":-2,

 "sumOfOdds":13,
 
 "powerOfFour":[1,16,625,2401]

}

___
>#### Calculator 2
>>Simply, go to
>>- __[localhost:8080/calculator/calculate2?input=1,-2,5](localhost:8080/calculator/calculate1?input=1,-2,5)__
>>to calculate the **odd numbers**, **sum of odd numbers**, 
    and **Average Of Positives** of the numbers in the list that 
    you put after ```?input=```

Returns:

{

"averageOfPositives":3.0,

"odds":[1,5],

"sumOfOdds":6

}


Start Application in CalculatorApplication.java  
Application runs at: http://localhost:8080  
Swagger UI is accessible: http://localhost:8080/swagger-ui/index.html   
