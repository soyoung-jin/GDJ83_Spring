/**
 * 
 */
 
const btn = document.getElementById("btn");

const nickname = document.getElementById("id");
const phone = document.getElementById("phone");
const pw = document.getElementById("pw");
const pwCheck = document.getElementById("pwCheck");
const userName = document.getElementById("name");
const ssNum = document.getElementById("ssNum");
const email = document.getElementById("email");

const ch =document.getElementsByClassName("ch");
const form = document.getElementById("form");

const pwError = document.getElementById("password-error");
const pwEqError = document.getElementById("password-eqerror");

pwCheck.addEventListener("blur", function(){
    pwEqError.innerHTML = "";
   
    if(pw.value != pwCheck.value){
        pwEqError.innerHTML = "password가 일치하지 않음";
        pwCheck.value = "";
        return;
    } 
});


// 강사님 방식 1
// focus() : 입력대기 상태
btn.addEventListener("click", function(){
    pwError.innerHTML = "";

    if(nickname.value == ""){
        alert("id값 필수");
        nickname.focus();
        return;
    }

    if(pw == "" ){
        pwError.innerHTML = "Password는 필수 입력 입니다";
        pwError.focus();
        return;
    };

    if(pw == "" || pw.value.length < 6){
        pwError.innerHTML = "Password는 6글자 이상 입니다";
        pwError.focus();
        return;
    };
    console.log("@@@@@@");
    if(pw.value != pwCheck.value) {
        pw.value = pwCheck.value
        console.log("비번확인");
    }

});


// 강사님 방식 2
// btn.addEventListener("click", function(){
//     const checks = [false,false,false,false,false];
//     for(let i=0; i<ch.length; i++){
//         if(ch[i].value != ""){
//             checks[i] = true;
//         };
//     }
//     let result = true;
//     for(let c of checks){
//         if(!c){
//             result = false;
//         };
//     };
//     if(result){
//         alert("성공");
//         form.submit();
//     }else {
//         alert("실패");
//     }
// });

// btn.addEventListener("click", function(){
//     let v = nickname.value;

    
//     if(v == "") {
//         alert('ID 입력필수');
//         return false;
//     } else if ( phone.value == "") {
//         alert('Phone 입력필수');
//         return false;
//     } else if ( pw.value == "") {
//         alert('Pw 입력필수');
//         return false;
//     } else if ( userName.value == "") {
//        alert('Name 입력필수');
//        return false;
//     } else if ( ssNum.value == "") {
//         alert('주민번호 입력필수');
//         return false;
//     } else if ( email.value == "") {
//         alert('이메일 입력필수');
//         return false;
//     } return alert(" 회원가입 성공");
    
// });
