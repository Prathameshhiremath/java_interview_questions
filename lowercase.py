print(ord("A"))#-->65
print(chr(65))#--->A

string="PRATHaMESH"
list=string.split()
print(list)
list1=[]
list2=[]
for word in list:
    for char in word:
       
       #ord("B")--->66 in character of lowercase chr(66)-->"B"
       #so here if we add 32 then "A"--->"a" is 32 difference so "A" +32 --->"a"
        list1.append(chr(ord(char)+32))
        # if char.isupper():                        if they say only do capital letters who is small

        #     list1.append(chr(ord(char)))
        # else:
        #     list1.append(chr(ord(char)-32))
        
print(list1)
# s=''.join(list1)
# print(s)
#string1=''.join(list1)
#print(string1)

s="Prathamesh"
s1=[]
for i in s:
    if i.isupper():
        s1.append(i.lower())
    else:
        s1.append(i.upper())

a=''.join(s1)
print(a)

