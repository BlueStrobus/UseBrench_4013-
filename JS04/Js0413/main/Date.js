const date1 = new Date("2022-12-23");
const date2 = new Date("2022-12-25");
const dateDiff = date2.getTime() - date1.getTime();
const includes =dateDiff / (24*60*60*1000);
console.log(`두 날짜의 차이는 ${includes}일 입니다.`)






// const dateFormet = `${date.getFullYear()}-${date.getMonth()}-${date.getDate()}`
// console.log(date);