#using built

str1="sky is blue1"
mylist=str1.split()
print(mylist)
mylist2=(mylist[::-1])
str2=" ".join(mylist2)
print(str2)

#not using built
str3="Hello is gret debhwjb"
mlist=str3.split()
l=[]
print(mlist)
for i in range(len(mlist)-1,-1,-1):
    l.append(mlist[i])

mlist2=" ".join(l)
print(mlist2)

#i/p python is easy
# o/p nohtyp si ysae
#using bulit in
str="python is easy"
l=str.split()
print(l)
l2=[]
for i in l:
    l2.append(i[::-1])

l3=' '.join(l2)
print(l3)

# str = "python is easy"
# l = str.split()


# l2 = []
# for word in l:   #p comes  in word  | 2ns step y  came 
#     reversed_word = "" #firstly store empty set and after it append  <--| (stores p) | yp stores |here as like this happen  
#     for letter in word: #here also p comes in word | here y came        |
#         reversed_word = letter+reversed_word   # p+"" --> p | y+p-yp    |              
       
#     l2.append(reversed_word)


# l3 = ' '.join(l2)
# print(l3)
s="Python is easy"
l=s.split()
l1=[]
for word in l:
    rev=""
    for char in word:
        rev=char+rev
    l1.append(rev)

s=''.join(l1)
print("Reverse",s)


#New using while
name="Prathamesh"
count=len(name)
rev=""
while count>0:
    rev=rev+name[count-1]
    count=count-1

print(rev)  

#using for
name="prathamesh"
rev=""
for char in name:
    for l in char:
     rev=l+rev   #if we do rev+char then Prathamesh will be the answer
print(rev)

#i/p=a3b2c4
#o/p=aaaabbcccc


str="a3b2c4"
output=""
for i in str:
    if i.isalpha():   #it checks it is alpha or not if alpha then it assign to var variable
        var=i
    else:
        num=var*int(i) #here multiplies with integer with var 
        output=output+num

print(output)