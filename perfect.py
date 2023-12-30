# num=6


# def perfect(num):           #optional
#  sum=0
#  for i in range(1,num):
#     if num%i==0:
        
#         sum=sum+i
#  if num==sum:
#     print("Perfect")
#  else:
#     print("not")

# perfect(num)                 #optional

#working ex 6 is perfect becz it is divisible by 1,2,3 and 6 but here we have to exclude 6 for perfect no so
#1+2+3=6 it is perfect

# num=8
sum=0
for i in range(1,100):
 for j in range(1,i):
    if i%j==0:
        sum=sum+i
if sum==j:
        print("Perfect Numbers are")
else:
        print("not perfect")
    