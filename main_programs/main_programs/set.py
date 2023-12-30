#def set_operations():
s1=set(input("Enter First set: "))
s2=set(input("Enter Second set: "))
	#s1 = set(s1.split())
	#s2 = set(s2.split())
while True:
	print("1.add element")
	print("2.intersection of sets")
	print("3.union of sets")
	print("4.symmetric difference of sets")
	print("5.convert sets into lists")
	print("6.if set1 is superset of set2")
	print("7.if set1 is subset of set2")
	print("8.disjoint of sets")
	print("9.length of a set") 
	print("10.convert set into list")
	print("11.difference of sets")
	print("12.equivalence check")
	ch=int(input("Enter the choice:"))
	if ch==1:
		element=input("Enter element:")
		s1.add(element)
		print(s1)
	elif ch==2:
		print(s1 & s2)
	elif ch==3:
		print(s1 | s2)
	elif ch==4:
		print(s1 ^ s2)
	elif ch==5:
		l=list(s1)
		print(l)
	elif ch==6:
		print(s1>=s2)
	elif ch==7:
		print(s1<=s2)
	elif ch==8:
		s3=s1.isdisjoint(s2)
		print(s3)
	elif ch==9:
		print(len(s1))
	elif ch==10:
		l=list(s1)
		print(l)
	elif ch==11:
		print(s1-s2)
	elif ch==12:
		print(s1==s2)
	else:
	   exit()
