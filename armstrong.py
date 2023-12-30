num=153
t=num

# c=0
# while(num>0):
#     r=num%10
#     print(r)
#     num=num//10  #in this // used for division
#     print("jbdxha",num)
#     c=c+(r*r*r)

# if (c==t):
#     print("Arms")
# else:
#     print("not")

c=0
while(num>0):
    r=num%10
    num=num//10
    c=c+(r*r*r)

if(c==t):
    print("Arms")
else:
    print("no")
