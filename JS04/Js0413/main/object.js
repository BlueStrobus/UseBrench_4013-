const person ={
    name:{
        firstName: "Gildong",
        lastName:"Hong"
    },
    age:28,
    isAdult:true,
    printInfo:function(){
        console.log(person);

    }
};

person.name.lastName = "kim";
person.age =10;
person.like ="apple","samsung"; 
// 없는건 그냥 추가하면됨
//있는거 없엘수도 있음
delete person.firstName;
console.log(person);