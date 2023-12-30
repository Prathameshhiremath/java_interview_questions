
#printing vowels in given string 
str = "Prathamesh"
words = str.split()
vowels = ['a', 'e', 'i', 'o', 'u']
vowels_list = []
non_vowels_list = []
count=0

for word in words:
    for char in word:
        if char.lower() in vowels:
            vowels_list.append(char)
            count+=1
        else:
            non_vowels_list.append(char)


print(type(vowels_list[0]))
str1=''.join(vowels_list)
str2=''.join(non_vowels_list)
print(str1)
print(count)
print(str2)

#another simple method
s="aeiou"
a=['a','e','i','o','u']
count=0
for i in s:
    if(i in a):
        print(i)
        count+=1

#homework
# rever=[]
# for w in words:
#     rev=""
#     for char in w:
#         rev=char+rev
#     rever.append(rev)

# print(rever)

# str="kjdsdsfds"
# l=str.split()

# for i in l:                 #--------------> in this if we do only iteration of i then kjdsdsfds
#     print(i)
#     for j in i:            # --------------->in this if we do then it will be seperated like k
#         print(j)                                                                             j....