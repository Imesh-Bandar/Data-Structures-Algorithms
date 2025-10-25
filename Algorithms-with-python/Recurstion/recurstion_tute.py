def power(x,n):
    #stopping condition not get the non negative integers
    if n==0:
        return 1
    elif n<0:
        return "Error: Exponent should be a non-negative integer."
    else:
        answer= x*power(x,n-1)
        return answer
    

print(power(2,3))  # Output: 8
print(power(5,3))  # Output:0 