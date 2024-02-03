//String is a sequence of characters used to represent text

//string
let name = "vijaya";
console.log(name);

//String length
let name1 = "vijaya";
console.log(name1.length);

//String indices
let name2 = "vijaya";
console.log(name2[0]);

//escape sequence
console.log("this is a escape sequence \n this came to next line ");

//String methods 
//upperCase
let name4 = "vijaya";
console.log("upperCase" + name4.toUpperCase());
//lowerCase
let name5 = "vijaya";
console.log("lowerCase" + name5.toLowerCase());
//trim
let name6 = "     vijaya ";
console.log("before trim" + name6 + "after trim" + name6.trim());
//slice
let name7 = "vijaya";
console.log("slice" + name7.slice(2,4)); // 4 index value will not be included
//replace 
let name8 = "vijaya";
console.log(name8.replace("jaya","bha"))
//charAt
let name9 = "vijaya";
console.log("charAt : " + name9.charAt(2));

//Qsl. Prompt the user to enter their full name. Generate a username for them based on the input.
//Start username with @, followed by their full name and ending with the fullName length.
let name10 = prompt("Enter your name");
alert(`your username is @${name10}${name10.length}`);

