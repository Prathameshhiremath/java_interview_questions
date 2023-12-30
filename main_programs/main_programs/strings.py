n1=input("Enter the first string")
n2=input("Enter the second string")
while True:
	print("1.length of the string")
	print("2.string into uppercase")
	print("3.string into lowercase")
	print("4.reverse of the string")
	print("5.string into tuple")
	print("6.count the number of letters")
	print("7.maximum of the string")
	print("8.minimum of the string")
	print("9.split of the string")
	print("10.concatenation of the string")
	print("11.replace character")
	print("12.title of the string")
	ch=int(input("Enter your choice:"))
	if ch==1:
	   print(len(n1))
	elif ch==2:
	   print(n1.upper())
	elif ch==3:
	   print(n1.lower())
	elif ch==4:
	   txt=n1[::-1]
	   print(txt)
	elif ch==5:
	   print(tuple(n1))
	elif ch==6:
	   print(n1.count("p"))
	elif ch==7:
	   print(max(n1))
	elif ch==8:
	   print(min(n1))
	elif ch==9:
	   print(n1.split())
	elif ch==10:
	   print(n1+n2)
	elif ch==11:
	   print(n1.replace("b","a"))
	elif ch==12:
	   z=n1.title()
	   print(z)
	else:
	   exit() 
