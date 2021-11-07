const commentBlock = document.querySelector('.comment__block');
const dishCard = document.querySelectorAll('.dish__card');
const confirmCard = document.querySelector('.confirm__card');
const hideBtn = document.querySelector('.hide');
const dishes = document.querySelector('.dishes');

for (let i = 0; i < dishCard.length; i++) {
  dishCard[i].addEventListener('click', (event) => {
    if (event.target.classList == 'confirm') {
      confirmCard.style.display = 'flex';
      console.log('+');
    }
  });
}

dishes.addEventListener('click', (event) => {
  if (event.target.classList == 'hide') {
    confirmCard.style.display == 'none';
  }
});
