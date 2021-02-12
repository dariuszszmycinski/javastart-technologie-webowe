function showNewsHeading(){
    let newsHeading = document.getElementById("news");
    console.log(newsHeading.innerHTML);
}
showNewsHeading();

function showFirstNews(){
    let newsList = document.getElementById("news-list");
    console.log(newsList.getElementsByTagName("li")[0].innerHTML)
}
showFirstNews();

function showSportNews(){
    let sportNews = document.querySelectorAll("#sport-list");
    sportNews.forEach(elem => console.log(elem.innerHTML));
}
showSportNews();

function changeHeadings(){
    let news = document.getElementById("news");
    news.innerHTML = "Wesołe Newsy";
    let sport = document.getElementById("sport");
    sport.innerHTML = "Anty Sport";
}
setTimeout(changeHeadings,3000);

function addDynamicClassToH2(){
    let h2Elements = document.getElementsByTagName("h2");
    for(let i=0; i<h2Elements.length; i++){
        const element = h2Elements[i];
        element.classList.add("dynamic");
    }
}
addDynamicClassToH2();

function addDynamicClassToBullets(){
    let secondBullets = document.querySelectorAll("ul > li:nth-child(2");
    const addDynamicClass = element => element.classList.add("dynamic");
    secondBullets.forEach(addDynamicClass);
}
addDynamicClassToBullets();

function addNews() {
    let newsList = document.querySelector("#sport-list");
    let li = document.createElement("li");
    let text = document.createTextNode("Niemcy ponownie mistrzami świata w piłce nożnej");
    li.appendChild(text);
    //2 wersja:
    //li.textContent = "Niemcy ponownie mistrzami świata w piłce nożnej";
    newsList.appendChild(li);
}
addNews();

function removeSecondNews(){
    let secondNews = document.querySelector("#news-list > li:nth-child(2)");
    secondNews.remove();
}
removeSecondNews();