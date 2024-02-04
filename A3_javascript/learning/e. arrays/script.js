//input the names of th 5 students

let names= [];

for(let i=0;i<5;i++){
    names[i]=prompt("enter name");
}

console.log(names);

//Qs. For a given array with marks of students -> [85, 97, 44, 37, 76, 601
//Find the average marks of the entire class.

let marks = [10,20,30,40,50,60,70,80,90,100];
let sum=0;
for(let i of marks){
    sum+=i;
    console.log(i);
}
let avg=sum/marks.length
console.log(`the average value of the marks obtained is ${sum/marks.length}`);

//Qs. For a given array with prices of 5 items -> [250, 645, 300, 900, 501
// All items have an offer of 10% OFF on them. Change the array to store final price after
// applying offer.

let price = [];

for(let i = 0;i<5 ; i++){
    price[i]=prompt("enter the marks of "+ (i+1) + " student");
    price[i]=price[i]-price[i]*0.1;
    }

    console.log(price);

