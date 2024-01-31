//Qsl. Get user to input a number using prompt("Enter a number:"). Check if the number is a multiple of 5 or not.
let number =prompt("Enter a number");

if(number%5==0){
    console.log(number + " is a multiple of 5 ");
}else{
    console.log("not a multiple");
}

// Qs2. Write a code which can give grades to students according to their scores:
// 80-100, A
// 70-89, B
// 60-69, c
// 50-59, D
// 0-49, F

let score = prompt("Enter your score");

if(score>=80 && score<=100){
    console.log("your  is score A");
}else if(score>=70 && score<80){
    console.log("your  is score B");
} else if(score>=60 && score<70){
    console.log("your  is score C");
}else if(score>=50 && score<60){
    console.log("your  is score D");
}else if(score>=0 && score<50){
    console.log("your  is score F");
}