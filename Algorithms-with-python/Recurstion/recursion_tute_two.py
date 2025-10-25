#sum(n) = 1+ 2 + 3 + 4 .........+ n

def sum_of_the_number(final_number):
    #stopping condition/basecondition
    if final_number==1:
        return 1
    else:
        return final_number+sum_of_the_number(final_number-1)
    

print(sum_of_the_number(5))  # Output: 15
print(sum_of_the_number(10))  # Output: 55