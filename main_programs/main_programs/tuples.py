t1=tuple(input("Enter the first tuple:"))
t2=tuple(input("Enter the second tuple:"))
while True:
	print("1.length of the tuple")
	print("2.index of the tuple")
	print("3.minimum of the tuple")
	print("4.maximum of the tuple")
	print("5.repetition of the tuple")
	print("6.convert tuples into list")
	print("7.combine of the tuple")
	print("8.count a element of the tuple")
	print("9.print last element of tuple")
	print("10.Extract a part of tuple")
	print("11.append")
	print("12.sorting of the tuple")
	print("0.exit")
	ch=int(input("Enter the choice:"))
	if ch==1:
	   print(len(t1))
	elif ch==2:
	   i=int(input("Enter index of the element"))
	   print(t1[i])
	elif ch==3:
	   print(min(t1))
	elif ch==4:
	   print(max(t1))
	elif ch==5:
	   print(t1*2)
	elif ch==6:
	   l=list(t1)
	   print(l)
	elif ch==7:
	   print(t1+t2)
	elif ch==8:
	   i=input("Enter a element to count")
	   print(t1.count(i))
	elif ch==9:
	   print(t1[-1])
	elif ch==10:
	   s=int(input("Enter starting index:"))
	   e=int(input("Enter ending index:"))
	   print(t1[s:e])
	elif ch==11:
	   a = input("Enter the element: ")
	   t1 += (a,)  
	   print(t1)
	elif ch==12:
	   print(sorted(t1))
	else:
	   exit()
