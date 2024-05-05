// change theme start
let currentTheme = getTheme();
//Auto call and initial set
changeTheme(currentTheme);

console.log(currentTheme);

function changeTheme(){
    // set currentTheme to web page
    document.querySelector("html").classList.add(currentTheme);
    
    //set the listner to change theme button
    const changeThemeButton =document.querySelector('#theme_change');
    changeThemeButton.querySelector('span').textContent = 
    currentTheme == 'light'?'Dark':"Light";

    changeThemeButton.addEventListener('click', (event) =>{
        console.log("Button clicked");
        const oldTheme = currentTheme;
        if(currentTheme == "dark"){
            currentTheme = "light";
        }
        else{
            currentTheme = "dark";
        }

        //update in localstorage 
        setTheme(currentTheme);
        //remove current theme
        document.querySelector("html").classList.remove(oldTheme);
        //set current theme 
        document.querySelector("html").classList.add(currentTheme);

        //change the text of button
        changeThemeButton.querySelector('span').textContent = 
        currentTheme == 'light'?'Dark':"Light";
    })
}

//set theme to local storage
function setTheme(theme){
    localStorage.setItem("theme",theme);
}

//get theme from local storage
function getTheme(){
   let theme = localStorage.getItem("theme");
   //if theme is not null return theme else "light";
   return theme ? theme : "light";
}

// change current page theme
function changePageTheme(theme){
    
}
//change theme end