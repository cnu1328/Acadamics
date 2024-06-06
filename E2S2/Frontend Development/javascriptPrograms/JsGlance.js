console.log("its working");
function onClickEvent() {
    const e1 = document.createElement("p");
     e1.innerText = 'Clicked The Button';
    document.querySelector('.container').appendchild(e1);
 }

 onClickEvent();
