function printInfo(){
    console.log(`웹 브라우저의 너비: ${window.innerWidth}`);
    console.log(`웹 브라우저의 높이: ${window.innerHeight}`);
    console.log(`웹 브라우저 창의 너비: ${window.outerWidth}`);
    console.log(`웹 브라우저 창의 높이: ${window.outerHeight}`);
    console.log(`웹 브라우저 창 위쪽 면과 모니터 사이의 간격: ${window.screenTop}/${window.screen}`);
    console.log(`웹 브라우저 창의 스크롤 가로 위치: ${window.scrollX}`);
    console.log(`웹 브라우저 창의 스크롤 세로 위치: ${window.scrollY}`);
}





function printInfo(){
    window.open('popup.html', "팝업", "windtg=400, height=400, left=100, top=200")
}
// 레프트는 창 위치 지정

function closeparent(){
    window.close();
}