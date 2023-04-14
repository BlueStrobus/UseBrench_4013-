let num =10;


//깊은 복사
let copyNum =num;
// num이랑 copynum이 다른 곳에 저장 -> 10이 2개 저장

num=220;
console.log(copyNum,num);


//얕은 복사
// let person = { name:"gill"};
// person ={name:"hong"};
// console.log(person);
//const는 안되고 let는 됨

const person = { name:"gill"};  //주소저장
person.name="hong";
console.log(person);