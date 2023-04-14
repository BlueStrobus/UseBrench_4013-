let num =10;


//깊은 복사
let copyNum =num;
// num이랑 copynum이 다른 곳에 저장 -> 10이 2개 저장

num=220;
console.log(copyNum,num);

let person = { name:"gill"};
person ={name:"hong"};
console.log(person);