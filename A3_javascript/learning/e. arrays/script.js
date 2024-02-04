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