def prime(num):
    if num<=1:
        return False
    for i in range(2,num):
        if num%i==0:
            print("No prime")
    return True



num1=int(input("enetr 1 number"))
num2=int(input("enter 2nd number"))
if prime(num1) and prime(num2):
    
    if abs(num1-num2)==2:#(abs)to give positive value
        print("Both are twin prime numbes ")
    else:
        print("Please check")
else:
    print("sorry wrong number")