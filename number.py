#CDA4B3JK
#o/p ABCJK32

str="CDA4B3JK"
l=str.split()
alpha1=[]
num=[]
for i in str:
    if i.isalpha():
        alpha1.append(i)
    else:
        num.append(i)

print(''.join(sorted(alpha1)+sorted(num)))