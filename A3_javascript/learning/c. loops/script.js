// for loop


//printing 5 numbers
for(let i=1;i<=5;i++){
    console.log(i);
}

//printing 5 numbers in reverse order
let i=5;
while(i>=1){
    console.log(i);
    i--;
}

//printing 5 even numbers using do while loop 
let j=2;
do{
    console.log(j);
    j+=2;
} while(j<=10)

//printing the letters of a string using for-of loop

let str="hello";
for(let i of str){
    console.log(i);
}

//printing the numbers of an array using for-in loop
let arr=[1,2,3,4,5];
for(let i in arr){
    console.log(i);
}