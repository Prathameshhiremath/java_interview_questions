def fibo():
    first,second=0,1
    while True:
        yield first # it will print 0 
        first,second=second,first+second

g=fibo()
for i in g:
    if(i>=10):
        break
    print(i)


# The return statemet is used to  immediate exit  a function  and return  a value  to the caller .
# The yield  statemet  is used  in generator  function  to produce  avlue to  the caller
#  but it doesnt  imediate terminate the funfction execution
# Insteda it temporary susupeme=nd function and saves  its state