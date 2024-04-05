console.log(sessionStorage.getItem("userid"));

if (sessionStorage.getItem("userid")!=true){
    console.log(sessionStorage.getItem("userid"));
    document.querySelector('.login').style.opacity = '0';
    document.querySelector('.logout').style.display = 'block';
    document.querySelector('.logout').style.top = '0px';
}

document.getElementById('logoutBtn').addEventListener('click',()=>{
    out();
})

function out(){
    console.log('12354');

    // element.classList.remove('logout');
    // sessionStorage.removeItem('userid');
    // sessionStorage.clear();
    document.querySelector('.logout').style.display = 'none';
    document.querySelector('.login').style.display = 'block';
    document.querySelector('.login').style.opacity = '100';
    
    if(sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer') == true){
        console.log('123');
    }
}
window.onload = function(){
    let logout2 = document.querySelector('.logout');

    logout2.addEventListener('click',()=>{
        console.log('123456');
    })
}