list1=[1,3,2,3,7,1]
list2=[2,3,6,9,3,5,1]
list3=list1+list2
for i in range(0,len(list3)):
    for j in range(i+1,len(list3)):
        if list3[i] >= list3[j]:
            list3[i],list3[j]=list3[j],list3[i]  #Bubble sort algo

print(list3)



