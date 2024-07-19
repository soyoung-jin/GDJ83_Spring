const fileAdd = document.getElementById("fileAdd");
const result = document.getElementById("result");

// 부모의 id값으로 사용
let idx=0;

//최대 첨부파일 갯수 조정
let max=1;
//만든 횟수
let count =0;

function setMax(m) {
    max = m;
}

result.addEventListener("click", function(e){
    if(e.target.id == 'x'){
        // e.target.parentNode.parentNode.remove();
        //parentNode가 빈공백이 있을때 정확하지 않을수가있다. 

        // 그래서 확실하게 지우려면 부모의 id를 알아내서 지우는게 좋다
        let ids = e.target.getAttribute("data-del-id");
        document.getElementById(ids).remove();
        count--;

    };
});

fileAdd.addEventListener("click", function(){
    
    if(count >= max) {
        alert("첨부파일은 최대 "+ max +"개만 가능");
        return;
    }
    
    // 첫번째 부모태그 = <div id="result'></div> ------> div태그가 이미 실제로 있는 얘임
    
    // 두번째 부모태그 = <div class="input-group-append"></div> 
    // span 태그 = <span class="input-group-text"></span>
   let parent = document.createElement("div");
   parent.id = "file" + idx;
   parent.classList.add("input-group", "mb-3");

   let input = document.createElement("input");
   input.type = "file";
   input.name = "files";
   input.classList.add("form-control");
   parent.append(input);
   
   let div = document.createElement("div");
   div.classList.add("input-group-append");

   let span = document.createElement("span");
   span.classList.add("input-group-text");
   
   span.innerText = "X";
   span.id = "x";
   span.setAttribute("data-del-id", "file"+idx); // span.setAttribute("글로벌 속성" = 속성값("file"+idx) --> 부모의 id값을 가르킴);

   div.append(span);
   parent.append(div);

   result.append(parent);
   idx++;
   count++;
});
