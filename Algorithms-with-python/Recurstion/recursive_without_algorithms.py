#define the function for calculate the factorial of a number
def factorial_of_the_number(number_of_factorial):#(5):


#Steps to calculate the factorial of a number without using recursion

    #1. define the variable to store the index of the number that equals to the number of factorial
    #2. define the answer variable to store the factorial value that equals to the number of factorial
    #3. while the index value is greater than 1(stooping condition/base condition)
    #4. decrease the index value by 1
    #5. calculate the factorial value by multiplying the answer variable with the decreased index value
    #6. update the index value with the decreased index value
    #7. return the answer variable
    
#---------------------|Implementation area of the code|---------------------#

    # index of the number
    index_of_number=number_of_factorial#(5)

    # answer variable to the store the factorial value
    answer_Of_factorial=number_of_factorial#(5)

    #loop to the calculate of the fatorial value
    
    while(index_of_number>1):#(5>1)true(stooping condtion /base condition)

        #decresing the index value by 1
        discrese_index_of_number=index_of_number-1#(5-1=4)

        #---calculate the factorial value----#
        #answer_Of_factorial=5*4
        answer_Of_factorial=answer_Of_factorial*discrese_index_of_number

        #updating the index value
        index_of_number=discrese_index_of_number#(4)

        #return the factorial value
    return answer_Of_factorial




 #------------------|Implementation area of the code|---------------------#



#-------------------|caller area of the code|-------------------#

#calling the function and print the factorial value
print(factorial_of_the_number(55))

#-------------------|caller area of the code|-------------------#

