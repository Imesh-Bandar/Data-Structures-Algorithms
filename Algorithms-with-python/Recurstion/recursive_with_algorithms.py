#Recurstion means a function calling itself untile the base condition is fulfilled

#--Rules of recursion--
    #should have a  caller 
    #should have a recursive call
    #should have a stopping condition(base condition)


## steps to calculate the factorial of a number using recursion
#1. define the function to calculate the factorial of a number
#2. define the stopping condition/base condition
#3. define the recursive call and send it parameter number of factorial decreased by 1
#4  and return the factorial value

#---------------------|Implementation area of the code|---------------------#
def factorial_of_the_number_with_recursion(number_of_the_factorial):#(5)
    #stopping condition/basecondion
    if(number_of_the_factorial==1):#(5==1)false
        return 1
    else:
        #recursive call
        #5*factorial_of_the_number_with_recursion(4) ||5*4!
        return  number_of_the_factorial*factorial_of_the_number_with_recursion(number_of_the_factorial-1)
    
#---------------------|Implementation area of the code|---------------------#


#-------------------|caller area of the code|-------------------#


#calling the function and print the factorial value
print(factorial_of_the_number_with_recursion(5))#change the number to calculate


#-------------------|caller area of the code|-------------------#