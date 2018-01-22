
var input = "Hello World"
var input1 = true
var input2 = 3
var input3 = 5.5
var part1 = "Ha"
var part2 = "llo"
var letter1 = 'a'
var letter2 = 'e'
var int1 = 7
var int2 = 9

def stringFunction (s:String):Unit = println(s)
stringFunction(input)

def returnFunction (): String = "Hello World"
println(returnFunction())

def typeInferenceFunction(input: Any) = input
println(typeInferenceFunction(input1))
println(typeInferenceFunction(input2))
println(typeInferenceFunction(input3))

def subStringFunction(word:String, number: Int):String = word.substring(word.length-number)
println(subStringFunction("Hello",4))

def concatAndReplace(part1:String, part2:String, letter1:Char, letter2:Char):String
= part1.replace(letter1,letter2).concat(part2)
println(concatAndReplace(part1,part2,letter1,letter2))

def operators(int1: Int, int2: Int):Int = int1+int2
println(operators(int1,int2))

def conditionals(int1: Int, int2:Int, bool: Boolean): Int =
  if(bool == false)
    int1+int2
else
    int1*int2
println(conditionals(int1,int2,input1))

def conditionalsTwo(int1: Int, int2:Int, bool: Boolean): Int =
  if(int1 == 0 && int2 == 0)
    int1
  else if(int1 == 0)
    int2
  else if(int2 == 0)
    int1
  else if(bool == false)
    int1+int2
  else
    int1*int2
println(conditionalsTwo(0,int2,input1))

def iteration(word:String,number:Int): Unit= for(i <-1 to number) println(word)
println(iteration("Revan",5))

def iterationTwo(word:String,number:Int): Unit= {
  for (i <- 1 to number){ println(word * number)}
//  for (j <- 2 to number){println()}
}
print(iterationTwo("H",4))

def  iterationThreeFizzBuzz(number:Int, fizz:String, buzz:String): Unit =
for(i <- 1 to number)
  if (i % 3 == 0 && i % 5 == 0) println((fizz.concat(buzz)))
  else  if (i % 3 == 0) println(fizz)
  else if (i % 5 == 0) println(buzz)
  else println(i)
print(iterationThreeFizzBuzz(15,"Fizz","Buzz"))

def recursion(word:String,number:Int, count: Int): Unit={
  println(word)
  if (count < number) recursion(word,number,count+1)
}
println(recursion("Revan",5,0))

def recursionTwo(word:String,number:Int,count:Int): Unit= {
  println(word * number)
  if (count < number) recursionTwo(word,number,count+1)
}
print(recursionTwo("H",4,0))

def  recursionThreeFizzBuzz(number:Int, fizz:String, buzz:String, count: Int): Unit = {
  if (count % 3 == 0 && count % 5 == 0) println((fizz.concat(buzz)))
  else if (count % 3 == 0) println(fizz)
  else if (count % 5 == 0) println(buzz)
  else println(count)
  if (count < number) recursionThreeFizzBuzz(15,"Fizz","Buzz",count+1)

}
print(recursionThreeFizzBuzz(15,"Fizz","Buzz",0))

def patternMatchingOneA(setting: Boolean,input1: Int, input2: Int ): Int
= setting match{
case true => input1+input2
case false => input1*input2
}
println(patternMatchingOneA(true,3,3))
println(patternMatchingOneA(false,3,3))

def patternMatchingOneB(setting: Boolean,input1: Int, input2: Int )
=(input1,input2,setting) match{

    case(0,_,_)=> input2
    case(_,0,_)=> input1
    case(0,0,_)=> 0
    case ( _, _ , true)=> input1+input2
    case (_, _ , false)=> input1*input2



}
println(patternMatchingOneB(true,3,3))
println(patternMatchingOneB(false,3,3))
println(patternMatchingOneB(true,0,3))
println(patternMatchingOneB(false,3,0))
println(patternMatchingOneB(false,0,0))

def swapper(number1:Int, number2:Int) = (number1,number2) match{
  case _ => (number2, number1)
}
println(swapper(1,2))



