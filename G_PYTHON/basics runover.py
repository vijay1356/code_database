print("hello world")  # hello world program

# use # for comments

# by doing this u can print even the double quotes
print("hey \"vijay\" vitthal")

# input & output
a = input("enter your name :")
print("my name is ", a)

# how to force print the sum of two numbers
a = input("Enter the 1st number : ")
# if u use too much of your brain and type a number it will throw an error
b = input("enter the second number : ")
print(a+b)
print(int(a)+int(b))

# every string is like an array of char
a = "harry"
print(a[0])

# u cant write an string in multiline directly u can use the """__""" for it
print("""hello
    bro""")

#for loop 
for character in a:
    print(character)

# print only half or up to an index slicing 
a="apple is a fruit"
print(a[0:7])
print(a[:-3]) #python interpreter considers -3 here as len(a)-3
