const random = Math.random();
console.log(random);

function getMaxRandom(min,max){
    min = max-1;
    return Math.floor(Math.random() *(max-min)+1+min)
}
console.log(getMaxRandom(10,40));