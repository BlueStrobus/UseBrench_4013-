const arr =[10,20,30,40];
arr.push(50);
console.log(arr);
arr.pop();
console.log(arr);
arr.unshift(0);
arr.shift();
console.log(arr);

arr.forEach(function(v) {
    console.log(v);
});