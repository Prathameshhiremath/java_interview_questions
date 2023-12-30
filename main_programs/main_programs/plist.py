l1=list(input("Enter first list:"))
l2=list(input("Enter second list:"))
while True:
	print("1.Append Element")
	print("2.length of list")
	print("3.remove Element")
	print("4.concatenate lists")
	print("5.maximum of a list")
	print("6.minimum of a list")
	print("7.index of a list")
	print("8.reverse of a list")
	print("9.sorting of a list")
	print("10.decreasing of a list")
	ch=int(input("Enter the choice: "))
	if ch==1:
		element = input("Enter the element:")
		l1.append(element)
		print(l1)
	elif ch==2:
		print("length of list:",len(l1))
	elif ch==3:
		element=input("Enter element:")
		if element in l1:
		  l1.remove(element)
		print("l1=",l1)
	elif ch==4:
		print(l1+l2)
	elif ch==5:
		print(max(l1))
	elif ch==6:
		print(min(l1))
	elif ch==7:
		i=int(input("enter index of a element"))
		print(l1[i])
	elif ch==8:
		l1.reverse()
		print("reversed list is: ",l1)
	elif ch==9:
		l1.sort()
		print("sorted list is:",l1)
	elif ch==10:
		l2.sort(reverse=True)
		print("decreasing order of the list is: ",l2)
	else:
	  exit()
