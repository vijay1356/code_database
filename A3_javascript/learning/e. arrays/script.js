let marks = [10,20,30,40,50,60,70,80,90,100];
let sum=0;
for(let i of marks){
    sum+=i;
    console.log(i);
}
let avg=sum/marks.length
console.log(`the average value of the marks obtained is ${sum/marks.length}`);