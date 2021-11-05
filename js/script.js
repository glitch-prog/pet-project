const body = document.getElementsByTagName('BODY');
const btn = document.getElementById('btn');
const input = document.getElementById('input');
const inputCase = document.querySelector('.input__case');
const commentBlock = document.querySelector('.comment__block');
const dishCard = document.querySelectorAll('.dish__card');
const confirmCard = document.querySelector('.confirm__card');

for (let i = 0; i < dishCard.length; i++) {
  dishCard[i].addEventListener('click', (event) => {
    if (event.target.classList == 'confirm') {
      confirmCard.style.display = 'flex';
      console.log('+');
    }
  });
}
